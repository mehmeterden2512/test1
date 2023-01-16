package day02_Mentoring;

import java.util.*;

public class varMisinYokMusun {

	/*
	 	1-BIR LIST'TE 24 ADET PARA BIRIMI OLUSTURULDU (ORIJINAL ICERIK)
	 	2-Collections.shuffle METHOD'U ILE BU LIST RANDOM SEKILDE KARISTIRILDI
	 	3-BU KARMA PARA BIRIMLERI FOR LOOP ILE HASHMAP ICINE AKTARILDI (BU LISTE AYNI ZAMANDA BIR TREEMAP'E AKTARILDI. NEDENI: MEVCUT PARALARI YAZDIRIRKEN KEYLER VE VALUE'LAR AYNI HIZAYA DENK GELIYORDU VE KULLANICI
	 	  BURADAN KOPYA CEKEBILIRDI :) DOLAYISIYLA FARKLI BIR MAP'TE KARMA OLARAK YAZDIRILDI.
	 	4-KULLANICIDAN KUTULARDAN BIRINI SECMESI ISTENDI
	 	5-KULLANICININ SECTIGI KEY'DEKI PARA BIRIMI BIR VARIABLE'A AKTARILDI VE ARDINDAN KEY ILE BIRLIKTE MAP'TEN SILINDI
	 	6-DAHA SONRA BU VARIABLE'DAKI PARA BIRIMI "YARISMACININ KUTUSU" KEY'I ILE TEKRAR MAP'E EKLENDI
	 	7-ARDINDAN KULLANICIDAN KUTU ACMASI ISTENDI
	 	8-BURADA "THREAD.SLEEP()" METHODU KULLANILDI (KODUN BIRAZ DAHA ELIT GOZUKMESI ICIN)
	 	9-KULLANICININ SECTIGI KEY MAP'TEN KALDIRILDI.
	 	10-HER 5 KUTU ACTIRMADAN SONRA TEKLIF SUNULDU. (TOPLAMDA 4 TEKLIF)
	 	11-BU TEKLIFI SUNMAK ICIN MAP'TEKI KEYLERIN VARIABLE'LARININ TOPLAMINI BULMAK GEREKIYORDU. MAP'LERDE ITERATE (ELEMENTLERI TEKER TEKER GEZEREK ISLEM YAPMAK) YAPMAK ICIN ONCELIKLE MAP'I BIR COLLECTION'A CEVIRMEK
	 	   LAZIM. BUNDAN DOLAYI "Map.Entry<String, Integer> w : kutular.entrySet()" BU SYNTAX KULLANILDI.
	 	12-SON 2 KUTU KALA SON BIR TEKLIF SUNULDU
	 */
static  Scanner scan=new Scanner(System.in);
    static int teklifSayisi=0;
    public static void main(String[] args) throws InterruptedException {
        List<Integer> paraListesi = new ArrayList<>();
        paraListesi.addAll(Arrays.asList(1,2,5,10,25,50,100,200,300,400,500,750,1000,5000,10000,15000,25000,50000,100000,125000,150000,500000,500000,500000));
        Collections.shuffle(paraListesi);
        //System.out.println(paraListesi);
        Map<String,Integer> kutular=new HashMap<>();
        for (int i = 0; i <paraListesi.size() ; i++) {
            Integer kutuNo=i+1;
            kutular.put(kutuNo.toString(),paraListesi.get(i));
        }
        //System.out.println(kutular);
        System.out.println("kutunuzu secin "+"\nmevcut Kutular : "+kutular.keySet());

        TreeMap<String,Integer> kutuParalar=new TreeMap<>(kutular);
        //System.out.println(kutuParalar);
       // System.out.println("Mevcut paralar: "+kutuParalar.values());
        //5-KULLANICININ SECTIGI KEY'DEKI PARA BIRIMI BIR VARIABLE'A AKTARILDI VE ARDINDAN KEY ILE BIRLIKTE MAP'TEN SILINDI
       String secim=scan.next();
       if (!kutular.containsKey(secim)){
           System.out.println("seciminizi mevcut kutular arasında yapmalısınız");
       }else {
           System.out.println("Sectiginiz kutu: " + secim);

           Integer yarismaciKutusu= kutular.get(secim);
           kutular.remove(secim);
           //	6-DAHA SONRA BU VARIABLE'DAKI PARA BIRIMI "YARISMACININ KUTUSU" KEY'I ILE TEKRAR MAP'E EKLENDI
           kutular.put("Yarişmacı Kutusu : ",yarismaciKutusu);
           kutuSec(kutular);
       }

    }

    private static void kutuSec(Map<String, Integer> kutular) throws InterruptedException {
        int kutuAcmaSayisi = 0;
        char teklifSonucu= ' ';
        int teklif = 0;
        do {
            kutuAcmaSayisi++;

            System.out.println("Mevcut Kutular: " +kutular.keySet());
            System.out.println("Lutfen acmak istediginiz kutuyu seciniz: ");
            String secim = scan.next();

            if (kutular.containsKey(secim)){
                System.out.println( "seciminizi mevcut kutular arasında yapmalısınız");
            }else {
                System.out.println("Sectiginiz kutu aciliyor...");
                Thread.sleep(1000);
                System.out.println("Sectiginiz kutu: " + secim);
                System.out.println("Kutudan cikan para: " + kutular.get(secim) +"TL");
                //9-KULLANICININ SECTIGI KEY MAP'TEN KALDIRILDI.
                kutular.remove(secim);
                System.out.println("---------------------------------------------------");
                if(kutuAcmaSayisi%5==0){
                    teklif = teklifVer(kutular);


                    System.out.println("Bu senaryoda size sundugunuz teklif: " + teklif +"TL");

                    System.out.println("Teklifi kabul ediyor musunuz? (E/H)");
                    teklifSonucu= scan.next().toUpperCase().charAt(0);

                    if(teklifSonucu=='E') {
                        System.out.println("Tebrikler kazandiginiz tutar : " + teklif +"TL" );
                        break;
                    } else {

                        continue;
                    }

                }
                if(kutular.size()==2) {

                    teklif = teklifVer(kutular);


                    System.out.println("Bu senaryoda size sundugunuz teklif: " + teklif +"TL");

                    System.out.println("Teklifi kabul ediyor musunuz? (E/H)");
                    teklifSonucu= scan.next().toUpperCase().charAt(0);


                    if(teklifSonucu=='E') {
                        System.out.println("Tebrikler kazandiginiz tutar : " + teklif +"TL");
                        break;

                    } else {

                        System.out.println("Kutunuzdaki tutar : " + kutular.get("Yarismacinin Kutusu") +"TL");
                        break;
                    }
                }

            }

        }while (true);
    }

    private static int teklifVer(Map<String, Integer> kutular) {
        System.out.println("Henuz acmadiginiz paralar: " + kutular.values());

        int kutularToplam=0;
        double teklif=0;



        for (Map.Entry<String, Integer> w : kutular.entrySet()) {//"Map.Entry<String, Integer> w : kutular.entrySet()"
            kutularToplam+=w.getValue();

        }

        switch (teklifSayisi) {
            case 1:
                teklif = kutularToplam*0.10;
                break;
            case 2:
                teklif = kutularToplam*0.15;
                break;
            case 3:
                teklif = kutularToplam*0.20;
                break;
            case 4:
                teklif = kutularToplam*0.25;
                break;
        }

        if(kutular.size()==2) {

            teklif = kutularToplam*0.45;
        }
        return (int) teklif;

    }
}
