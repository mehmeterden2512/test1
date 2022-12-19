package Ders13;

import java.util.Scanner;

public class C03_ternary {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi girin");
        double sayi=scan.nextDouble();
        System.out.println(sayi>0?sayi:Math.abs(sayi));



    }
}
