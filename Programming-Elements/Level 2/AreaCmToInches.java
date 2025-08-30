package JavaProgrammingElements.Level2;

import java.util.Scanner;

public class AreaCmToInches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in centimeters: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaInches2 = areaCm2 / (2.54 * 2.54); // 1 in = 2.54 cm → 1 in² = 2.54² cm²

        System.out.println("The Area of the triangle in sq in is " + areaInches2 + " and sq cm is " + areaCm2);

        input.close();
    }
    
}
