package bab3.chapter3;

public class BitwiseOperators {

    public static void main(String[] args) {
        System.out.println(2 & 2); // 0010 & 0010 = 0010
        System.out.println(4 & 2); // 0100 & 0010 = 0000
        System.out.println(2 & 1); // 0010 & 0001 = 0000
        System.out.println(3 & 1); // 0011 & 0001 = 0001

        System.out.println();

        // Roti, Daging, Sayur, Saus
        // 0, 0, 0, 0 -> 0000
        // 0000 -> Tidak ada semuanya
        // 0001 -> Ada saus
        // 0010 -> Ada sayur
        // 0011 -> Ada sayur dan saus
        // 0100 -> Ada daging
        // 0101 -> Ada daging dan saus
        // 0110 -> Ada daging dan sayur
        // 0111 -> Ada daging, sayur, dan saus
        // ...
        // Mengecek apakah ada komponennya atau tidak.
        // 1100 -> Ada roti dan daging
        // 1100 & 1000 = 12 & 8 = 8 (1000) -> Ada roti
        // 1100 & 0100 = 12 & 4 = 4 (0100) -> Ada daging
        // 1000 & 0100 = 8 & 4 = 0 (0000) -> Tidak ada saus
        // Menambahkan komponen.
        // 0000 -> Tidak ada semuanya
        // 0000 | 0100 = 0 | 4 = 0 | (1 << 2) = 4 (0100) -> Tambah daging
        // 0100 | 1000 = 4 | 8 = 12 (1100) -> Tambah roti, jadi ada daging
        // dan roti
        
        System.out.println(3 << 3); // 11 di shift kiri menjadi 11000
        System.out.println(24 >> 3); // 11000 di shift kanan menjadi 11
        System.out.println(7 >> 3); // 111 di shift kanan menjadi 0
        System.out.println(11 >> 3); // 1111 di shift kanan menjadi 1

        System.out.println();

        // 11111111111111111111111111111111 = -1 di shift kiri menjadi
        // 11111111111111111111111111111110 = -2
        System.out.println(-1 << 1);

        // 11111111111111111111111111111111 = -1 di shift kanan menjadi
        // 11111111111111111111111111111111 = -1
        System.out.println(-1 >> 1);

        // 11111111111111111111111111111111 = -1 di shift kanan (unsigned) menjadi
        // 01111111111111111111111111111111 = 2147483647
        System.out.println(-1 >>> 1);

        System.out.println();
        
        // Tidak akan terjadi overflow karena menjadi type data unsigned,
        // dimana carry flag dapat dipakai.
        int high = 2100000000;
        int low = 2000000000;
        System.out.println("mid using >>> 1 = " + ((low + high) >>> 1));
        
        // Akan terjadi overflow.
        System.out.println("mid using / 2   = " + ((low + high) / 2));
    }
}
