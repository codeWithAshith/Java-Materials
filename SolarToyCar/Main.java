package SolarToyCar;

public class Main {
    public static void main(String[] args) {
        SolarToyCar solarToyCar = new SolarToyCar();
        System.out.println("Solar Toy Car");
        solarToyCar.chargingBattery();
        System.out.println("Battery level:- " + solarToyCar.getBatteryLevel());
        solarToyCar.turn(Direction.LEFT, 45);
        System.out.println("Battery level:- " + solarToyCar.getBatteryLevel());
        solarToyCar.goForward(30);
        System.out.println("Battery level:- " + solarToyCar.getBatteryLevel());
        solarToyCar.turnWithSolarEnergy(45);
        System.out.println("Battery level:- " + solarToyCar.getBatteryLevel());
        solarToyCar.moveWithSolarEnergy(100);
        System.out.println("Battery level:- " + solarToyCar.getBatteryLevel());
        solarToyCar.chargeBattery();
        System.out.println("Battery level:- " + solarToyCar.getBatteryLevel());

    }
}
