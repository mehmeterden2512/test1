package day01Mentoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_ProjeIlkSorusu {
            /* 30 Aralik 2023 saat 22.00
        Problem Tanımı :
        Basit 4 işlem yapan bir hesap makinesi kodlayınız....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.

        ***cikan sonucla yeni bi islem yaptirmayi sectirip isleme devam ettirin
        ***hesap makinesi ve islemler methodla calissin.
        */
    static Scanner scan = new Scanner(System.in);
    static List<Double> hesaplananlarList = new ArrayList<>();
    static char islem;
    static List<Character> islemList = new ArrayList<>(Arrays.asList('+', '-', '*', '/'));//kullanıcı farklı bir giriş yaparsa kont.Etmek için


    public static void main(String[] args) {


        double sonuc;
        boolean islemeDevam = true;
        char cevap;
            hesapMakinasi();
        do {



            System.out.println("işleme devam etmek istiyor musunuz?" +
                    "\n E:Devam etmek istiyorum H:Devam etmek istemiyorum sonuclarımı göster tercihlerini secin");
            cevap = scan.next().charAt(0);
            if (cevap == 'E' || cevap == 'e') {
                hesapMakinasi();
            } else if (cevap == 'H' || cevap == 'h') {
                System.out.println(" Hesapladıgım sayılar " + hesaplananlarList);
                islemeDevam = false;
            } else {
                System.out.println(" E:Devam etmek istiyorum H:Devam etmek istemiyorum sonuclarımı göster tercihlerini secin");

            }
        } while (islemeDevam);

    }

    private static double hesapMakinasi() {
        System.out.println("Lutfen yapmak istediğiniz işlemi secin \'+\':toplama,\'-\':bölme,\'*\':carpma,\'/\':bölme");
        islem = scan.next().charAt(0);
        if (!islemList.contains(islem)){ //kullanici olmayan bir işlemi isterse
            System.out.println("!!!hatali  işlem tercihi!!!");
            hesapMakinasi();

        }
            System.out.println("Lutfen hesaplamak istedgiğiniz sayilari giriniz \nsayi1=?");
            int sayi1 = scan.nextInt();
            System.out.println("sayi2=?");
            int sayi2 = scan.nextInt();
            double sonuc = 0;
            switch (islem) {
                case '+':
                    toplama(sayi1, sayi2);
                    break;
                case '-':
                    cikarma(sayi1, sayi2);
                    break;
                case '*':
                    carpma(sayi1, sayi2);
                    break;
                case '/':
                    if (sayi2 == 0) {
                        while (sayi2 == 0) {
                            System.out.println("!!!bölme işlemi 0 ile yapılamaz farklı bir sayi girin");
                            sayi2 = scan.nextInt();
                        }
                        bolme(sayi1, sayi2);

                    } else {
                        bolme(sayi1, sayi2);
                    }

                    break;
                default:
                    while (!islemList.contains(islem)) {
                        System.out.println("hatali secim tekrar secim yaptinız!");
                        hesapMakinasi();
                    }


            }

            return sonuc;

        }


    private static double bolme(int sayi1, double sayi2) {
        double sonuc = sayi1 / sayi2;
        System.out.println(sayi1 + " " + islem + " " + sayi2 + " = " + sonuc);
        hesaplananlarList.add(sonuc);
        return sonuc;

    }


    private static double carpma(int sayi1, double sayi2) {

        double sonuc = sayi1 * sayi2;

        System.out.println(sayi1 + " " + islem + " " + sayi2 + " = " + sonuc);
        hesaplananlarList.add(sonuc);
        return sonuc;

    }


    private static double cikarma(int sayi1, double sayi2) {

        double sonuc = sayi1 - sayi2;

        System.out.println(sayi1 + " " + islem + " " + sayi2 + " = " + sonuc);
        hesaplananlarList.add(sonuc);
        return sonuc;

    }


    private static double toplama(int sayi1, double sayi2) {

        double sonuc = sayi1 + sayi2;

        System.out.println(sayi1 + " " + islem + " " + sayi2 + " = " + sonuc);
        hesaplananlarList.add(sonuc);
        return sonuc;

    }
}
