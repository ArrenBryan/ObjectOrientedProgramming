package bab3.chapter7;

import java.util.*;

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        int iniInteger = in.nextInt();
        
        if (iniInteger % 2 == 0)
        {
            System.out.printf("%d = even", iniInteger);
        }
        
        else {
            System.out.printf("%d = odd", iniInteger);
        }
    }
}
