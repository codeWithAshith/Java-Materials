package SolarToyCar;

public interface SolarPanel {
    int numPanels = 2;
    void chargeBattery();
    void moveWithSolarEnergy(double distance);
    void turnWithSolarEnergy(double angle);
}
