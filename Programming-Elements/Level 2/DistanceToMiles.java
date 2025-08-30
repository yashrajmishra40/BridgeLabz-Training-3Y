package JavaProgrammingElements.Level2;

import java.util.Scanner;

public class DistanceToMiles {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();

        double distanceYards = distanceFeet / 3.0;       // 1 yard = 3 feet
        double distanceMiles = distanceYards / 1760.0;   // 1 mile = 1760 yards

        System.out.println("The distance in yards is " + distanceYards 
                + " while the distance in miles is " + distanceMiles);

        input.close();
    }
}
