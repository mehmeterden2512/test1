package Day15WhileLoop;

import java.util.Scanner;

public class soru0abasinca {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        //istediginde 0'a basmasini soyleyin
        //Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        //bunlarin toplaminin kac oldugunu yazdirin
        //Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        //negatif sayiyi sayi adedine ve toplama eklemeyin

        Scanner scan=new Scanner(System.in);
        System.out.println("toplanmak uzere sayinizi girin \nbitirmek istedginizde 0 a basin sayi:");
        int sayi=scan.nextInt();
        int sayac=1;
        int girlToplam=0;
        if (sayi<0){
            System.out.println("negatif sayi kullanamazsiniz ");

        }else {
            while (sayi!=0){

                girlToplam+=sayi;
                sayac++;
                System.out.println("toplanmak uzere sayinizi girin \nbitirmek istedginizde 0 a basin sayi:");
                sayi = scan.nextInt();
            }
            System.out.println("girilen "+sayac+" sayinin toplami ="+girlToplam);
        }





    }
}
