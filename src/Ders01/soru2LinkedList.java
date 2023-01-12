package Ders01;

import java.util.*;

public class soru2LinkedList {
    /*
    Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not grime islemi
    bittiginde Q’ya basmalidir. Not grime islemi bittikten sonra asagidaki sekilde
    output hazirlayin
    not ortalamasi : …..
    ogrenci sayisi : …..
    ortalama altindaki ogrenci sayisi : ….
    ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi :

         */
    static double ogrenciNotu;
    static String ogrenciAdiSoyadi;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double notLarToplami = 0;
        double notOrtalama = 0;
        int ogrenciSayisi = 0;


        Map<Integer, Double> ogrenciNotlari = new HashMap<>();

        boolean devam = true;
        while (devam) {


            try {

                System.out.println("cıkıs icin Q giriniz \nogrenci notu: ");
                ogrenciNotu = scan.nextDouble();
                ogrenciSayisi++;
                notLarToplami += ogrenciNotu;
                scan.nextLine();
                ogrenciNotlari.put(ogrenciSayisi, ogrenciNotu);

            } catch (InputMismatchException e) {
                System.out.println("not girmeyi bitirmek istiyorsaniz Q ya basın devam etmek icin herhangi bir tusa basın");
                scan.nextLine();
                Character tercih = scan.next().charAt(0);

                if (tercih == 'Q' || tercih == 'q') {
                    System.out.println("ogrenci sayısı : " + ogrenciSayisi + "\nogrenci not ortalamasi : " + (notLarToplami / ogrenciSayisi));
                    devam = false;
                }
            }
        }
        int ortAltOgrSayisi = 0;
        int ort10PuanUstOgrSayisi = 0;
        int ort10PuanAltOgrSayisi = 0;

        for (Double each : ogrenciNotlari.values()
        ) {
            if (each < (notLarToplami / ogrenciSayisi)) {
                ortAltOgrSayisi++;
            }
            if (each < ((notLarToplami / ogrenciSayisi) - 10)) {
                ort10PuanAltOgrSayisi++;
            }
            if (each < (notLarToplami / ogrenciSayisi + 10)) {
                ort10PuanUstOgrSayisi++;
            }
        }
        System.out.println("ortalama altında ki ogrenci sayisi= " + ortAltOgrSayisi +
                "\nortalamanın 10 puan altındaki ogrenci sayisi= " + ort10PuanAltOgrSayisi +
                "\nortalama 10 puan ustundeki ogrenci sayisi= " + ort10PuanUstOgrSayisi);
        System.out.println(ogrenciNotlari);//Gözle kontrol icin Eklenmiştir

    }
}
