package Ders01;

import java.util.Scanner;

public class C01_ifElse {
    public static void main(String[] args) {//kullanicidan bir tam sayi alın
        //sayi negatif sayi ise "negatif sayi",
        //sayi rakam ise girilen sayi rakam
        //sayi iki basamakli ise girilen sayi iki basamakli
        //sayi iki basamakli sayidan buyukse buyuk sayı yazdırın

        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        if (sayi<0){
            System.out.println("negatif sayi");
        }
        else if (0<sayi&&sayi<=9){
            System.out.println("girilen sayi rakam");
        } else if (sayi>=10&&sayi<=99) {
            System.out.println("girilen sayi iki basamakli");

        } else if (sayi>99) {
            System.out.println("büyük sayi");

        } else System.out.println("hatali bilgi");


    }
}
