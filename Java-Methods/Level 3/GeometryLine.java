package JavaMethod.Level3;
public class GeometryLine {

    public static double euclideanDistance(double x1,double y1,double x2,double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(double x1,double y1,double x2,double y2) {
        double m = (x2 == x1) ? Double.POSITIVE_INFINITY : (y2 - y1) / (x2 - x1);
        double b = (m == Double.POSITIVE_INFINITY) ? Double.NaN : (y1 - m * x1);
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        double x1 = 1, y1 = 2, x2 = 4, y2 = 6;
        System.out.printf("Distance: %.3f%n", euclideanDistance(x1,y1,x2,y2));
        double[] line = lineEquation(x1,y1,x2,y2);
        System.out.println("Slope (m): " + line[0]);
        System.out.println("Intercept (b): " + line[1]);
        if (!Double.isInfinite(line[0])) System.out.printf("Equation: y = %.3fx + %.3f%n", line[0], line[1]);
        else System.out.println("Vertical line: x = " + x1);
    }
}
