package Ders14;

import java.util.Scanner;

public class C03_sifrebranch {
    static Scanner scan = new Scanner(System.in);


        //Soru 2- Kullanicidan bir sifre girmesini isteyin.
        // Girilen sifreyi asagidaki sartlara gore
        //kontrol edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //- Sifre kucuk harf icermelidir
        //- Sifre buyuk harf icermelidir
        //- Sifre ozel karakter icermelidir
        //- Sifre en az 8 karakter olmalidir
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            String girilenSifre = "";
            int sifreUygunPuani = 0;
            int sifreUygunYeniPuani = 0;
            // 4 sart var her sarti sagladiginda 1 puan alacak
            // puani 4 olmadigi surece loop calisacak
            // ilk 3 madde icin tum karakterlerin degil, bir tanesinin sarti saglamasi yeterli olacak
            // bunun icin tum harfleri tek tek kontrol edecek bir mekanizma lazim
            do {
                System.out.println("Lutfen bir sifre giriniz");
                girilenSifre = scan.nextLine();
                // - Sifre kucuk harf icermelidir
                sifreUygunPuani = 0;
                sifreUygunYeniPuani = 0;
                for (int i = 0; i < girilenSifre.length(); i++) {
                    if (girilenSifre.charAt(i) >= 'a' && girilenSifre.charAt(i) <= 'z') {
                        sifreUygunPuani++;
                        break;
                    }
                }
                if (sifreUygunPuani == sifreUygunYeniPuani) {
                    System.out.println("Sifre kucuk harf icermelidir");
                }
                sifreUygunYeniPuani = sifreUygunPuani;
                //- Sifre buyuk harf icermelidir
                for (int i = 0; i < girilenSifre.length(); i++) {
                    if (girilenSifre.charAt(i) >= 'A' && girilenSifre.charAt(i) <= 'Z') {
                        sifreUygunPuani++;
                        break;
                    }
                }
                if (sifreUygunPuani == sifreUygunYeniPuani) {
                    System.out.println("Sifre buyuk harf icermelidir");
                }
                sifreUygunYeniPuani = sifreUygunPuani;
                //- Sifre ozel karakter icermelidir
                String ozelKarakterler = "§±!@#$%^&*()_-+=|[{]}?/>.<,";
                for (int i = 0; i < girilenSifre.length(); i++) {
                    if (ozelKarakterler.contains(girilenSifre.substring(i, i + 1))) {
                        sifreUygunPuani++;
                        break;
                    }
                }
                if (sifreUygunPuani == sifreUygunYeniPuani) {
                    System.out.println("Sifre ozel karekter icermelidir");
                }
                sifreUygunYeniPuani = sifreUygunPuani;
                //- Sifre en az 8 karakter olmalidir
                if (girilenSifre.length() >= 8) {
                    sifreUygunPuani++;
                } else {
                    System.out.println("sifre en az 8 karakter olmalidir");
                }
            } while (sifreUygunPuani != 4);
            System.out.println("Sifreniz basari ile kaydedilmistir");
        }
    }


