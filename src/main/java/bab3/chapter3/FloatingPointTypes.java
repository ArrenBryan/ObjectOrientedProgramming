package bab3.chapter3;

public class FloatingPointTypes {
    public static void main(String[] args) {
        float iniFloat = 10.0F;
        double iniDouble = 10.0D;
        
        System.out.println("Float = " + iniFloat);
        System.out.println("Double = " + iniDouble);
        
        if (iniDouble == Double.NaN)
        {
           System.out.println(iniDouble + " is not a number");
        }
        else
        {
            System.out.println(iniDouble + " is a number");
        }
    }
}
