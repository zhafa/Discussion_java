import java.io.*;
import java.util.*;

public class Task2 {

    public static void main(String[] args){
        // Input
        // Jarak
        // Waktu
        // Output
        // Jarak (dalam km)
        // Waktu (dalam jam, menit, dan detik; Format = jj:mm:dd)
        // Kecepatan (2 angka dibelakang koma)
        // Scanner
        Scanner input = new Scanner(System.in);
        float jarakAwal = input.nextFloat();
        float waktuAwal = input.nextFloat();
        float jarak,kecepatan;
        input.close();

        // konversi jarak
        float jarakAkhir;
        jarakAkhir = jarakAwal / 1000;
        
        // konversi jam
        float jam = waktuAwal / 3600;
        float menit = (waktuAwal / 60) % 60;
        float detik = waktuAwal % 60;
        int jj = (int) jam;
        int mm = (int) menit;
        int dd = (int) detik;
        
        // rumus jarak
        kecepatan = jarakAkhir / jam;
        // IF ELSE
        System.out.println(jarakAkhir);
        if (jam < 10) {
            System.out.print("0" + jj + ":");
        } else {
            System.out.print(jj + ":");
        }
        if (menit < 10) {
            System.out.print("0" + mm + ":");
        } else {
            System.out.print(mm + ":");
        }
        if (detik < 10) {
            System.out.println("0" + dd);
        } else {
            System.out.println(dd);
        }
        // output
        System.out.printf("%.2f", kecepatan);

    }
}
