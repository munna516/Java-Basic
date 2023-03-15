package Strings;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        
        System.out.println(s2);
        // System.out.println(s1==s2);
        String s3 = new String("Java");
        System.out.println(s1 == s3);

        char[] s = { 'H', 'E', 'L', 'L', 'O' };
        String s4 = new String(s);
        System.out.println(s4);

        byte b[] = { 65, 66, 67, 68 };
        String s5 = new String(b);
        System.out.println(s5);
    }
}
