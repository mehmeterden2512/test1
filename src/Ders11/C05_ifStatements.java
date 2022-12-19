package Ders11;

import java.awt.event.KeyAdapter;
import java.security.Key;
import java.util.Scanner;

public class C05_ifStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli

      olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi ve yaşınizi giriniz" + "\nher girisd enter' a basın");

        char cinsiyet = scan.next().charAt(0);
        String cinsiiyet = scan.nextLine();

        double yas = scan.nextDouble();
        if (yas < 0 || yas > 90) {
            System.out.println("gecersiz giriş");
        } else if (yas < 60 && cinsiiyet.equalsIgnoreCase("Kadın")) {
            System.out.println("emekli olmak için" + (60 - yas) + "yil daha calışman gerekir");

        } else if (yas < 65 && cinsiiyet.equalsIgnoreCase("Kadın")) {
            System.out.println("emekli olabilirsin");
        } else if (yas < 65 && cinsiiyet.equalsIgnoreCase("Erkek")) {
            System.out.println("emekli olmak için" + (65 - yas) + "yil daha calışman gerekir");


        }


    }}

