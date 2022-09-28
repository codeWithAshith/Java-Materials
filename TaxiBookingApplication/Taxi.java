package TaxiBookingApplication;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
    private int id;

    private char currentSpot;
    private int freeTime;
    private int totalEarnings;
    private List<String> trips;

    public Taxi(int id) {
        this.id = id;
        this.currentSpot = 'A'; //start point A
        this.freeTime = 6; //example 6 AM
        this.totalEarnings = 0;
        this.trips = new ArrayList<>();
    }

    public void setDetails(char currentSpot, int freeTime,
                           int totalEarnings, String tripDetail) {
        this.currentSpot = currentSpot;
        this.freeTime = freeTime;
        this.totalEarnings = totalEarnings;
        this.trips.add(tripDetail);
    }

    public void printDetails() {
        //print all trips details
        if (trips.size() > 0) {
            System.out.println("Booking History");
            System.out.println("Taxi - " + this.id + " Total Earnings - " + this.totalEarnings);
            System.out.println("TaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");
            for (String trip : this.trips) {
                System.out.println(id + "          " + trip);
            }
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }

    public void printTaxiDetails() {
        //print total earning and taxi details like current location and free time
        System.out.println("Taxi - " + this.id + " Total Earnings - " + this.totalEarnings + " Current spot - " + this.currentSpot + " Free Time - " + this.freeTime);
    }

    public int getId() {
        return id;
    }

    public char getCurrentSpot() {
        return currentSpot;
    }

    public int getFreeTime() {
        return freeTime;
    }

    public int getTotalEarnings() {
        return totalEarnings;
    }

}
