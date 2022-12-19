package Day09_replaceManipulation;

import java.util.Scanner;

public class C04_sorular4 {
    public static void main(String[] args) {
       // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
       // duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
       // basariyla kaydedildi" yazdirin
        //        - ilk harf kucuk harf olmali
        //        - sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sifrenizi girin");
        String sifre=scan.nextLine();
        if ((!(sifre.charAt(0)>='a'&&sifre.charAt(0)<='z'))){
            System.out.println("ilk harf kucuk olmalı");
        } else if
        ((sifre.contains(" "))){
            System.out.println("sifre bosluk icermemeli");
        } else if
        (!(sifre.length()>=10)){
            System.out.println("sifre en az 10 karakter icermeli");
        }else
            System.out.println("sifre basari ile kaydedildi");
    }
}
