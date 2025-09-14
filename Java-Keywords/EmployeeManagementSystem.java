class Employee {
    static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    private String name;
    public final int id;
    private String designation;

    // Constructor using 'this'
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + ", Name: " + name +
                               ", ID: " + id + ", Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 201, "Developer");
        Employee e2 = new Employee("Sara", 202, "Manager");

        e1.displayDetails();
        e2.displayDetails();
        Employee.displayTotalEmployees();
    }
}
