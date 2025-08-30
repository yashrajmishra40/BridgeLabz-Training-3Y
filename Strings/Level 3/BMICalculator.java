package StringAssignment.Level3;

import java.util.Scanner;

public class BMICalculator {
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2]; // weight, height
        double[] bmi = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            persons[i][1] = sc.nextDouble();
            bmi[i] = persons[i][0] / Math.pow(persons[i][1] / 100, 2);
        }

        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.1f %-10.1f %-10.2f %-15s\n",
                    persons[i][0], persons[i][1], bmi[i], getStatus(bmi[i]));
        }
        sc.close();
    }
}
