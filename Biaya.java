import java.util.Scanner;

public class Biaya {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        // X1 Y1 X2 Y2

        double x1 = Input.nextDouble();
        double y1 = Input.nextDouble();
        double x2 = Input.nextDouble();
        double y2 = Input.nextDouble();

        // membuat jarak
        double jarak = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double biaya = jarak * 2000;

        // biaya per KM = Rp. 2000.
        // Rumus perhitungan biaya perjalanan : Biaya Ojol = JarakKM * BiayaperKM
        Input.close();

        // output
        // .00 .000 .0000 = 1.7374
        // Biaya perjalanan dari titik (3.00,4.00) ke titik (5.00,6.00) adalah =
        // Rp5656.85

        System.out.printf("Biaya perjalanan dari titik (%.2f,%.2f) ke titik (%.2f,%.2f) adalah = Rp%.2f\n", x1, y1, x2,
                y2, biaya);

    }
}
