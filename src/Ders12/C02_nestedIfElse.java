package Ders12;

import java.util.Scanner;

public class C02_nestedIfElse {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ürün adedini girin");
        int urunAdedi=scan.nextInt();
        System.out.println("lütfen liste fiyatini girin");
        double listFiyati=scan.nextInt();
        System.out.println("müşteri kartiniz var mı?");
        String musteriKarti=scan.next();
        if (musteriKarti.toLowerCase().equals("evet")){
            if (urunAdedi>=10){
            System.out.println(urunAdedi*listFiyati*0.80);
        } else if (urunAdedi>0) {
                System.out.println(urunAdedi*listFiyati*0.85);
            }else {
                System.out.println("geçersiz giriş");
            }

            } else if (musteriKarti.toLowerCase().equals("hayir")) {
            if (urunAdedi>=10){
                System.out.println(urunAdedi*listFiyati*0.85);
            } else if (urunAdedi>0) {
                System.out.println(urunAdedi*listFiyati*0.90);

            }else {
                System.out.println("gecersiz bilgi girişi");
            }




            } else {
            System.out.println("gecersiz bilgi girişi");



        }


    }
}
