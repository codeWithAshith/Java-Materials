package SolarToyCar;

public class SolarToyCar extends ToyCar implements SolarPanel {
    @Override
    public void chargeBattery() {
        System.out.println("Charging battery with " + numPanels + " solar panel");
        batteryLevel = fullBattery;
    }

    @Override
    public void moveWithSolarEnergy(double distance) {
        System.out.println("Move for distance " + distance + " meters without using battery power");
    }

    @Override
    public void turnWithSolarEnergy(double angle) {
        System.out.println("Turn for angle " + angle + " degree without using battery power");
    }
}
