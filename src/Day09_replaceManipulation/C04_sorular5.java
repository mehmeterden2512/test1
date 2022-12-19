package Day09_replaceManipulation;

import java.util.Scanner;

public class C04_sorular5 {
    public static void main(String[] args) {
        //Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lüttfen isminizi girin");
        String isim=scan.nextLine();
        System.out.println("lütfen soy isminiz girin:");
        String soyIsim=scan.nextLine();
        if (isim.length()>soyIsim.length()){
            System.out.println(isim.toUpperCase().substring(0,1)+isim.toLowerCase().substring(1)+" "+soyIsim.toUpperCase().substring(0,1)+soyIsim.toLowerCase().substring(1));
        } else if (isim.length()<soyIsim.length()) {
            System.out.println(isim.toUpperCase().substring(0,1)+isim.toLowerCase().substring(1)+" "+soyIsim.toUpperCase().substring(0));

        }


    }
}
