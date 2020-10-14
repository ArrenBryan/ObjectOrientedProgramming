package bab3.chapter5;

public class EnumeratedTypes {

    public enum Hari {
        SENIN(1),
        SELASA(2),
        RABU(3),
        KAMIS(4),
        JUMAT(5),
        SABTU(6),
        MINGGU(7);
        
        public int inInteger;
        
        Hari(int i) {
            this.inInteger = i;
        }
    }

    public static void main(String[] args) {
        Hari hariLibur = Hari.MINGGU;
        System.out.println("Hari libur adalah " + hariLibur);
        
        Hari hariMauLibur = Hari.SABTU;
        if (hariMauLibur.inInteger == 6)
        {
            System.out.println("Hari mau libur adalah " + hariMauLibur);
        }
    }
}
