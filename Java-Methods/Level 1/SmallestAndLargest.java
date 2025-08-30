package JavaMethod.Level1;

import java.util.Scanner;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;

        int largest = number1;
        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
        scanner.close();
    }
}

