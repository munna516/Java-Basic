package Basic_Java;

import java.util.Scanner;

public class VowelConstant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char c = input.next().charAt(0);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Your Entered Character is a Vowel");
                break;
            default:
                System.out.println("Your Entered Character is a Consonant");
        }
    }
}
