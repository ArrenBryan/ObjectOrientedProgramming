package bab3.chapter5;

public class ParenthesesOperator {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 5;

        /* 
         * Langkah-langkah yang dilakukan:
         * 1. a = 2, b = 3, c = 5,
         * 2. b = b + c, sehingga b = 8,
         * 3. a = a + b, sehingga a = 10.
         */
        a += b += c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c + "\n");

        if (false && true || true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
