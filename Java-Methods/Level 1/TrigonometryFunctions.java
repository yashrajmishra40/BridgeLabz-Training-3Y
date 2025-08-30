package JavaMethod.Level1;
import java.util.Scanner;

public class TrigonometryFunctions {
    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] values = calculateTrigonometricFunctions(angle);
        System.out.println(String.format("sin(%.2f) = %.6f", angle, values[0]));
        System.out.println(String.format("cos(%.2f) = %.6f", angle, values[1]));
        System.out.println(String.format("tan(%.2f) = %.6f", angle, values[2]));
        scanner.close();
    }
}

