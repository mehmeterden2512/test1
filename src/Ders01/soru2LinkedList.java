package Ders01;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double notLarToplami=0;
        double notOrtalama=0;
        int ogrenciSayisi=0;
        double ogrenciNotu;
        LinkedList<Integer> ogrenciNotlari=new LinkedList<>();
        boolean devam=true;
        while (devam){
            ogrenciNotu=scan.nextDouble();
            ogrenciSayisi++;
            try {
                System.out.println("bitirmek icin q ya basın ogrenci notu: ");
                notLarToplami+=scan.nextInt();

            } catch (InputMismatchException e) {
                if (scan.nextInt()=='q'||scan.nextInt()=='Q'){
                    System.out.println("ogrenci not ortalamasi : "+(notLarToplami/ogrenciSayisi));
                }
            }
        }
    }
}
