package TrainTicketMachine;

import static TrainTicketMachine.Location.CHENNAI;

public class Main {
    public static void main(String[] args) {
        int numOfTickets = 2;
        double charge = TicketSystem.getCharge(CHENNAI, true, numOfTickets);
        System.out.println("Total to paid for " + numOfTickets + " to " + CHENNAI + " is ₹" + charge);
    }
}
