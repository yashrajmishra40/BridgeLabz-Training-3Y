package JavaProgrammingElements.Level2;

import java.util.Scanner;

public class Result2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter double value for num1: ");
        double num1 = input.nextDouble();

        System.out.print("Enter double value for num2: ");
        double num2 = input.nextDouble();

        System.out.print("Enter double value for num3: ");
        double num3 = input.nextDouble();

        double result1 = num1 + num2 * num3;
        double result2 = num1 * num2 + num3;
        double result3 = num3 + num1 / num2;
        double result4 = num1 % num2 + num3; // works with double also

        System.out.println("The results of Double Operations are " 
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
    
}
