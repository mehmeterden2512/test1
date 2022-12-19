package Ders12;

import java.util.Scanner;

public class C04_ifElse {
    public static void main(String[] args) {
        //kullanicidan cinsiyetini ve yaşın alin
        //kadinsa 60yas ve üzeri,erkekse 65 yas ve üzeri
        //değilse ...yil daha çalişman gerekir yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi girin");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("lütfen yaşınizi girin:");
        double yas=scan.nextDouble();

        if (cinsiyet=='E'&&yas<=65){
            System.out.println("emekli olmak için"+(65-yas)+"yil çalişman gerekir");
        } else if (cinsiyet=='E'&&yas>65) {
            System.out.println("emekli olabilirsin");

        }else
        if (cinsiyet=='K'&&yas<60){
            System.out.println("emekli olmak için"+(60-yas)+"yil daha çalişmalisin");
        } else if (cinsiyet=='K'&&yas>=60) {
            System.out.println("emekli olabilirsin");

        }else {
            System.out.println("gecersizi giriş");
        }
    }}
