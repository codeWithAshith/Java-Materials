package TaxiBookingApplication;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //create 4 taxis
        List<Taxi> taxis = createTaxis(4);

        Scanner scanner = new Scanner(System.in);
        int id = 1;

        while (true) {
            System.out.println("WELCOME!!!");
            System.out.println("1. Book Taxi");
            System.out.println("2. Print Taxi details");
            System.out.println("***--------------------***");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    //get details from customers
                    int customerID = id;
                    System.out.println("Enter Pickup point");
                    char pickupPoint = scanner.next().charAt(0);
                    System.out.println("Enter Drop point");
                    char dropPoint = scanner.next().charAt(0);
                    System.out.println("Enter Pickup time");
                    int pickupTime = scanner.nextInt();

                    //check if pickup and drop points are valid
                    if (pickupPoint < 'A' || dropPoint > 'F' || pickupPoint > 'F' || dropPoint < 'A') {
                        System.out.println("Valid pickup and drop are A, B, C, D, E, F.");
                        System.out.println("Exiting...");
                        return;
                    }

                    //check if pickup and drop points are same
                    if (pickupPoint == dropPoint) {
                        System.out.println("Pickup and drop cannot be the same point.");
                        System.out.println("Exiting...");
                        return;
                    }

                    // get all free taxis that can reach customer on or before pickup time
                    List<Taxi> freeTaxis = getFreeTaxis(taxis, pickupTime, pickupPoint);

                    //no free taxi means we cannot allot, exit!
                    if (freeTaxis.size() == 0) {
                        System.out.println("No Taxi can be allocated.");
                        System.out.println("Exiting...");
                        return;
                    }

                    //sort taxis based on earnings
                    freeTaxis.sort(Comparator.comparingInt(Taxi::getTotalEarnings));

                    //get free Taxi nearest to us
                    bookTaxi(customerID, pickupPoint, dropPoint, pickupTime, freeTaxis);
                    id++;
                    break;
                }
                case 2: {
                    //two functions to print details
                    System.out.println("Tax Earnings");
                    for (Taxi t : taxis)
                        t.printTaxiDetails();
                    for (Taxi t : taxis)
                        t.printDetails();
                    break;
                }
                default:
                    return;
            }

        }
    }

    private static void bookTaxi(int customerID, char pickupPoint,
                                 char dropPoint, int pickupTime, List<Taxi> freeTaxis) {
        // to find nearest
        int min = 999;

        //this trip earning
        int earning = 0;

        //when taxi will be free next
        int nextFreeTime = 0;

        //where taxi is after trip is over
        char nextSpot = 'Z';

        //booked taxi
        Taxi bookedTaxi = null;

        //all details of current trip as string
        String tripDetail = "";

        for (Taxi t : freeTaxis) {
            int distanceBetweenCustomerAndTaxi =
                    Math.abs((t.getCurrentSpot() - '0') - (pickupPoint - '0')) * 15;

            if (distanceBetweenCustomerAndTaxi < min) {
                bookedTaxi = t;
                // distance between pickup and drop = (drop - pickup) * 15KM
                int distanceBetweenPickUpAndDrop =
                        Math.abs((dropPoint - '0') - (pickupPoint - '0')) * 15;

                // trip earning = 100 + (distance Between pickUp and Drop - 5) * 10
                earning = (distanceBetweenPickUpAndDrop - 5) * 10 + 100;

                // drop time calculation
                int dropTime = pickupTime + distanceBetweenPickUpAndDrop / 15;

                // when taxi will be free next
                nextFreeTime = dropTime;

                // taxi will be at drop point after trip
                nextSpot = dropPoint;

                // creating trip detail
                tripDetail = customerID + "               " + customerID + "          "
                        + pickupPoint + "        " + dropPoint + "       "
                        + pickupTime + "             " + dropTime + "       " + earning;
                min = distanceBetweenCustomerAndTaxi;
            }

        }

        if (bookedTaxi != null) {
            //setting corresponding details to allotted taxi
            bookedTaxi.setDetails(nextSpot, nextFreeTime,
                    bookedTaxi.getTotalEarnings() + earning, tripDetail);

            //BOOKED SUCCESSFULLY
            System.out.println("Taxi " + bookedTaxi.getId() + " booked");
            System.out.println("*********************");
        }
    }

    private static List<Taxi> getFreeTaxis(List<Taxi> taxis, int pickupTime, char pickupPoint) {
        List<Taxi> freeTaxis = new ArrayList<>();
        for (Taxi t : taxis) {
            //taxi should be free
            //taxi should have enough time to reach customer before pickuptime


//            System.out.println("t.getCurrentSpot() - '0' - " + (t.getCurrentSpot() - '0'));
//            System.out.println("pickupPoint - '0' - " + (pickupPoint - '0'));
//            System.out.println("Math - "
//                    + Math.abs((t.getCurrentSpot() - '0') - (pickupPoint - '0')));

            // Free
            // freeTime = 9
            // pickupTime = 10
            // Pickup = A
            // currentSpot = A
            // Drop = B

            // 9 <= 10 && ( 1 - 1 ) <= ( 10 - 9)
            // 9 <= 10 && 0 <= 1 => true

            // Busy
            // freeTime = 11
            // pickupTime = 10
            // Pickup = A
            // currentSpot = A
            // Drop = B

            // 11 <= 10 && ( 1 - 1 ) <= ( 10 - 11)
            // 11 <= 10 && 0 <= -1 => false

            // Unable to reach on time
            // freeTime = 9
            // pickupTime = 10
            // Pickup = C
            // currentSpot = A
            // Drop = B

            // 9 <= 10 && abs( 1 - 3 ) <= ( 10 - 9)
            // 9 <= 10 && 2 <= 1 => false

            if (t.getFreeTime() <= pickupTime &&
                    (Math.abs((t.getCurrentSpot() - '0') - (pickupPoint - '0'))
                            <= pickupTime - t.getFreeTime()))
                freeTaxis.add(t);

        }
        return freeTaxis;
    }

    private static List<Taxi> createTaxis(int count) {
        List<Taxi> taxis = new ArrayList<Taxi>();
        for (int i = 1; i <= count; i++) {
            Taxi t = new Taxi(i);
            taxis.add(t);
        }
        return taxis;
    }
}
