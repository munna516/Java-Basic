package Basic_Java;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int sum = 0;
        while (num != 0) {
            int r = num % 10;
            sum += r;
            num = num / 10;
        }
        System.out.println("Sum of digit : " + sum);
    }
}
