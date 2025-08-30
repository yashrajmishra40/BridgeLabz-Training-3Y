import java.util.Scanner;

public class FeetToYardsAndMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3.0;          // 1 yard = 3 feet
        double miles = yards / 1760.0;      // 1 mile = 1760 yards

        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);

        input.close();
    }
    
}
