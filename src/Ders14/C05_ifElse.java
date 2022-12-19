package Ders14;

import java.util.Scanner;

public class C05_ifElse {
    public static void main(String[] args) {
        /*
        Soru ) Interview Question
Kullanicidan artik yil olup olmadigini kontrol
etmek icin yil girmesini isteyin.
Kural 1: 4 ile bolunemeyen yillar artik yil
degildir
Kural 2: 4 ile bolunup 100 ile bolunemeyen
yillar artik yildir
Kural 3: 4’un kati olmasina ragmegirrrrrrrn 100 ile
bolunebilen yillardan sadece
400’un kati olan yillar artik yildir
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("artik yil olaraak kontrol etmek istediğiniz yili girin");
        int yil=scan.nextInt();
        if (yil%4!=0){
            System.out.println("girilen yil artik yil değildir");
        } else if (yil%4==0&&yil%100!=0){
            System.out.println("girilen yil artık yildir");
        } else if (yil%4==0&&yil%400==0) {
            System.out.println("girilen yil artik yildir");
        } else {
            System.out.println("giriş hatali");

    }
}}
