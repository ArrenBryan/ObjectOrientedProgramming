package bab3.chapter10;

import java.util.*;

public class ForeachLoop {

    public static void main(String[] args) {
        int[] iniInteger = new int[10];
        for (int element : iniInteger) {
            System.out.println(element);
        }
        
        System.out.println("");
        
        for (int i = 0; i <= 9; i++) {
            iniInteger[i] = i;
        }
        for (int element : iniInteger) {
            System.out.println(element);
        }
        
        System.out.println("");
        System.out.println(Arrays.toString(iniInteger));
    }
}
