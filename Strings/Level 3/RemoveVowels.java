package StringAssignment.Level3;

import java.util.Scanner;

public class RemoveVowels {
    public static String removeVowels(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!"AEIOUaeiou".contains(String.valueOf(c))) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = removeVowels(input);
        System.out.println("String without vowels: " + result);
        sc.close();
    }
}

