package Ders09_Tekrar;

public class C02_ilkTest {
    public static void main(String[] args) {
        // Gittigimiz web sayfasindan aldigimiz
        // String arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin
        String input = "1-48 of 87 results for \"nutella\"";

        int indexOf=input.indexOf("of");
        int indexResults=input.indexOf("results");
        String sonucSayisi=input.substring(indexOf+3,indexResults-1);
        System.out.println(sonucSayisi);//87
        int sonucSayisiInt=Integer.parseInt(sonucSayisi);
        System.out.println(sonucSayisiInt);//87

         // arama sayisinin 50'den fazla oldugunu test edin

        if (sonucSayisiInt>50){
            System.out.println("nutella arama sonucu 50'den fazla test PASSED");
        }else {
            System.out.println("nutella testi FAİLLED");
        }



    }
}
