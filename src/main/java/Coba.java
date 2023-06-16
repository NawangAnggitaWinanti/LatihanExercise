import java.util.Scanner;

public class Coba {

    public static void coba(int x, String huruf) {
        // implement method ini
        for (int i=0; i<x; i++) {
            for (int j=0; j<=i; j++) {
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
        coba(x, huruf);
    }
    /*public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Input angka : ");
        int angka = Integer.parseInt(s.nextLine());
        String huruf;
        if (angka == 1) {
            huruf = "A";
        }else if (angka == 2) {
            huruf="AA";
        }else if (angka == 3) {
           huruf = "AAA";
        }else if (angka == 4) {
           huruf = "AAAA";
        }else if (angka == 5) {
            huruf = "AAAAA";
        }else {
           huruf =" No Such Grade!!";
        }
        System.out.println(huruf);

    }*/
}
