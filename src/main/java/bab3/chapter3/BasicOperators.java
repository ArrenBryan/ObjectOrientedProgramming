package bab3.chapter3;

public class BasicOperators {
    public static void main(String[] args) {
        int iniInteger = 10;
        iniInteger %= 3;
        System.out.println("Integer % 3 = " + iniInteger);

        iniInteger += (int) 3.5;
        System.out.println("Integer % 3 = " + iniInteger + "\n");

        int a = 0;
        int b = 3;
        
        /* 
         * Langkah-langkah yang dilakukan:
         * 1. a = 0, b = 3,
         * 2. b = b + 2, sehingga b = 5
         * 3. b = b + a, sehingga b = 5,
         * 4. a = a + 1, sehingga a = 1,
         * 5. b = b + a, sehingga b = 6,
         * 6. a = a + 1, sehingga a = 2.
         */
        b += 2 + a++ + a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");
        
        b = 3;
        a = 0;
        
        /* 
         * Langkah-langkah yang dilakukan:
         * 1. a = 0, b = 3,
         * 2. b = b + 2, sehingga b = 5
         * 4. a = a + 1, sehingga a = 1,
         * 5. b = b + a, sehingga b = 6,
         * 6. a = a + 1, sehingga a = 2.
         * 3. b = b + a, sehingga b = 8,
         */
        b += 2 + ++a + ++a;
        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");
    }
}
