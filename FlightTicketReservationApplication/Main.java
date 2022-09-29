package FlightTicketReservationApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<>();
        for (int i = 0; i < 2; i++)
            flights.add(new Flight(i + 1));

        int passengerID = 1;

        System.out.println("Welcome");
        while (true) {
            System.out.println("1. Book");
            System.out.println("2. Cancel");
            System.out.println("3. Print");
            System.out.print("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                //book
                case 1 -> {
                    System.out.println("Enter Flight ID");
                    int fid = sc.nextInt();

                    if (fid > flights.size()) {
                        System.out.println("Invalid flight ID");
                        break;
                    }
                    Flight currentFlight = null;
                    for (Flight f : flights) {
                        if (f.flightID == fid) {
                            currentFlight = f;
                            f.flightSummary();
                            break;
                        }
                    }

                    System.out.println("Enter number of tickets");
                    int t = sc.nextInt();

                    if (currentFlight != null && t > currentFlight.tickets) {
                        System.out.println("Not Enough Tickets");
                        break;
                    }
                    // call book function to book tickets
                    book(currentFlight, t, passengerID);

                    //increment passenger ID so that next booking will have different passenger ID value
                    passengerID = passengerID + 1;
                }

                case 2 -> {
                    System.out.print("Enter flight ID to cancel booking: ");
                    int fid = sc.nextInt();
                    System.out.print("Enter passenger ID to cancel booking: ");
                    int pId = sc.nextInt();

                    //check if flight id is valid
                    if (fid > flights.size()) {
                        System.out.println("Invalid flight ID");
                        break;
                    }
                    //find the corresponding flight
                    Flight currentFlight = null;
                    for (Flight f : flights) {
                        if (f.flightID == fid) {
                            currentFlight = f;
                            break;
                        }
                    }

                    if (currentFlight != null) {
                        currentFlight.cancelTicket(pId);
                        currentFlight.flightSummary();
                        currentFlight.printDetails();
                    }
                }

                case 3 -> {
                    for (Flight f : flights) {
                        if (f.passengerDetails.size() == 0) {
                            System.out.println("No passenger Details for  - Flight " + f.flightID);
                        } else {
                            f.printDetails();
                        }
                    }
                }
                default -> {
                }
            }
        }
    }

    public static void book(Flight currentFlight, int tickets, int passengerID) {
        String passengerDetail = "";
        passengerDetail = "Passenger ID " + passengerID + " -- " + " Number of Tickets Booked "
                + tickets + " -- " + "Total cost " + currentFlight.price * tickets;
        currentFlight.addPassengerDetails(passengerDetail, tickets, passengerID);

        currentFlight.flightSummary();
        currentFlight.printDetails();

    }
}
