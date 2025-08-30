package JavaMethod.Level2;
public class UnitConverter3 {
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9.0;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5.0) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("98 F in C: " + convertFahrenheitToCelsius(98));
        System.out.println("37 C in F: " + convertCelsiusToFahrenheit(37));
        System.out.println("100 Pounds in Kg: " + convertPoundsToKg(100));
        System.out.println("50 Kg in Pounds: " + convertKgToPounds(50));
        System.out.println("10 Gallons in Liters: " + convertGallonsToLiters(10));
        System.out.println("25 Liters in Gallons: " + convertLitersToGallons(25));
    }
}
