package Basic_Java;

import java.util.Scanner;

public class EvenNumberMtoN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Starting & Ending Position : ");
        int m, n, count = 0;
        m = input.nextInt();
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total " + count + " Even Numbers");
    }
}
