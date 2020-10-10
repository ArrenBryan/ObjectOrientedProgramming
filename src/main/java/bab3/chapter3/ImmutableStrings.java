package bab3.chapter3;

public class ImmutableStrings {

    public static void main(String[] args) {
        String iniString1 = "Ayam";
        String iniString2 = "Ayam";
        String iniString3 = new String("Ayam");
        
        System.out.println(iniString1 == iniString2);
        System.out.println(iniString1 == iniString3);
    }
}
