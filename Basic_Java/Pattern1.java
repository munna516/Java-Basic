package Basic_Java;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How many row : ");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }
}
