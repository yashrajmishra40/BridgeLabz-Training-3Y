package ControlFlow.Level1;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        } for(int i =0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        // Calculate sum of all elements
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of all elements: " + sum);

        // Count Armstrong numbers in the array
        int armstrongCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isArmstrong(arr[i])) {
                armstrongCount++;
            }
        }
        System.out.println("Count of Armstrong numbers: " + armstrongCount);
        sc.close();
    }

    // Helper method to check if a number is Armstrong
    private static boolean isArmstrong(int num) {
        int original = num;
        int n = 0, temp = num, sum = 0;
        // Count number of digits
        while (temp != 0) {
            n++;
            temp /= 10;
        }
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }
        return sum == original;
        
    }
}
