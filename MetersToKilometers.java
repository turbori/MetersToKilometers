import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double lengthMeters;
        double lengthKm;

        System.out.println("Number of meters, you want to convert: ");
        lengthMeters = scnr.nextDouble();

        lengthKm = lengthMeters / 1000;

        /* Your code goes here */
        System.out.println("1000 meters = 1 kilometer");
        System.out.printf("%.2f", lengthMeters);
        System.out.print(" meters = ");
        System.out.printf("%.3f", lengthKm);
        System.out.println(" kilometers");

    }
}