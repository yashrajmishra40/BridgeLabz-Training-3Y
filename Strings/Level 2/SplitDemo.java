package StringAssignment.Level2;

import java.util.Scanner;

public class SplitDemo {
    // Method to find length of string (reusing logic)
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split into words without split()
    public static String[] customSplit(String text) {
        int length = customLength(text);
        int spaceCount = 0;

        // Count spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        String current = "";

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                words[wordIndex++] = current;
                current = "";
            } else {
                current += c;
            }
        }
        words[wordIndex] = current;
        return words;
    }

    // Compare two arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] userDefined = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Comparison result: " + compareArrays(userDefined, builtIn));
        sc.close();
    }
}
