package core_java.JavaBasics;
import java.util.Scanner;
public class CelsiusToFarehn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celcius = sc.nextInt();
        float fahrenheit = (celcius * 9/5) + 32;
        System.out.println("Fahrenheit is: " + fahrenheit);
        sc.close();
        
    }
    
}
