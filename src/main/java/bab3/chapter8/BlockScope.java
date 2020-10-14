package bab3.chapter8;

public class BlockScope {

    public static void main(String[] args) {

//        int iniInteger = 22; 
        {
            int iniInteger = 20;
            System.out.print(iniInteger);
        }

        System.out.println("");
        int iniInteger = 22;
        System.out.print(iniInteger);
    }

}
