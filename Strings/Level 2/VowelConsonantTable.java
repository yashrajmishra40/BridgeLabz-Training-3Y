package StringAssignment.Level2;

import java.util.Scanner;

public class VowelConsonantTable {
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32); // convert uppercase to lowercase
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] charTypeTable(String text) {
        String[][] table = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            table[i][0] = String.valueOf(c);
            table[i][1] = checkCharType(c);
        }
        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = charTypeTable(text);
        displayTable(result);
        sc.close();
    }
}
