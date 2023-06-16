public class DemoManipulasiString {
    public static String balikString(String kata){
    String dibalik ="";
    for (int i = kata.length()-1; i>0; i--) {
        System.out.print(kata.charAt(i));
    }
    return dibalik;
}
    public static boolean bolakBalikOk(String kata){
        String dibalik = balikString(kata);
        return dibalik.toLowerCase().equals(kata.toLowerCase());

    }
    public static void main(String[] args) {
        String kata =" ini adalah hari ke 19 training";

        //charAt : melihat posisi karakter berada dimana
        //for (int i=0; i<kata.length();i++){
            //System.out.print(kata.charAt(i));
        System.out.println(balikString(kata));
        }

}
