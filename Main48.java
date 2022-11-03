import java.util.Scanner;

public class Main48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang Di Program Saya ");
        System.out.println("Program Ini Dibuat Untuk Membuat Singkatan Dari Suatu Kata");
        System.out.print("Masukkan Kalimat Anda: ");
        String data = input.nextLine();

        String abjadganjil = "";
        for (int x = 0; x < data.length(); x+=2) {
            abjadganjil += data.charAt(x);
        }
        System.out.println(abjadganjil);
    }
}
//by: zhafa anbiya