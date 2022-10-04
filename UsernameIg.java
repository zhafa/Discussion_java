import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hadiah {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */ 
        Scanner input = new Scanner(System.in);
        String ig = input.next();
        input.close();
        // String.length
        /*
         * Username akan dianggap valid apabila diawali karakter @.
         * 1.Apabila jumlah kata dalam username ganjil dan setelah karakter @ adalah
         * huruf vokal, maka akan mendapat reward E-Money. Selain itu, akan mendapat
         * reward Pulsa.
         * 2.Apabila jumlah kata dalam username genap dan setelah karakter @ adalah
         * huruf vokal, maka akan mendapat reward Meet n Greet. Selain itu, akan
         * mendapat reward Kaos.
         * 3.Apabila username tidak valid maka akan menampilkan kalimat
         * "Username tidak valid".
         */

        if (ig.contains("@")) {
 /*GENAP */  
                if (ig.length() % 2 == 1){
                String cek = ig.substring(1, 2);
                 if (cek.equals("a") || cek.equals("i") ||cek.equals("u") || cek.equals("e") || cek.equals("o"))
                 {
                  System.out.println("Reward anda : Meet n Greet"); 
                 } else {
                    System.out.println("Reward anda : Kaos");
                 }
                }
/*GANJIL*/ 
               if (ig.length() % 2 == 0){
                String cek = ig.substring(1, 2);    
                  if (cek.equals("a") || cek.equals("i") ||cek.equals("u") || cek.equals("e") || cek.equals("o"))
                  {
                   System.out.println("Reward anda : E-Money"); 
                  } 
                  else 
                  {
                    System.out.println("Reward anda : Pulsa");
                  }
            
              }
            } else {
                System.out.println("Username tidak valid");
            }
    }
}
