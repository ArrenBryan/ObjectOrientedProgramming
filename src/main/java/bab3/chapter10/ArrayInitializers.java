package bab3.chapter10;

import java.util.*;

public class ArrayInitializers {

    public static void main(String[] args) {
        int[] iniInteger = {0, 1, 2, 3, 4, 5};
        int[] iniInteger2 = {6, 7, 8, 9, 10, 11};

        System.out.println(Arrays.toString(iniInteger));

        iniInteger = iniInteger2;
        System.out.println("");
        System.out.println(Arrays.toString(iniInteger));
        System.out.println("");

        iniInteger = new int[]{12, 12, 12, 12}; // Anonymous Arrays
        System.out.println(Arrays.toString(iniInteger));
        System.out.println("");
        
        int[] iniInteger3 = new int[0];
        System.out.println(Arrays.toString(iniInteger3));
        
        // Error karena tidak ada kotak/index dalam iniInteger3.
        // Hanya sebuah variabel array yang kosong.
//        iniInteger3[0] = 2;
//        System.out.println(Arrays.toString(iniInteger3));

        // Inisialisasi kembali dengan menggunakan Anonymous Arrays.
        iniInteger3 = new int[]{7, 7,};
        System.out.println(Arrays.toString(iniInteger3));
        
        // Selain dengan Anonymous Arrays, dapat juga dengan
        // referensi/address object array yang satu type.
        iniInteger3 = iniInteger2;
        System.out.println(Arrays.toString(iniInteger3));
    }
}
