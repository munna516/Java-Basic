package Basic_Java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter How many Numbers : ");
        int x = input.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i <= x; i++) {
            System.out.print(+(a + b) + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

    }
}
