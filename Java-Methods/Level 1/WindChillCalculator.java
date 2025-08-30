package JavaMethod.Level1;
import java.util.Scanner;

public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        double vPow = Math.pow(windSpeed, 0.16);
        return 35.74 + 0.6215 * temperature - 35.75 * vPow + 0.4275 * temperature * vPow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Enter wind speed: ");
        double wind = scanner.nextDouble();

        double windChill = calculateWindChill(temp, wind);
        System.out.println(String.format("Wind chill temperature: %.2f", windChill));
        scanner.close();
    }
}

