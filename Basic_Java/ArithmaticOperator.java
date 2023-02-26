package Basic_Java;

import java.util.Scanner;

public class ArithmaticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Enter Two Integer : ");
        x = input.nextInt();
        y = input.nextInt();
        // Addition
        int a = x + y;
        System.out.println("Addition of x and y : " + a);
        // Subtraction
        int b = x - y;
        System.out.println("Substruction of x and y : " + b);
        // Multiplication
        int c = x * y;
        System.out.println("Multiplication of x and y : " + c);
        // Division
        int d = x / y;
        System.out.println("Division of x and y : " + d);
        // Modulus
        int e = x % y;
        System.out.println("Modulus of x and y : " + e);
    }
}
