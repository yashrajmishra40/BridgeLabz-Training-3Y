package JavaMethod.Level3;
import java.util.Arrays;

public class NumberCheckerB {

    public static int[] digitsArray(long n) {
        n = Math.abs(n);
        if (n == 0) return new int[]{0};
        int len = (int) Math.floor(Math.log10(n)) + 1;
        int[] d = new int[len];
        long t = n;
        for (int i = len - 1; i >= 0; i--) {
            d[i] = (int) (t % 10);
            t /= 10;
        }
        return d;
    }

    public static int sumOfDigits(long n) {
        int[] d = digitsArray(n);
        int s = 0;
        for (int x : d) s += x;
        return s;
    }

    public static int sumOfSquaresOfDigits(long n) {
        int[] d = digitsArray(n);
        int s = 0;
        for (int x : d) s += Math.pow(x, 2);
        return s;
    }

    public static boolean isHarshad(long n) {
        if (n == 0) return false;
        return n % sumOfDigits(n) == 0;
    }

    public static int[][] digitFrequency(long n) {
        int[] freq = new int[10];
        int[] d = digitsArray(n);
        for (int x : d) freq[x]++;
        int nonZero = 0;
        for (int f : freq) if (f > 0) nonZero++;
        int[][] result = new int[nonZero][2];
        int idx = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freq[i];
                idx++;
            }
        }
        return result;
    }

    // Demo
    public static void main(String[] args) {
        long n = 1729;
        System.out.println("Digits: " + Arrays.toString(digitsArray(n)));
        System.out.println("Sum: " + sumOfDigits(n));
        System.out.println("Sum squares: " + sumOfSquaresOfDigits(n));
        System.out.println("Is Harshad: " + isHarshad(n));
        int[][] freq = digitFrequency(n);
        System.out.println("Digit frequencies:");
        for (int[] row : freq) System.out.println(row[0] + " -> " + row[1]);
    }
}
