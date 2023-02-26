package Basic_Java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println("Your Number is Prime");
        else
            System.out.println("Your Number is Not Prime");
    }
}
