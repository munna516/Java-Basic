package Basic_Java;

import java.util.Scanner;

public class MinFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Elements : ");
        int num = input.nextInt();
        int[] Ar = new int[num];
        System.out.print("Enter The Array Element : ");
        for (int i = 0; i < num; i++)
            Ar[i] = input.nextInt();
        int min = Ar[0];
        for (int i = 1; i < num; i++) {
            if (Ar[i] < min)
                min = Ar[i];
        }
        System.out.println("Maximum Value of The Array : " + min);
    }
}
