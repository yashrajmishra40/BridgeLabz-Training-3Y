package core_java.JavaBasics;

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double simpleinterest = (principal*rate*time)/100;
        System.out.println(simpleinterest);
        sc.close();

        
    }
    
}
