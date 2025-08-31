package ExtraString;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        System.out.println("Enter the character to remove:");
        char charToRemove = scanner.next().charAt(0);
        scanner.close();

        String result = "";
        for (char c : input.toCharArray()) {
            if (c != charToRemove) {
                result += c;
            }
        }

        System.out.println("Modified String: " + result);
    }
}