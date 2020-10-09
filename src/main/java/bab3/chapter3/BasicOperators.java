package bab3.chapter3;

public class BasicOperators {
    public static void main(String[] args) {
        int iniInteger = 10;
        iniInteger %= 3;
        System.out.println("Integer % 3 = " + iniInteger);
        
        iniInteger += (int) 3.5;
        System.out.println("Integer % 3 = " + iniInteger + "\n");
        
        int m = 7;
        int n = 7;
        int a = 2 * ++m;
        int b = 2 * n++;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
