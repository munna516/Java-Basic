package Basic_Java;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        double y;
        String s;
        System.out.println("Enter the Integer Double & String : ");
        x = input.nextInt();
        y = input.nextDouble();
        input.nextLine();
        s = input.nextLine();
        System.out.println(x);
        System.out.println(y);
        System.out.println(s);
    }
}
