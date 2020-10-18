package bab3.chapter9;

import java.math.*;

public class BigNumbers {

    public static void main(String[] args) {
        BigInteger iniInteger = BigInteger.valueOf(100);
        BigInteger a = BigInteger.valueOf(2);
        BigInteger b = BigInteger.valueOf(4);
        BigInteger c = BigInteger.valueOf(5);
        
        iniInteger = a.add(b); // iniInteger = a + b
        System.out.println(iniInteger);
        
        iniInteger = c.multiply(b.add(BigInteger.valueOf(2))); // iniInteger = c * (b + 2)
        System.out.println(iniInteger);
    }

}
