package Ders14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_sifreKontrolu {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        //kontrol edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //- Sifre kucuk harf icermelidir
        //- Sifre buyuk harf icermelidir
        //- Sifre ozel karakter icermelidir
        //- Sifre en az 8 karakter olmalidir

                    /*Regex (Regular Expressions)
            \\s : space \\S : space olmayan hersey
            \\s+ : yanyana birden fazla space
            \\d : digits \\D : digit olmayan hersey
            \\w : harf veya rakam \\W : harf veya rakam olmayan hersey

         */i) >= 'a' && sifre.charAt(i) <= 'z')) {
                    kucukHarfSayisi++;
                }
            }
            if (kucukHarfSayisi == 0) {
                System.out.println("sifre kucuk harf icermelidir");
                hataliSifre++;}
            int buyukHarfSayisi = 0;
            for (int i = 0; i < sifre.length(); i++) {
                if (!(sifre.charAt
                String str="oxkvcjnjn151&";
        System.out.println(str.contains("&"));

        //sifreDuzelelt();

    }

    /*private static void sifreDuzelelt() {


        boolean sifremDogruMu = false;
        int hataliSifre = 0;

        do {
            System.out.println("Lutfen sifre girinizi giriniz: ");
            String sifre = scan.nextLine();

            if (sifre.length() < 8) {
                System.out.println("sifre uzunlugu 8 ve daha fazla karakter icermelidir");
                hataliSifre++;
            }

            if (!sifre.contains("\\W")) {
                System.out.println("sifre ozel karakter icermelidir");
                hataliSifre++;
            }


            int kucukHarfSayisi = 0;
            for (int i = 0; i < sifre.length(); i++) {
                if ((sifre.charAt((i) >= 'A' && sifre.charAt(i) <= 'Z')) {
                    buyukHarfSayisi++;
                }
            }
            if (buyukHarfSayisi == 0) {
                System.out.println("sifre buyuk harf icermelidir");
                hataliSifre++;}

            if (hataliSifre == 0) {
                sifremDogruMu = true;
                System.out.println("Sifre basari ile kaydedildi ");}
        } while (sifremDogruMu);

    }

     */
}