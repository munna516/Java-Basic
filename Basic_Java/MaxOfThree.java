package Basic_Java;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three Numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b && a > c)
            System.out.println(a + " is Greater Then " + b + " and " + c);
        else if (b > a && b > c)
            System.out.println(b + " is Greater Then " + a + " and " + c);
        else
            System.out.println(c + " is Greater Then " + a + " and " + b);

    }
}
