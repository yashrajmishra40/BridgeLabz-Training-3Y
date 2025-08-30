package JavaMethod.Level1;

import java.util.Scanner;

public class CombinationOfHandshake {
    public static int calculateHandshakes(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int handshakes = calculateHandshakes(n);
        System.out.println("The number of handshakes possible in a group of " + n + " people is " + handshakes);
        sc.close();
        
    }
}