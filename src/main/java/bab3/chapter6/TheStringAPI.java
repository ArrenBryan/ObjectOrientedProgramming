package bab3.chapter6;

public class TheStringAPI {

    public static void main(String[] args) {
        String iniString1 = "Ayam";
        String iniString2 = "Ayam";
        String iniString3 = "Ayams";
        String iniString4 = "ayam";
        
        System.out.println(iniString1.compareTo(iniString2));
        System.out.println(iniString3.compareTo(iniString1));
        System.out.println(iniString1.compareTo(iniString4));
        System.out.println(iniString1.startsWith("ay"));
        System.out.println(iniString1.startsWith("Ay"));
        System.out.println(iniString1.startsWith(iniString2));
        System.out.println(iniString1.startsWith(iniString4));
        System.out.println(iniString1.endsWith("am"));
        
        System.out.println();
        
        String str1 = "This is a BeginnersBook tutorial";
        String str2 = "Beginners";
        String str3 = "Book";
        String str4 = "Books";
        
        System.out.println("Index of B in str1: " + str1.indexOf('B'));
        System.out.println("Index of B in str1 after 15th char:" + str1.indexOf('B', 15));
        System.out.println("Index of B in str1 after 30th char:" + str1.indexOf('B', 30));
        System.out.println("Index of string str2 in str1:" + str1.indexOf(str2));
        System.out.println("Index of str2 after 15th char" + str1.indexOf(str2, 15));
        System.out.println("Index of string str3:" + str1.indexOf(str3));
        System.out.println("Index of string str4" + str1.indexOf(str4));
        System.out.println("Index of hardcoded string:" + str1.indexOf("is"));
        System.out.println("Index of hardcoded string:" + str1.indexOf("book"));
        System.out.println("Index of hardcoded string after 4th char:" + str1.indexOf("is", 4));
        
        System.out.println();
        
        System.out.println("BRYAN".toLowerCase());
        System.out.println("azriel".toUpperCase());
        
        System.out.println();

        System.out.println("      How Are You?       ".trim());
        System.out.println("      How     Are You?       ".trim());
    }
}
