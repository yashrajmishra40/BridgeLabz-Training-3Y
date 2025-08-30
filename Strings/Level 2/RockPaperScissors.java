package StringAssignment.Level2;

import java.util.*;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int rand = (int) (Math.random() * 3);
        if (rand == 0) return "rock";
        else if (rand == 1) return "paper";
        else return "scissors";
    }

    public static int findWinner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return 1;
        return -1;
    }

    public static void displayStats(int userWins, int compWins, int totalGames) {
        System.out.println("\n--- Game Stats ---");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + (totalGames - userWins - compWins));
        System.out.printf("User Win %%: %.2f%%\n", (userWins * 100.0 / totalGames));
        System.out.printf("Computer Win %%: %.2f%%\n", (compWins * 100.0 / totalGames));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many games to play? ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            System.out.println("Computer chose: " + comp);

            int result = findWinner(user, comp);
            if (result == 1) {
                System.out.println("You win!");
                userWins++;
            } else if (result == -1) {
                System.out.println("Computer wins!");
                compWins++;
            } else {
                System.out.println("It's a draw!");
            }
        }

        displayStats(userWins, compWins, n);
        sc.close();
    }
}
