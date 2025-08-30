package JavaMethod.Level3;

public class NumberCheckerA {

    public static int countDigits(long n) {
        if (n == 0) return 1;
        n = Math.abs(n);
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }

    public static int[] digitsArray(long n) {
        int len = countDigits(n);
        int[] d = new int[len];
        long t = Math.abs(n);
        for (int i = len - 1; i >= 0; i--) {
            d[i] = (int) (t % 10);
            t /= 10;
        }
        return d;
    }

    public static boolean isDuck(long n) {
        int[] d = digitsArray(n);
        for (int digit : d) if (digit == 0) return true;
        return false;
    }

    public static boolean isArmstrong(long n) {
        int[] d = digitsArray(n);
        int power = d.length;
        long sum = 0;
        for (int digit : d) sum += Math.pow(digit, power);
        return sum == Math.abs(n);
    }

    public static int[] largestAndSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v > largest) { second = largest; largest = v; }
            else if (v > second && v != largest) second = v;
        }
        return new int[]{largest, second};
    }

    public static int[] smallestAndSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int v : arr) {
            if (v < smallest) { second = smallest; smallest = v; }
            else if (v < second && v != smallest) second = v;
        }
        return new int[]{smallest, second};
    }

    // Demo main
    public static void main(String[] args) {
        long n = 153; // change to test
        System.out.println("Digits count: " + countDigits(n));
        int[] d = digitsArray(n);
        System.out.print("Digits: ");
        for (int x : d) System.out.print(x);
        System.out.println();
        System.out.println("Is duck: " + isDuck(n));
        System.out.println("Is Armstrong: " + isArmstrong(n));
        int[] arr = {3, 9, 1, 9, 7};
        int[] bigs = largestAndSecondLargest(arr);
        int[] smalls = smallestAndSecondSmallest(arr);
        System.out.println("Largest, 2nd largest: " + bigs[0] + ", " + bigs[1]);
        System.out.println("Smallest, 2nd smallest: " + smalls[0] + ", " + smalls[1]);
    }
}

