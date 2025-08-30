package StringAssignment.Level3;

import java.util.Scanner;

public class CountCharacters {
    public static void count(String text) {
        int digits = 0, letters = 0, special = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) digits++;
            else if (Character.isLetter(c)) letters++;
            else special++;
        }
        System.out.println("Alphabets: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        count(input);
        sc.close();
    }
}
