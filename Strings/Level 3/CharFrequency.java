package StringAssignment.Level3;

import java.util.Scanner;

public class CharFrequency {
    public static void findFrequency(String text) {
        int[] count = new int[256];
        for (int i = 0; i < text.length(); i++) {
            count[text.charAt(i)]++;
        }
        System.out.println("Character Frequencies:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " → " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        findFrequency(input);
        sc.close();
    }
}

