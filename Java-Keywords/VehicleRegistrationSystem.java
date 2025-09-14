class Vehicle {
    static double registrationFee = 5000.0;

    private String ownerName;
    private String vehicleType;
    public final String registrationNumber;

    // Constructor using 'this'
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType +
                               ", RegNo: " + registrationNumber +
                               ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Sam", "Car", "REG101");
        Vehicle v2 = new Vehicle("Lily", "Bike", "REG102");

        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateRegistrationFee(6000);
        v1.displayDetails();
    }
}

