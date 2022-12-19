package Ders11;

import java.util.Map;
import java.util.Scanner;

public class C02_ternary  {
    public static void main(String[] args) {

        /*
        kullanicidan bir harf isteyin girilen karakter küçük harf ise onu büyük harf ile yazdirin
        değil ise girilen harf yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf girin");
        char krktr=scan.nextLine().charAt(0);

        System.out.println(krktr>='a'&&krktr<='z'? (char)(krktr-32):krktr);





    }
}
