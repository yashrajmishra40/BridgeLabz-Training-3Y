public class VolumeKmToMiles {
      public static void main(String[] args) {
        double radiusKm = 6378.0;
        double pi = Math.PI;

        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert km to miles (1 mile = 1.6 km → 1 km = 1/1.6 miles)
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3
                + " and cubic miles is " + volumeMiles3);
    }
    
}
