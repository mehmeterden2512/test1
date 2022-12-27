package day01Mentoring;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class C01_soru1 {
        /*Kullanıcıların matematik hesaplamalarını geliştirmelerine yardımcı olacak bir test uygulaması tasarlayacaksınız.
            Uygulamanın amacı, sınırlı bir süre içinde maksimum sayıda soruyu doğru bir şekilde çözmektir.
            Bu uygulama, rasgele iki ve üç işlemli yine rasgele birkaç tamsayının matematik hesaplamasını oluşturmalıdır.
            1- ve ardından soruyu yazdırır ve
            2- kullanıcıdan yanıtı alır.
            3- Kullanıcı cevabı doğru yazarsa; program, süre bitene kadar bir sonraki rastgele soruyu üretir.

            1. Başlangıç süresi olarak 1,5 dakika verin ve arka arkaya 5 soru doğruysa toplam süreyi 5 saniye artırın
            2. Süre bitince oyunu sonlandırın.
                              3. Oyun için iki seviye uygulayın:
            a) Birinci düzey, rasgele oluşturulan maks 2 basamaklı 2 tam sayı veya rakamı toplama ve çıkarma işlemlerinden
            rasgele birine tabi tutup sorun ve cevabı isteyin 5 doğru cevapta 2. düzeye geçin
            b) İkinci düzey, rasgele oluşturulan maks 2 basamaklı 3 tam sayı veya rakamı
             birbiriyle toplama , çıkarma , çarpma , bölme  işlemlerinden rasgele birine ve ya
             birkaçına tabi tutup sorun ve cevabı isteyin 5 doğru ya da program boyunca toplam 3 yanlış cevapta programı sonlandırın

4. Programın sonunda doğru cevaplanan toplam işlem sayısını puanlayarak puanınını gösterin.
Puanlar: ilk düzey soru başına puan : 5
ikinci düzey sorubaşınauan10

         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sonuc;
        int puan = 0;
        int yanlisSayaci = 3;
        while (puan < 5 && yanlisSayaci >= 0) {
            Random sayi1 = new Random();
            int islenecekSayi1 = sayi1.nextInt(100);
            Random sayi2 = new Random();
            int islenecekSayi2 = sayi2.nextInt(100);
            Random sayi4 = new Random();
            int islemSayisi1 = sayi4.nextInt(2);
            if (islemSayisi1 == 0) {
                System.out.println(islenecekSayi1 + "+" + islenecekSayi2 + "= ?");
                sonuc = islenecekSayi1 + islenecekSayi2;
            } else {
                System.out.println(islenecekSayi1 + "-" + islenecekSayi2 + "= ?");
                sonuc = islenecekSayi1 - islenecekSayi2;
            }
            int cevap = scan.nextInt();
            if (sonuc == cevap) {
                puan++;
                System.out.println("Sorunun cevabı dogrudur : " + puan +
                        "\nKalan yanlis cevaplama hakkiniz : " + yanlisSayaci);
            } else {
                yanlisSayaci--;
                System.out.println("Sorunun cevabı yanlistir. Dogru cevabi : " + sonuc +
                        "\nKalan yanlis cevaplama hakkiniz : " + yanlisSayaci);
            }
            if (puan==5){
                System.out.println("Tebrikler 2. asamaya gectiniz");
            }
            if (yanlisSayaci == -1) {
                System.out.println("Game over. Puan : " + puan);
            }
        }
        sonuc = 0;
        while (puan < 10 && yanlisSayaci >= 0) {
            Random sayi1 = new Random();
            int islenecekSayi1 = sayi1.nextInt(100);
            Random sayi2 = new Random();
            int islenecekSayi2 = sayi2.nextInt(100);
            Random sayi3 = new Random();
            int islenecekSayi3 = sayi3.nextInt(100);
            Random sayi5 = new Random();
            int islemSayisi1 = sayi5.nextInt(4);
            Random sayi6 = new Random();
            int islemSayisi2 = sayi6.nextInt(4);
            // 0= +     1= -    2= *    3= /
            if (islemSayisi1 == 0 && islemSayisi2 == 0) {
                System.out.println(islenecekSayi1 + "+" + islenecekSayi2 + "+" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 + islenecekSayi2 + islenecekSayi3;
            }
            if (islemSayisi1 == 0 && islemSayisi2 == 1) {
                System.out.println(islenecekSayi1 + "+" + islenecekSayi2 + "-" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 + islenecekSayi2 - islenecekSayi3;
            }
            if (islemSayisi1 == 0 && islemSayisi2 == 2) {
                System.out.println(islenecekSayi1 + "+" + islenecekSayi2 + "*" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 + islenecekSayi2 * islenecekSayi3;
            }
            if (islemSayisi1 == 0 && islemSayisi2 == 3) {
                System.out.println(islenecekSayi1 + "+" + islenecekSayi2 + "/" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 + islenecekSayi2 / islenecekSayi3;
            }
            if (islemSayisi1 == 1 && islemSayisi2 == 0) {
                System.out.println(islenecekSayi1 + "-" + islenecekSayi2 + "+" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 - islenecekSayi2 + islenecekSayi3;
            }
            if (islemSayisi1 == 1 && islemSayisi2 == 1) {
                System.out.println(islenecekSayi1 + "-" + islenecekSayi2 + "-" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 - islenecekSayi2 - islenecekSayi3;
            }
            if (islemSayisi1 == 1 && islemSayisi2 == 2) {
                System.out.println(islenecekSayi1 + "-" + islenecekSayi2 + "*" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 - islenecekSayi2 * islenecekSayi3;
            }
            if (islemSayisi1 == 1 && islemSayisi2 == 3) {
                System.out.println(islenecekSayi1 + "-" + islenecekSayi2 + "/" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 - islenecekSayi2 / islenecekSayi3;
            }
            if (islemSayisi1 == 2 && islemSayisi2 == 0) {
                System.out.println(islenecekSayi1 + "*" + islenecekSayi2 + "+" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 * islenecekSayi2 + islenecekSayi3;
            }
            if (islemSayisi1 == 2 && islemSayisi2 == 1) {
                System.out.println(islenecekSayi1 + "*" + islenecekSayi2 + "-" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 * islenecekSayi2 - islenecekSayi3;
            }
            if (islemSayisi1 == 2 && islemSayisi2 == 2) {
                System.out.println(islenecekSayi1 + "*" + islenecekSayi2 + "*" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 * islenecekSayi2 * islenecekSayi3;
            }
            if (islemSayisi1 == 2 && islemSayisi2 == 3) {
                System.out.println(islenecekSayi1 + "*" + islenecekSayi2 + "/" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 * islenecekSayi2 / islenecekSayi3;
            }
            if (islemSayisi1 == 3 && islemSayisi2 == 0) {
                System.out.println(islenecekSayi1 + "/" + islenecekSayi2 + "+" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 / islenecekSayi2 + islenecekSayi3;
            }
            if (islemSayisi1 == 3 && islemSayisi2 == 1) {
                System.out.println(islenecekSayi1 + "/" + islenecekSayi2 + "-" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 / islenecekSayi2 - islenecekSayi3;
            }
            if (islemSayisi1 == 3 && islemSayisi2 == 2) {
                System.out.println(islenecekSayi1 + "/" + islenecekSayi2 + "*" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 / islenecekSayi2 * islenecekSayi3;
            }
            if (islemSayisi1 == 3 && islemSayisi2 == 3) {
                System.out.println(islenecekSayi1 + "/" + islenecekSayi2 + "/" + islenecekSayi3 + " = ?");
                sonuc = islenecekSayi1 / islenecekSayi2 / islenecekSayi3;
            }
            int cevap = scan.nextInt();
            if (sonuc == cevap) {
                puan++;
                System.out.println("Sorunun cevabı dogrudur : " + puan +
                        "\nKalan yanlis cevaplama hakkiniz : " + yanlisSayaci);
            } else {
                yanlisSayaci--;
                System.out.println("Sorunun cevabı yanlistir. Dogru cevabi : " + sonuc +
                        "\nKalan yanlis cevaplama hakkiniz : " + yanlisSayaci);
            }
            if (puan==10){
                System.out.println("Tebrikler oyunu tamamladiniz");
            }
            if (yanlisSayaci == -1) {
                System.out.println("Game over. Puan : " + puan);
            }
        }
    }
}


