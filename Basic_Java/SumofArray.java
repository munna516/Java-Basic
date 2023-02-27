package Basic_Java;

public class SumofArray {
    public static void main(String[] args) {
        int[] num = new int[6];
        num[0] = 5;
        num[1] = 5;
        num[2] = 5;
        num[3] = 5;
        num[4] = 5;
        num[5] = 5;
        int len = num.length;
        int sum = num[0] + num[1] + num[2] + num[3] + num[4] + num[5];
        System.out.println("Length of the Array is : " + len);
        System.out.println("Sum of the Array : " + sum);
    }
}
