class Student {
    static String universityName = "Global University";
    private static int totalStudents = 0;

    private String name;
    public final int rollNumber;
    private char grade;

    // Constructor using 'this'
    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName + ", Name: " + name +
                               ", RollNo: " + rollNumber + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Mike", 401, 'A');
        Student s2 = new Student("Emma", 402, 'B');

        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
}
