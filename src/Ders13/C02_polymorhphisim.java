package Ders13;

import java.util.Scanner;

public class C02_polymorhphisim {
    public static void main(String[] args) {
        //- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarini girin");
        double knr1=scan.nextDouble();
        double knr2=scan.nextDouble();
        double knr3=scan.nextDouble();
          if (knr1<=0||knr2<=0||knr3<=0){
              System.out.println("geçersiz giriş");
          }
        System.out.println(knr1==knr2&&knr2==knr3?"eşkenar üçgen":"eşkenar değil");
          Scanner erdo=new Scanner(System.in);
        System.out.println("lütfen iki sayi girin");
        int sayi1= erdo.nextInt();
        int sayi2=erdo.nextInt();
        System.out.println(sayi1>sayi2?sayi1:sayi2);


    }
}
