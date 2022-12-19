import java.util.Scanner;

public class C01_methodOlusturma {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        //baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        //bir method olusturun.
        //- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        //mesaji verin
        //- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        //yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz:");
        String girilenCumle=scan.nextLine();
        System.out.println("lutfen baslangic degeri giriniz:");
        int start=scan.nextInt();
        System.out.println("lutfen bitis degeri giriniz:");
        int end=scan.nextInt();
        int index=girilenCumle.length()-1;

        if (start>end){
            System.out.println("baslangic degeri bitis degerinden kucuk olmalidir");
        } else if (start>index || end>index) {
            System.out.println("baslangic veya bitis degeri daha kucuk girmelisin");
        }else {
            System.out.println(aradakiHarfler(girilenCumle,start,end));
        }
    }

    public static String aradakiHarfler(String cümle ,int start, int end) {

        //char baslangic = cümle.charAt(0);
       // char bitis = cümle.charAt(cümle.length()-1);
        String aradakiHarfler =  "";

        for (int i = start; i < end ; i++) {
           // aradakiHarfler+=charAt(i)+" ";
            System.out.print(cümle.charAt(i));

        }
       return aradakiHarfler;
    }
}