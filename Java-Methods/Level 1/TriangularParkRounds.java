package JavaMethod.Level1;

import java.util.Scanner;

public class TriangularParkRounds {
    public static int roundsForFiveKilometers(double sideA, double sideB, double sideC) {
        double perimeter = sideA + sideB + sideC;
        if (perimeter <= 0) return 0;
        return (int) Math.ceil(5000.0 / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): ");
        double a = scanner.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double b = scanner.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double c = scanner.nextDouble();

        int rounds = roundsForFiveKilometers(a, b, c);
        System.out.println("Rounds required to complete 5 km: " + rounds);
        scanner.close();
    }
}
