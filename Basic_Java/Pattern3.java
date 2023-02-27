package Basic_Java;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How many row : ");
        int x = input.nextInt();
        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0)
                    System.out.print("0  ");
                else
                    System.out.print("1  ");
            }
            System.out.print("\n");
        }
    }
}
