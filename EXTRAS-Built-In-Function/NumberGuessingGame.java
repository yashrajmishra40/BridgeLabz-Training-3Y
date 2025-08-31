package ExtraBuiltIn;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback(Scanner scanner, int guess) {
        System.out.print("Is your number " + guess + "? (high/low/correct): ");
        return scanner.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        boolean guessed = false;

        System.out.println("Think of a number between 1 and 100...");

        while (!guessed && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(scanner, guess);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number.");
                guessed = true;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Please enter 'high', 'low', or 'correct'.");
            }
        }
        scanner.close();
    }
}

