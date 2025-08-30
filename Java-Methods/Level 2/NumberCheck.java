package JavaMethod.Level2;
import java.util.Scanner;

public class NumberCheck {
    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        if (num1 == num2) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                if (isEven(arr[i])) {
                    System.out.println(arr[i] + " is Positive Even");
                } else {
                    System.out.println(arr[i] + " is Positive Odd");
                }
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        int result = compare(arr[0], arr[arr.length - 1]);
        if (result == 0) System.out.println("First and last are Equal");
        else if (result > 0) System.out.println("First is Greater");
        else System.out.println("First is Smaller");

        sc.close();
    }
}
