import java.util.Scanner;
public class Main28 {

    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Tahun Anda: ");
        int tahun = input.nextInt();

        System.out.print("Masukkan hari pertama pada tahun: ");
        int hariPertama = input.nextInt();
        int jumlahdaridalambulan = 0;
        String hariPertamaString = "";

        for (int bulan = 1; bulan <= 12; bulan++) {

            switch (bulan) {

                case 1: System.out.print("Januari 1, " + tahun + " adalah ");
                    jumlahdaridalambulan = 31;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);
                    break;
                case 2: System.out.print("Februari 1, " + tahun + " adalah ");
                    if (tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0))
                        jumlahdaridalambulan = 29;
                    else
                        jumlahdaridalambulan = 28;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);
                    break;
                case 3: System.out.print("Maret 1, " + tahun + " adalah ");
                    jumlahdaridalambulan = 31;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);

                    break;
                case 4: System.out.print("April 1, " + tahun + " adalah ");
                    jumlahdaridalambulan = 30;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);

                    break;
                case 5: System.out.print("Mei 1, " + tahun + " adalah ");
                    jumlahdaridalambulan = 31;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);

                    break;
                case 6: System.out.print("Juni 1, " + tahun + " adalah ");
                    jumlahdaridalambulan = 30;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);

                    break;
                case 7: System.out.print("Juli 1, " + tahun + " adalah ");
                    jumlahdaridalambulan = 31;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);

                    break;
                case 8: System.out.print("Agustus 1, " + tahun + " adalah ");
                    jumlahdaridalambulan = 31;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);

                    break;
                case 9: System.out.print("September 1, " + tahun + " adalah ");
                    jumlahdaridalambulan = 30;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);

                    break;
                case 10: System.out.print("Oktober 1, " + tahun + " adalah ");
                    jumlahdaridalambulan = 31;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);

                    break;
                case 11: System.out.print("November 1, " + tahun + " adalah ");
                    jumlahdaridalambulan = 30;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);

                    break;
                case 12: System.out.print("Desember 1, " + tahun + " adalah ");
                    jumlahdaridalambulan = 31;
                    hariPertamaString = hariPertamaString(hariPertama);
                    System.out.println(hariPertamaString);

                    break;
            }


            hariPertama = (hariPertama + jumlahdaridalambulan) % 7;
        }
    }

    public static String hariPertamaString(int hariPertama) {

        String hariPertamaString = "";

        switch (hariPertama) {
            case 0: hariPertamaString = "Minggu";
            break;
            case 1: hariPertamaString = "Senin";
            break;
            case 2: hariPertamaString = "Selasa";
            break;
            case 3: hariPertamaString = "Rabu";
            break;
            case 4: hariPertamaString = "Kamis";
            break;
            case 5: hariPertamaString = "Jumat";
            break;
            case 6: hariPertamaString = "Sabtu";
            break;
        }

        return hariPertamaString;
    }
}
//by: zhafa anbiya