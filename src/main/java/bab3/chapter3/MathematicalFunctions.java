package bab3.chapter3;

public class MathematicalFunctions {
    public static void main(String[] args) {
        double iniDouble = 4.0;
        System.out.println("Square root = " + Math.sqrt(iniDouble));
        System.out.println("Power = " + Math.pow(iniDouble, 2.0));
        System.out.println("Sin 60 = " + Math.sin(60.0));
        System.out.println("Cos 60 = " + Math.cos(60.0));
        System.out.println("Tan 60 = " + Math.tan(60.0));
        System.out.println("Atan 60 = " + Math.atan(60.0));
        System.out.println("Atan2 60 = " + Math.atan2(60.0, 60.0));
        System.out.println("Exp 60 = " + Math.exp(60.0));
        System.out.println("Log 10= " + Math.log(10));
        System.out.println("Log10 100= " + Math.log10(100));
        System.out.println("PI = " + Math.PI);
        System.out.println("E = " + Math.E + "\n");
        
        System.out.println("floorMod(4, 3) = " + Math.floorMod(4, 3));
        System.out.println("(4 % 3) = " + 4 % 3);
        System.out.println("floorMod(+4, -3) = " + Math.floorMod(+4, -3));
        System.out.println("(+4 % -3) = " + +4 % -3);
        System.out.println("floorMod(-4, +3) = " + Math.floorMod(-4, +3));
        System.out.println("(-4 % +3) = " + -4 % +3);
        System.out.println("floorMod(-4, -3) = " + Math.floorMod(-4, -3));
        System.out.println("(-4 % -3) = " + -4 % -3);
    }
}
