package core_java.JavaBasics;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int result = (int) Math.pow(base, exponent);
        System.out.println("Result of " + base + " raised to the power of " + exponent + " is: " + result);
        sc.close();
    }
    
    
}
