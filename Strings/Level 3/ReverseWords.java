package StringAssignment.Level3;
import java.util.Scanner;

public class ReverseWords {
    public static String reverseEachWord(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Reversed words: " + reverseEachWord(input));
        sc.close();
    }
}
