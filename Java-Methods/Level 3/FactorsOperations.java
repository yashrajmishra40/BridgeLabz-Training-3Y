package JavaMethod.Level3;
import java.util.ArrayList;
import java.util.List;

public class FactorsOperations {

    public static int[] factors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) if (n % i == 0) list.add(i);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int greatestFactor(int[] facs) {
        return facs[facs.length - 1]; // because factors are in ascending order
    }

    public static long sum(int[] arr) {
        long s = 0;
        for (int v : arr) s += v;
        return s;
    }

    public static long product(int[] arr) {
        long p = 1;
        for (int v : arr) p *= v;
        return p;
    }

    public static long productOfCubes(int[] arr) {
        long p = 1;
        for (int v : arr) p *= Math.pow(v, 3);
        return p;
    }

    public static void main(String[] args) {
        int n = 12;
        int[] f = factors(n);
        System.out.print("Factors: ");
        for (int x : f) System.out.print(x + " ");
        System.out.println();
        System.out.println("Greatest factor: " + greatestFactor(f));
        System.out.println("Sum: " + sum(f));
        System.out.println("Product: " + product(f));
        System.out.println("Product of cubes: " + productOfCubes(f));
    }
}

