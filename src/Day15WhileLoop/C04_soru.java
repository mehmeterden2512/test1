package Day15WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C04_soru {
    public static void main(String[] args) {
        /*bilgisayarla kendinizin arasında oynayabiliceginiz bir taş kağıt makas oyunu kodlayın
        taraflardan biri 3 kazanma sayısına varana kadar oyun devam etsin
        oyun sonunda outputta
                *oyunu kazanan (yani  ilk önce 3 sayı alan)
                *sizin kazandıgınız el sayısı
                *bilgisayarın kazandıgı el sayısı
                yazsın
                * bilgisayarla sizin seciminizin aynı olabiliceği durumları unutmayın aynı oldugu durumlarda tekrar secim sunulsun size

         */
        //Taş makası, makas kağıdı, kâğıt da taşı yener.
        // Eğer oyuncular aynı durumu seçerse oyun berabere biter.
        int tas = 1;
        int makas = 2;
        int kagit = 3;


        int benimPuan = 0;
        int pcPuan = 0;
        int ben;
        int pc;
        Random rnd = new Random();
        pc = rnd.nextInt(3) + 1;
        Scanner scan = new Scanner(System.in);
        int oyunSayisi = 1;
        System.out.println("Taş makası, makas kağıdı, kâğıt da taşı yener. Eğer oyuncular aynı durumu seçerse oyun berabere biter. ");
        do {

        } while (benimPuan == 3 || pcPuan == 3);
    }
}