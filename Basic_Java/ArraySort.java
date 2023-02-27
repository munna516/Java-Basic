package Basic_Java;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Elements : ");
        int num = input.nextInt();
        int[] Ar = new int[num];
        System.out.print("Enter The Array Element : ");
        for (int i = 0; i < num; i++)
            Ar[i] = input.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (Ar[j] < Ar[i]) {
                    int temp = Ar[j];
                    Ar[j] = Ar[i];
                    Ar[i] = temp;
                }
            }
        }
        System.out.print("After Sorting Array : ");
        for (int i = 0; i < num; i++)
            System.out.print(Ar[i] + " ");

    }
}
