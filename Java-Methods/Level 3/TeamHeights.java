package JavaMethod.Level3;
import java.util.Random;

public class TeamHeights {
    public static int[] generateHeights(int n) {
        Random r = new Random();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = r.nextInt(101) + 150; // 150..250
        }
        return h;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v < m) m = v;
        return m;
    }

    public static int max(int[] arr) {
        int M = arr[0];
        for (int v : arr) if (v > M) M = v;
        return M;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();
        System.out.println("Shortest: " + min(heights) + " cm");
        System.out.println("Tallest : " + max(heights) + " cm");
        System.out.printf("Mean    : %.2f cm%n", mean(heights));
    }
}

