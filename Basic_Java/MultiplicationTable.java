package Basic_Java;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int x = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " i = " + (x * i));
        }
    }
}
