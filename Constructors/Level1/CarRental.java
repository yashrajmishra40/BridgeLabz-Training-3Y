package Constructors.Level1;
// 6. Car Rental System
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final double COST_PER_DAY = 1000.0;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * COST_PER_DAY;
    }

    void display() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays + " days. Total: " + calculateCost());
    }
}