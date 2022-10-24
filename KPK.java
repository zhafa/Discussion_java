import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka 1");
        int Angka1 = input.nextInt();
        System.out.println("Masukkan Angka 2");
        int Angka2 = input.nextInt();
        input.close();
        // penyimpanan sementara
        int KPK = 0;
        //for KPK dan FPB
        for (int x = 1 ; x<=Angka2 ; x++) {
            //penyimpanan sementara ditambah Angka1
            KPK = (KPK+Angka1);
            
            //hasil faktor angka2
            if (KPK % Angka2 == 0) {
                
                // PRINT        
                System.out.println("KPK nya adalah : "+ KPK);
                break;
            }
        }
    }
}
