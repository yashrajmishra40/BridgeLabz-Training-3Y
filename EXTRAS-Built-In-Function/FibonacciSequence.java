package ExtraBuiltIn;
import java.util.Scanner;

public class FibonacciSequence {

    public static void generateFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        generateFibonacci(terms);

        scanner.close();
    }
}
