package StringAssignment.Level2;

import java.util.Scanner;

public class ShortestLongest {
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) { text.charAt(count); count++; }
        } catch (StringIndexOutOfBoundsException e) { return count; }
    }

    public static String[] customSplit(String text) {
        int length = customLength(text);
        int spaces = 0;
        for (int i = 0; i < length; i++) if (text.charAt(i) == ' ') spaces++;
        String[] words = new String[spaces + 1];
        int idx = 0;
        String current = "";
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == ' ') { words[idx++] = current; current = ""; }
            else current += c;
        }
        words[idx] = current;
        return words;
    }

    public static String[] shortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (customLength(w) < customLength(shortest)) shortest = w;
            if (customLength(w) > customLength(longest)) longest = w;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[] result = shortestLongest(words);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
        sc.close();
    }
}
