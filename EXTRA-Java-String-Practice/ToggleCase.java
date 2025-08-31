package ExtraString;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to toggle its case:");
        String input = scanner.nextLine();
        scanner.close();

        String toggled = "";
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                toggled += Character.toUpperCase(c);
            } else {
                toggled += c;
            }
        }

        System.out.println("Toggled case string: " + toggled);
    }
}