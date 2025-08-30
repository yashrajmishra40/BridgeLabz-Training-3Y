package JavaMethod.Level2;

import java.util.Scanner;

public class NaturalNumberSum {

    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            scanner.close();
            return;
        }

        int recursiveResult = sumRecursive(n);
        int formulaResult = sumFormula(n);

        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula: " + formulaResult);
        scanner.close();
    }
}

