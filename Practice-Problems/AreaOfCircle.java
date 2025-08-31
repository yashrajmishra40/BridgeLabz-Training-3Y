package core_java.JavaBasics;
import java.util.Scanner;
import java.lang.Math;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        float area = (float) (Math.PI * radius * radius);
        System.out.println("Area of Circle is: " + area);
        sc.close();
    }
}
