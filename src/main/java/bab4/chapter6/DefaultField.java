package bab4.chapter6;

public class DefaultField {

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("iniInteger: " + t.iniInteger);
        System.out.println("iniInteger: " + t.iniDouble);
        System.out.println("iniInteger: " + t.iniFloat);
        System.out.println("iniInteger: " + t.iniBoolean);
        System.out.println("iniInteger: " + t.iniString);
        System.out.println("iniInteger: " + t.iniTest);
    }
}

class Test {

    public int iniInteger;
    public double iniDouble;
    public float iniFloat;
    public boolean iniBoolean;
    public String iniString;
    public Test iniTest;
}
