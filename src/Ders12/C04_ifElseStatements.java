package Ders12;

import java.util.Scanner;

public class C04_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int urunAdedi= scan.nextInt();
        System.out.println("urunun liste fiyatini giriniz");
        double listeFiyati= scan.nextDouble();
        System.out.println("Musteri kartiniz var mi? \nE:Evet  H:Hayir");
        char kartVarmi=scan.next().charAt(0);
        if (kartVarmi=='E' && urunAdedi>10 ){
            System.out.println("%20 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.8);
        } else if (kartVarmi=='E' && urunAdedi>0) {
            System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.85);
        } else if (kartVarmi=='H' && urunAdedi>10) {
            System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.85);
        } else if (kartVarmi=='H' && urunAdedi>0) {
            System.out.println("%10 indirimli toplam fiyat : " + urunAdedi*listeFiyati*0.9);
        }else{
            System.out.println("Hatali bilgi");

    }
}}
