package bab3.chapter3;

public class TheCharType {
    public static void main(String[] args) {
        char iniInteger = 65;
        char iniHexadecimal = '\u2122';
        
        System.out.println("Integer = " + iniInteger);
        System.out.println("Hexadecimal = " + iniHexadecimal + "\n");
        
        iniInteger += 'A';
        iniHexadecimal += '\u03C0';
        
        System.out.println("Integer = " + iniInteger);
        System.out.println("Hexadecimal = " + iniHexadecimal);
    }
}
