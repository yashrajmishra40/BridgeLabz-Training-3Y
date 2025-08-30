package ControlFlow.Level1;

import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) sumLoop += i;

            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum (loop) = " + sumLoop);
            System.out.println("Sum (formula) = " + sumFormula);
            System.out.println("Results match? " + (sumLoop == sumFormula));
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
    
}
