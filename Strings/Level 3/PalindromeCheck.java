package StringAssignment.Level3;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Palindrome? " + isPalindrome(input));
        sc.close();
    }
}

