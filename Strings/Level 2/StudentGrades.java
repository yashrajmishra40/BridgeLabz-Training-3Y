package StringAssignment.Level2;

import java.util.*;

public class StudentGrades {
    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3]; // Physics, Chem, Math
        for (int i = 0; i < students; i++) {
            marks[i][0] = rand.nextInt(41) + 60; // 60–100
            marks[i][1] = rand.nextInt(41) + 60;
            marks[i][2] = rand.nextInt(41) + 60;
        }
        return marks;
    }

    public static Object[][] calculateResults(int[][] marks) {
        Object[][] results = new Object[marks.length][6]; 
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            results[i][0] = marks[i][0];
            results[i][1] = marks[i][1];
            results[i][2] = marks[i][2];
            results[i][3] = total;
            results[i][4] = Math.round(avg * 100.0) / 100.0;
            results[i][5] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] assignGrades(Object[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double perc = (double) results[i][5];
            if (perc >= 90) grades[i] = "A+";
            else if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayReport(Object[][] results, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < results[i].length; j++) {
                System.out.print(results[i][j] + "\t");
            }
            System.out.println(grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        Object[][] results = calculateResults(marks);
        String[] grades = assignGrades(results);
        displayReport(results, grades);
        sc.close();
    }
}
