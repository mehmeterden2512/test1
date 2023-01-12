package Ders14;

public class C03_Varargs {
     /*
        Argument olarak tam sayilar alıp son argument haric geriye kalanlari toplayip
        son argument  ile carpip
        sonucu yazdiran bir method olusturun
        Not: argument sayisi degişken olabilir

         */
    // islemYap(3,4,5,5,7);
     public static void main(String[] args) {
         islemyap(3,4,5,5,7);
     }

    private static void islemyap(int... sayilar) {
         int toplam=0;
        for (int each:sayilar
             ) {
            toplam+=each;
        }
        /*
        varargs butun sayıları aldıgı için son index ' sadece varargs kullanarak ayıramadıgımız
        icin önce hepsini topladim sonra son index i cıkardım sonra da son indexle kalan toplamı carptim :)
        bunu sonuca atıp sonucu yazdirdim gormek ve kontrol etmek icinde sayıiar toplamını da once yazdirdim
         */
        System.out.println("sayialar toplami :"+toplam +" son index "+sayilar[sayilar.length-1]);
        toplam=toplam-sayilar[sayilar.length-1];
        int sonuc=toplam*sayilar[sayilar.length-1];
        System.out.println(sonuc);
    }
}
