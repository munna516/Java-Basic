package Basic_Java;

import java.util.Scanner;

public class SumOfArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Elements : ");
        int num = input.nextInt();
        int sum = 0;
        int[] Ar = new int[num];
        System.out.print("Enter The Array Element : ");
        for (int i = 0; i < num; i++)
            Ar[i] = input.nextInt();
        for (int i = 0; i < num; i++)
            sum += Ar[i];

        System.out.println("Sum of the Array : " + sum);
        double avg = (double) sum / num;
        System.out.println("Average of the Array : " + avg);
    }
}
