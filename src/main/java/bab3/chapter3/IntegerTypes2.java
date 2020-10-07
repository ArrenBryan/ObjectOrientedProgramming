package bab3.chapter3;

public class IntegerTypes2 {
    public static void main(String[] args) {
        int iniHexadecimal = 0xCAFE;
        int iniOctal = 010;
        int iniBinary = 0b1001;
        
        System.out.println("Hexadecimal = " + iniHexadecimal);
        System.out.println("Octal = " + iniOctal);
        System.out.println("Binary = " + iniBinary + "\n");
        
        iniHexadecimal += 0xCAFE;
        iniOctal += 010;
        iniBinary += 0b1001;
        
        System.out.println("Hexadecimal = " + iniHexadecimal);
        System.out.println("Octal = " + iniOctal);
        System.out.println("Binary = " + iniBinary);
    }
}
