package SolarToyCar;

public class ToyCar {
    protected double batteryLevel;
    protected final double fullBattery = 1000;

    public ToyCar() {
        batteryLevel = fullBattery;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void goForward(double distance) {
        System.out.println("Go forward distance " + distance + " meters");
        batteryLevel -= distance;
    }

    public void turn(Direction direction, double angle) {
        System.out.println("Turn " + direction + " by angle " + angle + " degree");
        batteryLevel -= angle;
    }

    public void chargingBattery() {
        System.out.println("Charging battery");
        batteryLevel = fullBattery;
    }

}
