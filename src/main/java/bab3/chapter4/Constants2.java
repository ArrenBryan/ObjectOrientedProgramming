package bab3.chapter4;

public class Constants2 {
    public static void main(String[] args) {
        System.out.println("Jumlah Mobil Awal = " + Mobil.jumlahMobil);
        Mobil a = new Mobil();
        System.out.println("Jumlah Mobil a = " + a.jumlahMobil);
        Mobil b = new Mobil();
        System.out.println("Jumlah Mobil b = " + b.jumlahMobil);
        Mobil c = new Mobil();
        System.out.println("Jumlah Mobil c = " + c.jumlahMobil + "\n");
        
        System.out.println("Jumlah Mobil a = " + a.jumlahMobil);
        System.out.println("Jumlah Mobil b = " + b.jumlahMobil);
        System.out.println("Jumlah Mobil c = " + c.jumlahMobil);
        System.out.println("Jumlah Mobil Akhir = " + Mobil.jumlahMobil);
    }
}

class Mobil {
    public static int jumlahMobil;

    Mobil() {
        jumlahMobil++;
    }
}
