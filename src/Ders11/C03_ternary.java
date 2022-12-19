package Ders11;

import java.util.Scanner;

public class C03_ternary {
    public static void main(String[] args) {

        /*
        soru_3kullanicidan notunu alin
        notu 502den byükse tebrikler sınıfı geçtin değil se maalesf kaldın yazdirin
         */


        Scanner erdo=new Scanner(System.in);
        System.out.println("lütfen notunuzuu girin:");
        double not= erdo.nextDouble();

        System.out.println(not>=50?"Tebrikler sinifi geçtin":"maalesef kaldin");



    }
}
