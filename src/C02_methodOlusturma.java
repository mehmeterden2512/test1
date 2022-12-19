import java.util.Scanner;

public class C02_methodOlusturma {
    public static void main(String[] args) {

        /*
                Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
        input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */
        Scanner erd=new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz:");
        String adiniz=erd.nextLine();
        System.out.println("lutfen soyadinizi giriniz:");
        String soyadiniz=erd.nextLine();
        System.out.println(isimDuzenleme(adiniz,soyadiniz));

    }
    public static String isimDuzenleme(String isim,String soyIsim){
        String duzeltilmisIsim="";
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        soyIsim=soyIsim.substring(0).toUpperCase();
        duzeltilmisIsim=isim+" "+soyIsim;
        return duzeltilmisIsim;
    }
}
