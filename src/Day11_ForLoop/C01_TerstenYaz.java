package Day11_ForLoop;

import java.util.Scanner;

public class C01_TerstenYaz {
    public static void main(String[] args) {

        //kullanicidan aldiginiz bir stringi tersten yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen tersine yazmak istedginiz metin giriniz");
        String metin=scan.nextLine();
        String tersMetin="";


        for (int i =metin.length()-1; i >=0 ; i--) {
            //tersMetin+=metin.substring(i,i+1);
            tersMetin+=metin.charAt(i);

            }

        System.out.println(tersMetin);





    }
    static {
        System.out.println("stattic calişti");
    }
}
