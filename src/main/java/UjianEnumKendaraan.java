public class UjianEnumKendaraan {
    public enum Kendaraan{
        MOBIL, SEPEDA, BAJAJ, DELMAN
    }
    public static Kendaraan tebakJenisKendaraan(int rodaDepan, int rodaBelakang){
        int a = rodaDepan;
        int b = rodaBelakang;
        if (a + b == 4){
            return Kendaraan.MOBIL;
        } else if (a+b == 2) {
            return Kendaraan.SEPEDA;
        } else if (a+b == 3) {
            return Kendaraan.BAJAJ;
        } return Kendaraan.DELMAN;
    }

    public static void main(String[] args) {
        System.out.println(tebakJenisKendaraan(0,0));
    }
}
