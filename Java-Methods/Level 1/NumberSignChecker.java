package JavaMethod.Level1;

import java.util.Scanner;

public class NumberSignChecker {
    public static int checkSign(int number) {
        if (number > 0) return 1;
        if (number < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = scanner.nextInt();

        int result = checkSign(value);
        System.out.println(result);
        scanner.close();
    }
}
