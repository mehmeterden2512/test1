package Day09_replaceManipulation;

import java.util.Scanner;

public class C01_TopSorusu {
   static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        //
        //Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan method create ediniz.
        //input=1000m
        //ipucu : do while ile bulabilirsiniz:)


        System.out.println("topu attıgınız yuksekligi giriniz.");

        toplamAlinanYol();
    }

   public static void toplamAlinanYol() {

            double yukseklik=scan.nextDouble();

        double toplamYol=0;
        int yereVurmaSayisi=0;

        do {

            toplamYol+=yukseklik*0.75;
            yereVurmaSayisi++;
            yukseklik*=0.75;

        }while (yukseklik>100);
       System.out.println( " metre yukseklikten bırakilan topun aldiği yol "+toplamYol+"\n"+
                            " yere vurma sayisi "+yereVurmaSayisi);
    }
}
