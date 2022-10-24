import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka 1");
        int Angka1 = input.nextInt();
        System.out.println("Masukkan Angka 2");
        int Angka2 = input.nextInt();
        input.close();
        int FPB ;
        FPB = Angka2 % Angka1 ;

        while (FPB != 0){
            Angka1 = Angka2;
            Angka2 = FPB;
            FPB = Angka1 % Angka2;


        }
        System.out.println("FPB nya adalah : " + Angka2);

    }
}
