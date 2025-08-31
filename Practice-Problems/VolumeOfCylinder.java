package core_java.JavaBasics;
import java.util.Scanner;
import java.lang.Math;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        float volume = (float) (Math.PI * radius * radius * height);
        System.out.println("Volume of Cylinder is: " + volume);
        sc.close();

    }
    
}
