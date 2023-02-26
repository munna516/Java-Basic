package Basic_Java;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int marks = input.nextInt();
        int x = marks / 5;
        switch (x) {
            case 20:
            case 19:
            case 18:
            case 17:
            case 16:
                System.out.println("You Got A+");
                break;
            case 15:
                System.out.println("You Got A");
                break;
            case 14:
                System.out.println("You Got A-");
                break;
            case 13:
                System.out.println("You Got B+");
                break;
            case 12:
                System.out.println("You Got B");
                break;
            case 11:
                System.out.println("You Got B-");
                break;
            case 10:
                System.out.println("You Got C+");
                break;
            case 9:
                System.out.println("You Got C");
                break;
            case 8:
                System.out.println("You Got D");
                break;
            default:
                System.out.println("You Fail in this subject");
        }
    }
}
