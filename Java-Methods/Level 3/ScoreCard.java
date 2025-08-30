package JavaMethod.Level3;
import java.util.Random;

public class ScoreCard {

    public static int[][] generateMarks(int students) {
        Random r = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = r.nextInt(41) + 60; // 60..100
            marks[i][1] = r.nextInt(41) + 60;
            marks[i][2] = r.nextInt(41) + 60;
        }
        return marks;
    }

    public static double[][] computeResults(int[][] marks) {
        int n = marks.length;
        double[][] res = new double[n][3]; // total, avg, percent
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = (double) total / 3.0;
            double pct = (double) total / 300.0 * 100.0;
            res[i][0] = total;
            res[i][1] = Math.round(avg * 100.0) / 100.0;
            res[i][2] = Math.round(pct * 100.0) / 100.0;
        }
        return res;
    }

    public static void display(int[][] marks, double[][] res) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\t");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t%d\t%.0f\t%.2f\t%.2f%n",
                    marks[i][0], marks[i][1], marks[i][2],
                    res[i][0], res[i][1], res[i][2]);
        }
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] marks = generateMarks(students);
        double[][] results = computeResults(marks);
        display(marks, results);
    }
}
