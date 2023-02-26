package Basic_Java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num, fact = 1;
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial Of " + num + " : " + fact);

    }
}
