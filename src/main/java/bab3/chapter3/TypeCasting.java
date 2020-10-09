package bab3.chapter3;

public class TypeCasting {
    public static void main(String[] args) {
        int iniInteger = 10;
        double iniDouble = 23.5;
        iniInteger += iniDouble;
        System.out.println("Integer + Double = " + iniInteger);
        
        int iniInteger2 = 123456;
        float iniFloat = iniInteger2;
        System.out.println("Float = " + iniFloat);
        iniFloat += iniDouble;
        System.out.println("Float + Double = " + iniFloat);
        
        double iniDouble2 = 69.69;
        int iniInteger3 = (int) Math.round(iniDouble2);
        System.out.println("Integer3 = " + iniInteger3 + "\n");
        
        iniInteger = (int) iniDouble;
        System.out.println("Double ke Integer = " + iniInteger);
        byte iniByte = (byte) iniInteger2;
        System.out.println("Integer ke Byte (overflow) = " + iniByte);
    }
}
