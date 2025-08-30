package StringAssignment.Level2;

import java.util.Random;

public class VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90); // random age 0–89
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] table = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            table[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) table[i][1] = "Can Vote";
            else table[i][1] = "Cannot Vote";
        }
        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tEligibility");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] table = checkVotingEligibility(ages);
        displayTable(table);
    }
}

