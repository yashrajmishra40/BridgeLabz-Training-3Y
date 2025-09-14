package OOPsMain;
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String num, String type, double rate) {
        this.vehicleNumber = num;
        this.type = type;
        this.rentalRate = rate;
    }

    public double getRentalRate() { return rentalRate; }
    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 1000; }
    public String getInsuranceDetails() { return "Standard Car Insurance"; }
}
