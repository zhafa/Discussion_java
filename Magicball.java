import java.util.Scanner;

public class Magicball {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        int a = 1;
        // 2a =2
        // a=1

        int b = -2;
        // 3a + b =1
        // 3 + b = 1
        // b = -2

        int c = 11;
        // a+b+c = 10
        // 1 + (-2) + c = 10
        // c = 11

        int un = a * (n * n) + b * n + c;
        Input.close();

        System.out.println(un);

    }
}
