package OOPsMain;
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String n, int a) { this.patientId = id; this.name = n; this.age = a; }
    public abstract double calculateBill();
    public void getPatientDetails() { System.out.println(name + " (" + age + ")"); }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    public InPatient(int id, String n, int a) { super(id, n, a); }
    public double calculateBill() { return 5000; }
    public void addRecord(String r) { System.out.println("Record added: " + r); }
    public void viewRecords() { System.out.println("Viewing records"); }
}

