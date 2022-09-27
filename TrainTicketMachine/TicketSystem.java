package TrainTicketMachine;

public class TicketSystem {
    public static double getCharge(Location place, boolean isAdult, int numberOfTickets) {
        double basicCharge = 0.0;
        double totalCharge = 0.0;
        switch (place) {
            case CHENNAI -> basicCharge = 100;
            case DINDIGUL -> basicCharge = 120;
            case KANIYAKUMARI -> basicCharge = 200;
            case KARUR -> basicCharge = 160;
            case TRICHY -> basicCharge = 180;
            default -> {
            }
        }
        if (!isAdult) {
            basicCharge *= 0.9;
        }
        totalCharge = basicCharge * numberOfTickets;
        return totalCharge;
    }
}
