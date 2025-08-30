package JavaMethod.Level1;
import java.util.Scanner;

public class DivisionQuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int number = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        int[] qr = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + qr[0]);
        System.out.println("Remainder: " + qr[1]);
        scanner.close();
    }
}

