package Constructors.Level1;
// 2. Circle class with constructor chaining
class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // calls parameterized constructor
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Circle radius: " + radius);
    }
}