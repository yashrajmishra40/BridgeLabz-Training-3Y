package ExtraString;

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();

        int[] freq = new int[256];
        for (char c : input.toCharArray()) {
            freq[c]++;
        }

        int maxFreq = -1;
        char mostFrequent = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequent = (char) i;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
