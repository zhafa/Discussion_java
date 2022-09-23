import java.util.Scanner;

public class sisi {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        // x1 y1 x2 y2
        double x1 = Input.nextDouble();
        double y1 = Input.nextDouble();
        double x2 = Input.nextDouble();
        double y2 = Input.nextDouble();

        // membuat rumus
        double hasil;
        hasil = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Input.close();

        // membuat print out
        // input yang diminta
        /*
         * 0.44
         * -1.85
         * 1.85
         * -0.12
         */

        System.out.printf("%.2f", hasil);
        // System.out.println(hasil);
    }
}
