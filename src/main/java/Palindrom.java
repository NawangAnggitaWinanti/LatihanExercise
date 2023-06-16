public class Palindrom {
    public static String isPalindrome(String kata) {
        String balik="";
        for (int i=kata.length()-1; i>=0; i--){
            balik+=kata.charAt(i);
        }
        return balik;
    }

    public static boolean bolakBalikOk(String kata){
        String balik=isPalindrome(kata);
        return balik.toLowerCase().equals(kata.toLowerCase());
    }

    public static void main(String[] args) {
        String kata="ini";
        System.out.println(bolakBalikOk(kata)); //->true
        String kata2="itu";
        System.out.println(bolakBalikOk(kata2)); //->false
        String kata3="anna";
        System.out.println(bolakBalikOk(kata3)); //->true
        String kata4="murah harum";
        System.out.println(bolakBalikOk(kata4)); //->true
    }
}
