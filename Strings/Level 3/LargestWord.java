package StringAssignment.Level3;

import java.util.Scanner;

public class LargestWord {
    public static String findLargestWord(String text) {
        String[] words = text.split("\\s+");
        String largest = "";
        for (String word : words) {
            if (word.length() > largest.length()) {
                largest = word;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String largest = findLargestWord(input);
        System.out.println("Largest word: " + largest);
        System.out.println("Length: " + largest.length());
        sc.close();
    }
}

