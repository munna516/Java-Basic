package Basic_Java;

import java.util.Scanner;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Range : ");
        int x = input.nextInt();
        int y = input.nextInt();
        for (int i = x; i <= y; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1)
                System.out.println(i);
        }
    }
}
