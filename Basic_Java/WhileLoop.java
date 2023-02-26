package Basic_Java;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 100;
        while (i != 0) {
            if (i % 8 == 0)
                System.out.println(i);
            --i;
        }
    }
}
