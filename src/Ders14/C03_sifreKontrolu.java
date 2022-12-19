package Ders14;

import java.util.Scanner;

public class C03_sifreKontrolu {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        //kontrol edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //- Sifre kucuk harf icermelidir
        //- Sifre buyuk harf icermelidir
        //- Sifre ozel karakter icermelidir
        //- Sifre en az 8 karakter olmalidir
      /*  Scanner str = new Scanner(System.in);
        System.out.println("lutfen bir sifrenizi girin:");

        boolean sifreKontrol = true;
        int flag = 0;
        do { //- Sifre kucuk harf icermelidir
            String sifre = str.nextLine();
            for (int i = 0; i < sifre.length() - 1; i++) {
                if (!(sifre.charAt(i) >= 'a' || sifre.charAt(i) <= 'z')) {
                    System.out.println(" Sifre kucuk harf icermelidir");
                    flag++;
                }
                //- Sifre buyu k harf icermelidir
                if (!(sifre.charAt(i) >= 'A' || sifre.charAt(i) <= 'Z')) {
                    System.out.println(" Sifre kucuk harf icermelidir");
                    flag++;
                }
            }
            //- Sifre ozel karakter icermelidir
            if (!sifre.contains("\\W")) {
                System.out.println("sifre ozel karakter icermelidir");
                flag++;
            }
            if (sifre.length() < 8) {
                System.out.println("Sifre en az 8 karakter olmalidir");
                flag++;
            }
            if (flag == 0) {
                sifreKontrol = false;
            }
            while (sifreKontrol) {

            }
            System.out.println("sifre kaydi basarili");

        }}
    }

       */

    }}