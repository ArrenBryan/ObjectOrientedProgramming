package bab3.chapter6;

public class Concetenation {

    public static void main(String[] args) {
        String iniString = String.join(" ", "Bryan", "Azriel", "Parulian");
        System.out.println(iniString);

        String iniString2 = String.join(" -> ", "Wake-up", "Eat", "Game",
                "Sleep", "Wake-up");
        System.out.println(iniString2);
    }

}
