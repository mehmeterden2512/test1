package Ders12;

import java.util.Scanner;

public class C03_ifElse {
    public static void main(String[] args) {// Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);
        if (harf>='a'&& harf<='z')
        {
            System.out.println((char) (harf - 32));
        }
         else{
            System.out.println("harf");
        }


    }
}
