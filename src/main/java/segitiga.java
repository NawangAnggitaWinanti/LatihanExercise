public class segitiga {
    public enum ujianSegitiga{
        SAMA_KAKI, SAMA_SISI, IRREGULAR, BUKAN_SEGITIGA
    }
    public static UjianEnumKendaraan.Kendaraan tebakJenisKendaraan(int rodaDepan, int rodaBelakang){
        int a = rodaDepan;
        int b = rodaBelakang;
        if (a + b == 4){
            return UjianEnumKendaraan.Kendaraan.MOBIL;
        } else if (a+b == 2) {
            return UjianEnumKendaraan.Kendaraan.SEPEDA;
        } else if (a+b == 3) {
            return UjianEnumKendaraan.Kendaraan.BAJAJ;
        } return UjianEnumKendaraan.Kendaraan.DELMAN;
    }

    public static void main(String[] args) {
        System.out.println(tebakJenisKendaraan(0,0));
    }
}
