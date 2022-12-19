package Day15WhileLoop;

import java.util.Scanner;

public class soru2_usHesapla {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        //olusturun
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ussunu hesaplamak istedginiz sayi girin:");
        int sayi = scan.nextInt();
        System.out.println("lutfen us giriniz:");
        int us = scan.nextInt();
       usHesapla(sayi,us);
    }
    public static void usHesapla(int deger ,int kat){
        int tekrar=1;
       int sonuc=1;
        while (tekrar<=kat){
                    sonuc=deger*sonuc;
                    tekrar++;
        }
        System.out.println("sonuc: "+ sonuc);
    }

}