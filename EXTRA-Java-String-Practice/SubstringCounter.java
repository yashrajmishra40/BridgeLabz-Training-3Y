package ExtraString;

import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainStr = scanner.nextLine();
        System.out.println("Enter the substring to find:");
        String subStr = scanner.nextLine();
        scanner.close();

        int count = 0;
        int index = 0;
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        System.out.println("The substring '" + subStr + "' occurs " + count + " times.");
    }
}
