import java.util.Scanner;

public class Main38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SELAMAT DATANG  ");
        System.out.println("KONVERSI DECIMAL -> OKTAF  ");
        System.out.print("Masukkan angka desimal: ");
        int desimal = input.nextInt();

        String oktaf = "";
        for (int i = desimal; i > 0; i /= 8) {
            oktaf = i % 8 + oktaf;
        }

        System.out.println("oktal dari  " + desimal + " adalah " + oktaf);
    }
}
//by: zhafa anbiya