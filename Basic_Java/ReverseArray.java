package Basic_Java;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Elements : ");
        int num = input.nextInt();
        int[] Ar = new int[num];
        System.out.print("Enter The Array Element : ");
        for (int i = 0; i < num; i++)
            Ar[i] = input.nextInt();
        for (int i = num-1; i >= 0; i--)
            System.out.print(Ar[i] + " ");

    }
}
