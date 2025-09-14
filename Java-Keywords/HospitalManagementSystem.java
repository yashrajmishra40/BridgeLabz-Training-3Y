class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    public final int patientID;

    // Constructor using 'this'
    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName + ", Name: " + name +
                               ", Age: " + age + ", Ailment: " + ailment +
                               ", PatientID: " + patientID);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Alex", 30, "Flu", 501);
        Patient p2 = new Patient("Sophia", 25, "Injury", 502);

        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();
    }
}
