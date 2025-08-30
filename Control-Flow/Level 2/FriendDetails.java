package ControlFlow.Level2;

import java.util.Scanner;

public class FriendDetails {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ages
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        // Heights
        System.out.print("Enter height of Amar: ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int heightAnthony = sc.nextInt();

        // Youngest
        if (ageAmar < ageAkbar && ageAmar < ageAnthony)
            System.out.println("Youngest is Amar");
        else if (ageAkbar < ageAnthony)
            System.out.println("Youngest is Akbar");
        else
            System.out.println("Youngest is Anthony");

        // Tallest
        if (heightAmar > heightAkbar && heightAmar > heightAnthony)
            System.out.println("Tallest is Amar");
        else if (heightAkbar > heightAnthony)
            System.out.println("Tallest is Akbar");
        else
            System.out.println("Tallest is Anthony");

        sc.close();
    }
    
}
