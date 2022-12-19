package Day15WhileLoop;

import java.util.Scanner;

public class C02_Soru2 {
    public static void main(String[] args) {
        /*
                    Soru : Kullanicidan Kullanicidan sifre
            isteyin asagidaki sartlari saglamayan
            sifrelerde hatalari yazdirip,
            kullanicinin yeni sifre girmesi isteyin
            Gecerli bir sifre yazilincaya kadar bu
            islemi tekrar edin gecerli sifre
            yazilinca “sifreniz basari ile
            kaydedildi” yazdirin
            sartlar :
            - sifrenin ilk karakteri kucuk harf
            olmali
            - sifrenin son karakteri sayi olmali

         */
        Scanner st=new Scanner(System.in);

        boolean sifreDogrumu=false;
        char ilkHarf;
        char sonHarf;
        while (!sifreDogrumu){
            System.out.println("lutfen sifrenizi girin");
            String sifre=st.nextLine();
            ilkHarf=sifre.charAt(0);
            sonHarf=sifre.charAt(sifre.length()-1);
            if(ilkHarf<'a'||ilkHarf>'z'){
                System.out.println("sifrenin ilk harfi kucuk harf olmali");
            } else if (sonHarf<0||sonHarf<9) {
                System.out.println("siferenin son karakteri rakam olmali");
                
            }else {
                System.out.println("sifre basari ile kaydedildi");
                sifreDogrumu=true;
            }
        }

    }
}
