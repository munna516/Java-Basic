package Basic_Java;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int x = input.nextInt();
        if (x % 2 == 0)
            System.out.println(+x + " is an Even Number");
        else
            System.out.println(+x + " is a Odd Number");
    }
}
