package RailwayTicketReservationApplication;

public class Passenger {
    static int id = 0;
    String name;
    int age;
    // U or L or M
    String berthPreference;
    int passengerId;
    //alloted type (L,U,M,RAC,WL)
    String alloted;
    int number;

    public Passenger(String name, int age, String berthPreference) {
        this.name = name;
        this.age = age;
        this.berthPreference = berthPreference;
        this.passengerId = id + 1;
        alloted = "";
        number = -1;
    }
}
