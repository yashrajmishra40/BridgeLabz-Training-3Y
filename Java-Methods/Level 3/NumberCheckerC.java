package JavaMethod.Level3;
import java.util.Arrays;

public class NumberCheckerC {

    public static int[] digitsArray(long n) {
        n = Math.abs(n);
        if (n == 0) return new int[]{0};
        int len = (int) Math.floor(Math.log10(n)) + 1;
        int[] d = new int[len];
        long t = n;
        for (int i = len - 1; i >= 0; i--) { d[i] = (int) (t % 10); t /= 10; }
        return d;
    }

    public static int[] reverseArray(int[] arr) {
        int[] r = new int[arr.length];
        for (int i = 0; i < arr.length; i++) r[i] = arr[arr.length - 1 - i];
        return r;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(long n) {
        int[] d = digitsArray(n);
        return arraysEqual(d, reverseArray(d));
    }

    public static boolean isDuck(long n) {
        int[] d = digitsArray(n);
        for (int x : d) if (x == 0) return true;
        return false;
    }

    // Demo
    public static void main(String[] args) {
        long n = 1221;
        int[] d = digitsArray(n);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Reversed: " + Arrays.toString(reverseArray(d)));
        System.out.println("Equal: " + arraysEqual(d, reverseArray(d)));
        System.out.println("Is palindrome: " + isPalindrome(n));
        System.out.println("Is duck: " + isDuck(n));
    }
}
