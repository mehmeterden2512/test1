package Ders09_Tekrar;

public class C05_ilkTestTekrar {
    public static void main(String[] args) {
        //Gittiginiz web sayfasindan aldimiz
        //String arama sonuclarinda
        //arama sayisinin 50'den fazla oldugunu test edin

        String input="1-48 of 87 results for\"nutella\"";

        int indexOf=input.indexOf("of");
        int indexResults=input.indexOf("results");
        String sonucIndex=input.substring(indexOf+3,indexResults-1);

        int sonucSayisi=Integer.parseInt(sonucIndex);

        if (sonucSayisi>50){
            System.out.println("nutella arama sonuc sayisi PASSED");
        } else if (sonucSayisi<50) {
            System.out.println("nutella arama sonuc sayisi FAİLED");

        }


    }
}
