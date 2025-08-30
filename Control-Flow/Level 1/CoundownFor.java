package ControlFlow.Level1;

import java.util.Scanner;

public class CoundownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int start = sc.nextInt();

        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff 🚀");
        sc.close();
    }
    
}
