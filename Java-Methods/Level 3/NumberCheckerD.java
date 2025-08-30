package JavaMethod.Level3;
public class NumberCheckerD {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int n) {
        int sq = n * n;
        int sum = 0;
        while (sq > 0) { sum += sq % 10; sq /= 10; }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        int t = Math.abs(n);
        if (t == 0) prod = 0;
        while (t > 0) { int d = t % 10; sum += d; prod *= d; t /= 10; }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        long sq = 1L * n * n;
        String s = Long.toString(sq), t = Integer.toString(n);
        return s.endsWith(t);
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || Math.abs(n) % 10 == 7;
    }

    // Demo
    public static void main(String[] args) {
        int[] tests = {2, 4, 7, 5, 6, 25};
        for (int t : tests) {
            System.out.println("n=" + t + " prime=" + isPrime(t) + " neon=" + isNeon(t)
                    + " spy=" + isSpy(t) + " automorphic=" + isAutomorphic(t) + " buzz=" + isBuzz(t));
        }
    }
}
