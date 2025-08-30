package JavaProgrammingElements.Level2;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer value for num1: ");
        int num1 = input.nextInt();

        System.out.print("Enter integer value for num2: ");
        int num2 = input.nextInt();

        System.out.print("Enter integer value for num3: ");
        int num3 = input.nextInt();

        int result1 = num1 + num2 * num3;   // multiplication before addition
        int result2 = num1 * num2 + num3;   // multiplication before addition
        int result3 = num3 + num1 / num2;   // division before addition
        int result4 = num1 % num2 + num3;   // modulus before addition

        System.out.println("The results of Int Operations are " 
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        input.close();
    }
}


