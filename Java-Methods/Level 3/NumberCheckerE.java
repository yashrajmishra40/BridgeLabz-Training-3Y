package JavaMethod.Level3;
public class NumberCheckerE {

    public static int sumProperDivisors(int n) {
        if (n <= 1) return 0;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                int d = n / i;
                if (d != i) sum += d;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        return n > 0 && sumProperDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return n > 0 && sumProperDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return n > 0 && sumProperDivisors(n) < n;
    }

    public static int factorial(int x) {
        int f = 1;
        for (int i = 2; i <= x; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int n) {
        int t = Math.abs(n);
        int sum = 0;
        while (t > 0) { sum += factorial(t % 10); t /= 10; }
        return sum == Math.abs(n);
    }

    // Demo
    public static void main(String[] args) {
        int[] tests = {6, 12, 8, 145};
        for (int t : tests) {
            System.out.println(t + " perfect=" + isPerfect(t) + " abundant=" + isAbundant(t)
                    + " deficient=" + isDeficient(t) + " strong=" + isStrong(t));
        }
    }
}
