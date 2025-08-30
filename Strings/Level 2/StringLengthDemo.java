package StringAssignment.Level2;

import java.util.Scanner;

public class StringLengthDemo {
    // Method to calculate length without using length()
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception when out of bounds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int userDefined = customLength(text);
        int builtIn = text.length();

        System.out.println("User-defined length: " + userDefined);
        System.out.println("Built-in length(): " + builtIn);
        sc.close();
    }
}

