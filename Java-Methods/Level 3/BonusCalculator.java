package JavaMethod.Level3;
import java.util.Random;

public class BonusCalculator {

    public static double[][] generateEmployees(int n) {
        Random r = new Random();
        double[][] data = new double[n][2]; // [salary, years]
        for (int i = 0; i < n; i++) {
            data[i][0] = r.nextInt(90000) + 10000; // 10000..99999 (5-digit approx)
            data[i][1] = r.nextInt(11); // 0..10 years
        }
        return data;
    }

    public static double[][] applyBonus(double[][] emp) {
        int n = emp.length;
        double[][] out = new double[n][3]; // oldSalary, bonus, newSalary
        for (int i = 0; i < n; i++) {
            double old = emp[i][0];
            double years = emp[i][1];
            double rate = years > 5 ? 0.05 : 0.02;
            double bonus = old * rate;
            double newsal = old + bonus;
            out[i][0] = old;
            out[i][1] = bonus;
            out[i][2] = newsal;
        }
        return out;
    }

    public static void main(String[] args) {
        int n = 10;
        double[][] employees = generateEmployees(n);
        double[][] updated = applyBonus(employees);
        double sumOld = 0, sumNew = 0, totalBonus = 0;
        System.out.println("Old\tYears\tBonus\tNew");
        for (int i = 0; i < n; i++) {
            double old = employees[i][0], years = employees[i][1];
            double bonus = updated[i][1], newsal = updated[i][2];
            System.out.printf("%.0f\t%.0f\t%.2f\t%.2f%n", old, years, bonus, newsal);
            sumOld += old; sumNew += newsal; totalBonus += bonus;
        }
        System.out.println("Sum Old Salary: " + Math.round(sumOld));
        System.out.println("Sum New Salary: " + Math.round(sumNew));
        System.out.println("Total Bonus   : " + Math.round(totalBonus));
    }
}
