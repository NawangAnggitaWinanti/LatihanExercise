import java.util.Scanner;

public class coba1 {
    public static void process(int angka, String huruf) {

        for (int i=0; i<angka; i++) {
            for (int n=0; n<=i; n++) {
                System.out.print(huruf);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int x = Integer.parseInt(s.nextLine());
        System.out.print("Masukkan Huruf: ");
        String huruf = s.nextLine();
        process(x, huruf);
    }

}
