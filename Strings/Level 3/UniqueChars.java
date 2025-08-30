package StringAssignment.Level3;

import java.util.Scanner;

public class UniqueChars {
    public static void findUnique(String text) {
        boolean[] seen = new boolean[256];
        System.out.print("Unique characters: ");
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!seen[c]) {
                System.out.print(c + " ");
                seen[c] = true;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        findUnique(input);
        sc.close();
    }
}

