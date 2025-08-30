package StringAssignment.Level3;

import java.util.Scanner;

public class PangramCheck {
    public static boolean isPangram(String text) {
        text = text.toLowerCase();
        boolean[] letters = new boolean[26];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letters[c - 'a'] = true;
            }
        }
        for (boolean present : letters) {
            if (!present) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Is Pangram? " + isPangram(input));
        sc.close();
    }
}

