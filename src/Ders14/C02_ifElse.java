package Ders14;

import java.util.Scanner;

public class C02_ifElse {
    public static void main(String[] args) {
        //Bir mağazadan alınan ürünlerde 30 TL ve üzerinde kargo bedava,
        // 30 TL altında 6 lira kargo ücreti alınmaktadır.
        // Kullanıcıdan alınan toplam ödemeye göre ödenmesi gereken tutarı gösteren programı yazın
        Scanner scan=new Scanner(System.in);
        double toplam=scan.nextDouble();
        if (toplam>=30){
            System.out.println(toplam);
        } else if (0<toplam&&toplam<30) {
            System.out.println(toplam+6);

        }else System.out.println("gecersiz bilgi girişi");

    }
}
