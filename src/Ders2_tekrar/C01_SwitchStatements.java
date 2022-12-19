package Ders2_tekrar;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise
        // “Simdi calisma zamani tatile .. gun var” seklinde
        // hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani”
        // yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismini giriniz");
        String girilenGun=scan.next();
        String kullanilacakGun=girilenGun.toLowerCase();
        /*
        String ifadelr case sensitive dir.
        kullnacinin pazar,PAzar vb farkli  yazma ihtimali var
        kullanicinin girdiği kalici olarak  direkt degistirmek tercih edilmez
        kullanicinin girdigi degeri degistirip yeni bir variable atama yaparak kodlarda yeni degeri kullaniriz

         */
        switch (kullanilacakGun) {
            case "pazartesi":
                System.out.println(girilenGun + " şimdi çalışma zamani tatile 4 gün var");
                break;
            case "sali":
                System.out.println(girilenGun + " şimdi çalışma zamani tatile 3 gün var");
                break;
            case "çarsamba":
                System.out.println(girilenGun + " şimdi çalışma zamani tatile 2 gün var");
                break;
            case "persembe":
                System.out.println(girilenGun + " şimdi çalışma zamani tatile 1 gün var");
                break;
            case "cuma":
                System.out.println(girilenGun + " şimdi çalışma zamani tatile 1 gün var");
                break;
            case "cumartesi":

            case "pazar":
                System.out.println(girilenGun + " şimdi dinlenme zamani");
                break;
            default:
                System.out.println("hatali giris");

        }


    }
}
