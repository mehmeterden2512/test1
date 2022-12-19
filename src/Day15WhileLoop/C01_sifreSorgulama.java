package Day15WhileLoop;

import java.util.Scanner;

public class C01_sifreSorgulama {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        //kontrol edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //- Sifre kucuk harf icermelidir
        //- Sifre buyuk harf icermelidir
        //- Sifre ozel karakter icermelidir
        //- Sifre en az 8 karakter olmalidir

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sifrenizi girin");
        String sifre = scan.nextLine();
        boolean sifreDogrumu = true;
        int sayac=0;


      do {
          if (sifre.length() <= 8) {
              System.out.println("girilen sifre hatali sifre en az seekiz karakterden olusmalidir");
              sayac++;
          }else if(sifre.length()>8) {
              for (int i = 0; i < sifre.length(); i++) {
                  if (!(sifre.charAt(i) >= 'a' || sifre.charAt(i) <= 'z')) {
                      System.out.println("girilen sifre kuck harf icermelidir");
                      sayac++;
                  }
              }
              for (int i = 0; i < sifre.length(); i++) {
                  if (!(sifre.charAt(sifre.indexOf(i)) >= 'A' || sifre.charAt(sifre.indexOf(i)) <= 'Z')) {
                      System.out.println("girilen sifre kuck harf icermelidir");
                      sayac++;
                  }
              }
          }
              if (!sifre.contains("\\W")){
                  System.out.println("girilen sifre ozel karakter icermelidir");
                  sayac++;
              }


              sifre = scan.nextLine();
          }
          while (sayac != 0) ;

        System.out.println("Sifreniz Kabul edilmistir");

    }
}
