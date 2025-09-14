package OOPsMain;
abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public abstract double calculateFare(double distance);
    public void getVehicleDetails() { System.out.println(driverName + " driving " + vehicleId); }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Auto extends RideVehicle implements GPS {
    public Auto(String id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return distance * 10; }
    public String getCurrentLocation() { return "Station"; }
    public void updateLocation(String loc) { System.out.println("Updated to " + loc); }
}
