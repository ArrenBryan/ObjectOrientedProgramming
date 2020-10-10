package bab3.chapter3;

public class EmptyNullStrings {

    public static void main(String[] args) {
        String iniString = "Bryan";
        if (iniString.length() == 0) {
            System.out.println("Tidak ada karakter dalam string");
        } else {
            System.out.println("Terdapat karakter dalam string (" + iniString + ")");
        }

        if (iniString.equals("")) {
            System.out.println("Tidak ada karakter dalam string");
        } else {
            System.out.println("Terdapat karakter dalam string (" + iniString + ")");
        }
        
        System.out.println("\n");

        String iniString2 = "";
        if (iniString2.length() == 0) {
            System.out.println("Tidak ada karakter dalam string");
        } else {
            System.out.println("Terdapat karakter dalam string (" + iniString2 + ")");
        }

        if (iniString2.equals("")) {
            System.out.println("Tidak ada karakter dalam string");
        } else {
            System.out.println("Terdapat karakter dalam string (" + iniString2 + ")");
        }

        System.out.println("\n");
        
        String iniString3 = null;
        if (iniString3 == null) {
            System.out.println("Tidak ada karakter dalam string");
        } else {
            System.out.println("Terdapat karakter dalam string (" + iniString3 + ")");
        }

        iniString3 = iniString2.substring(0, 0);
        if (iniString3 == null) {
            System.out.println("Tidak ada karakter dalam string");
        } else {
            System.out.println("Terdapat karakter dalam string (" + iniString3 + ")");
        }
    }
}
