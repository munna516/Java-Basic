package Basic_Java;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final double pi = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a Circle : ");
        double r = input.nextDouble();
        double Area = pi * r * r;
        System.out.format("Area of Circle : %.3f", +Area);

    }
}
