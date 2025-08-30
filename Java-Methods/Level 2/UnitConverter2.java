package JavaMethod.Level2;
public class UnitConverter2 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("2 Yards in Feet: " + convertYardsToFeet(2));
        System.out.println("9 Feet in Yards: " + convertFeetToYards(9));
        System.out.println("1 Meter in Inches: " + convertMetersToInches(1));
        System.out.println("20 Inches in Meters: " + convertInchesToMeters(20));
        System.out.println("15 Inches in Cm: " + convertInchesToCm(15));
    }
}

