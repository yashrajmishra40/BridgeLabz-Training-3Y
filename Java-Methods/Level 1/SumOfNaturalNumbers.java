package JavaMethod.Level1;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static long sumNatural(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        long sum = sumNatural(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        scanner.close();
    }
}
