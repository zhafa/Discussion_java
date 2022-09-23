import java.util.Scanner;

public class luassegitiga {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        // x1 y1 x2 y2 x3 y3
        double x1 = Input.nextDouble();
        double y1 = Input.nextDouble();
        double x2 = Input.nextDouble();
        double y2 = Input.nextDouble();
        double x3 = Input.nextDouble();
        double y3 = Input.nextDouble();

        // s = (sisi1 + sisi2 + sisi3)/2
        // 1 2 3 => 2-1 ; 3-2 ; 3-1
        double s;
        double sisi1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double sisi2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double sisi3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        s = (sisi1 + sisi2 + sisi3) / 2;
        // area = s (s-sisi1)(s-sisi2)(s-sisi3)
        double area;
        area = Math.sqrt(s * ((s - sisi1) * (s - sisi2) * (s - sisi3)));
        Input.close();

        System.out.printf("%.2f", area);

    }
}
