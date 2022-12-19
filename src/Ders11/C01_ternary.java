package Ders11;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {

        /*
        soru-1kullnicadan bir sayi isteyiin ,sayi kontrol edin beş ile bölenbilyorsa beşin tam kati
        değilse tam kati değil yaazdirin
         */



        int sayi=85;

        System.out.println(sayi%5==0?"5'in tam kati":"5'in tam kati değil");

        sayi=sayi<=0?sayi+16:sayi-16;
        System.out.println(sayi+5);

    }
}
