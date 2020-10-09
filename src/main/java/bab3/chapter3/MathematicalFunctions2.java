package bab3.chapter3;

import static java.lang.Math.*;

public class MathematicalFunctions2 {
    public static void main(String[] args) {
        double iniDouble = 4.0;
        System.out.println("Square root = " + sqrt(iniDouble));
        System.out.println("Power = " + pow(iniDouble, 2.0));
        System.out.println("Sin 60 = " + sin(60.0));
        System.out.println("Cos 60 = " + cos(60.0));
        System.out.println("Tan 60 = " + tan(60.0));
        System.out.println("Atan 60 = " + atan(60.0));
        System.out.println("Atan2 60 = " + atan2(60.0, 60.0));
        System.out.println("Exp 60 = " + exp(60.0));
        System.out.println("Log 10= " + log(10));
        System.out.println("Log10 100= " + log10(100));
        System.out.println("PI = " + PI);
        System.out.println("E = " + E + "\n");
        
        System.out.println("floorMod(4, 3) = " + floorMod(4, 3));
        System.out.println("(4 % 3) = " + 4 % 3);
        System.out.println("floorMod(+4, -3) = " + floorMod(+4, -3));
        System.out.println("(+4 % -3) = " + +4 % -3);
        System.out.println("floorMod(-4, +3) = " + floorMod(-4, +3));
        System.out.println("(-4 % +3) = " + -4 % +3);
        System.out.println("floorMod(-4, -3) = " + floorMod(-4, -3));
        System.out.println("(-4 % -3) = " + -4 % -3);
    }
}
