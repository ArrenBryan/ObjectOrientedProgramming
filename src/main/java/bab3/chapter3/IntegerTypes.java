package bab3.chapter3;

public class IntegerTypes {
    public static void main(String[] args) {
        int iniInteger = 2147483647;
        short iniShort = 32767;
        long iniLong = 9223372036854775807L;
        byte iniByte = 127;
        
        System.out.println("Integer = " + iniInteger);
        System.out.println("Short = " + iniShort);
        System.out.println("Long = " + iniLong);
        System.out.println("Byte = " + iniByte + "\n");
        
        iniInteger += 1;
        iniShort += 1;
        iniLong += 1;
        iniByte += 1;
        
        System.out.println("Integer = " + iniInteger);
        System.out.println("Short = " + iniShort);
        System.out.println("Long = " + iniLong);
        System.out.println("Byte = " + iniByte);
    }
}
