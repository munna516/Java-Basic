package Basic_Java;

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenhite Temperature : ");
        double f = input.nextDouble();
        double c = ((f - 32) * 5) / 9;
        System.out.format("Temperate in Celcius : %.3f", c);
    }
}
