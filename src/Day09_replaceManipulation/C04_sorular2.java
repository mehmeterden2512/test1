package Day09_replaceManipulation;

import java.util.Arrays;

public class C04_sorular2 {
    public static void main(String[] args) {
        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.30 €” , input2 : “11.40 €”
        //output : 36.70 €

        String m1="15.30 €";
        String m2="11.40 €";
        String yeniS1=m1.substring(0,5);
        String yeniS2=m2.substring(0,5);
        Double yenix1 = Double.parseDouble(yeniS1);
        Double yenix2 = Double.parseDouble(yeniS2);
        Double toplam = yenix2+ yenix1 ;
        System.out.println("Output: " + String.format("%.2f", toplam).replace(",",".")+"€");


        //Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.
        String metin="java1 ogRe2@nMek3 #ne +Gu=zel";
        String result = metin.replaceAll("[-+.^:,#@=0123456789]","");

        System.out.println("result :"+result.toUpperCase().substring(0,1)+result.toLowerCase().substring(1));

        //for ( int i = 0 ; i < strLength)



      // metin=metin.replaceAll("\\W","");
      ///  metin=metin.replaceAll("\\d","");
       // metin=metin.toLowerCase();
       // metin=metin.replace('j','J');





    }
}
