import java.io.*;
import java.util.*;

public class printFormat {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner input = new Scanner (System.in);
     
     String java = input.next();
     int java1 = input.nextInt ();
     
     String cpp = input.next();
     int cpp1 = input.nextInt();
     
     String python = input.next();
     int python1 = input.nextInt();
     
     System.out.println ("================================");
     System.out.format ("%-15s%03d\n",java,java1);
     System.out.format ("%-15s%03d\n",cpp,cpp1);
     System.out.format ("%-15s%03d\n",python,python1);
     System.out.println ("================================");  
    }
}
