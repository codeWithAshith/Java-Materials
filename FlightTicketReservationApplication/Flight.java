package FlightTicketReservationApplication;

import java.util.ArrayList;

public class Flight {
    int flightID;
    int tickets;
    int price;
    ArrayList<String> passengerDetails;
    ArrayList<Integer> passengerIDs;
    ArrayList<Integer> bookedTicketsPerPassenger;
    ArrayList<Integer> passengerCost;

    //constructor to set values
    public Flight(int id) {
        flightID = id;
        tickets = 50;
        price = 5000;
        passengerDetails = new ArrayList<>();
        passengerIDs = new ArrayList<>();
        bookedTicketsPerPassenger = new ArrayList<>();
        passengerCost = new ArrayList<>();
    }

    public void addPassengerDetails(String passengerDetail, int numberOfTickets, int passengerID) {
        passengerDetails.add(passengerDetail);
        passengerIDs.add(passengerID);
        passengerCost.add(price * numberOfTickets);

        //updating price using logic in the problem statement
        price += 200 * numberOfTickets;

        //updating available number of tickets
        tickets -= numberOfTickets;
        bookedTicketsPerPassenger.add(numberOfTickets);
        System.out.println("Booked Successfully!");

    }


    //cancel tickets booked by a passenger ID
    public void cancelTicket(int passengerID) {
        //find the index to remove from all lists
        int indexToRemove = passengerIDs.indexOf(passengerID);
        if (indexToRemove < 0) {
            System.out.println("Passenger ID not found!");
            return;
        }
        int ticketsToCancel = bookedTicketsPerPassenger.get(indexToRemove);

        //increase number of available tickets
        tickets += ticketsToCancel;
        //change price to new value after cancellation
        price -= 200 * ticketsToCancel;

        //calculate refund
        System.out.println("Refund Amount after cancel : " + passengerCost.get(indexToRemove));

        //remove details of passenger from all lists
        bookedTicketsPerPassenger.remove(indexToRemove);
        passengerIDs.remove(Integer.valueOf(passengerID));
        passengerDetails.remove(indexToRemove);
        passengerCost.remove(indexToRemove);

        System.out.println("Cancelled Booked Tickets Successfully!");

    }

    public void flightSummary() {
        System.out.println("Flight ID " + flightID + " --" + "Remaining Tickets " + tickets + " --" +
                "Current Ticket Price " + price);
    }

    public void printDetails() {
        System.out.println("Flight ID " + flightID + ":");
        for (String detail : passengerDetails)
            System.out.println(detail);
    }


}
