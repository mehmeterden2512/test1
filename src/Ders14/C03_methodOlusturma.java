package Ders14;

import java.util.Scanner;

public class C03_methodOlusturma {
    public static void main(String[] args) {
        /*
                Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        sonuclarini donduren bir method olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println(asalSayiMi(sayi));

    }

    public static boolean asalSayiMi(int sayi) {
        boolean asalSayimi =true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {

                System.out.println(sayi + " sayisi asal degil");

                break;

            }

        }
        System.out.println(sayi+" sayisi asal");
      return asalSayimi;
    }
}