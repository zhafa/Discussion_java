import java.util.Scanner;

public class Romawi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang ingin di konversi kan menjadi romawi");
        int Bilangan = input.nextInt();
        input.close();

        if (Bilangan < 1 || Bilangan > 500000000) {
            System.out.println("Angka yang anda input melebihi kapasitas");
        } else {
            while (Bilangan >= 1000) {
                System.out.print("M");
                Bilangan = Bilangan - 1000;
            }
        }

        if (Bilangan >= 500) {
            if (Bilangan >= 900) {
                System.out.print("CM");
                Bilangan = Bilangan - 900;

            } else {
                System.out.print("D");
                Bilangan = Bilangan - 500;
            }
        }
        while (Bilangan >= 100) {
            if (Bilangan >= 400) {
                System.out.print("CD");
                Bilangan = Bilangan - 400;
            } else {
                System.out.print("C");
                Bilangan = Bilangan - 100;
            }

        }
        if (Bilangan >= 50) {
            if (Bilangan >= 90) {
                System.out.print("XC");
                Bilangan = Bilangan - 90;
            } else {
                System.out.print("L");
                Bilangan = Bilangan - 50;
            }
        }
        while (Bilangan >= 10) {
            if (Bilangan >= 40) {
                System.out.print("XL");
                Bilangan = Bilangan - 40;
            } else {
                System.out.print("X");
                Bilangan = Bilangan - 10;
            }
        }
        if (Bilangan >= 5) {
            if (Bilangan == 9) {
                System.out.print("IX");
                Bilangan = Bilangan - 9;
            } else
                System.out.print("V");
            Bilangan = Bilangan - 5;

        }
        while (Bilangan >= 1) {
            if (Bilangan == 4) {
                System.out.print("IV");
                Bilangan = Bilangan - 4;
            } else
                System.out.print("I");
            Bilangan = Bilangan - 1;

        }
        System.out.println();
    }
}
