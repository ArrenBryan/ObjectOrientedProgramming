package bab3.chapter6;

public class EqualityString {
    public static void main(String[] args) {
        String iniString1 = "Ayam";
        String iniString2 = "ayam";
        
        System.out.println(iniString1.equals(iniString2));
        System.out.println(iniString1.equalsIgnoreCase(iniString2));
    }
}
