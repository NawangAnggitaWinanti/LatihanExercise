public class DemoEnum {
    public enum Hari{
        SENIN,SELASA,RABU,KAMIS,JUMAT,SABTU,MINGGU
    }
    //return type nama enumnya
    public static Hari getNamaHari(int nomorHari){
        if (nomorHari==1){
            return Hari.MINGGU;
        } else if (nomorHari==2) {
            return Hari.SENIN;
        } else if (nomorHari==3) {
            return Hari.SELASA;
        } else if (nomorHari==4) {
            return Hari.RABU;
        } else if (nomorHari==5) {
            return Hari.KAMIS;
        } else if (nomorHari==6) {
            return Hari.JUMAT;
        } return Hari.SABTU;
    }
    public static void main(String[] args) {
        //System.out.println(Hari.SENIN);
        //System.out.println(Hari.SELASA);
        System.out.println(getNamaHari(3));
    }
}
