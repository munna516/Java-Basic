package Basic_Java;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int sum = 0, main_num = num;
        while (num != 0) {
            int r = num % 10;
            sum = sum + (r * r * r);
            num = num / 10;
        }
        if (main_num == sum)
            System.out.println("The Number is Armstrong");
        else
            System.out.println("The Number is Not Armstrong");

    }
}
