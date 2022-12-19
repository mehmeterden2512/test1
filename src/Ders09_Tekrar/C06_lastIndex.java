package Ders09_Tekrar;

public class C06_lastIndex {
    public static void main(String[] args) {
    //verilen str'da cok kelimesinin kullanimini kontrol edip
        //-cok kelimesi kullanilmamis
        //-bir kere kullanilmis
        //-birden fazla kullanilmis
        //-sonuclarindan uygun olani yazdirin
        //Javayi iyi ogrenmek icin cok calısmam lazim cok

        String str="Javayi iyi ogrenmek icin cok calısmam lazim cok";
        int indexCok=str.indexOf("cok");
        int lastIndexCok=str.lastIndexOf("cok");
        if (!str.contains("cok")){
            System.out.println("cok kelimesi kullanilmamis");
        } else if (indexCok==lastIndexCok) {
            System.out.println("bir kere kullanilmis");

        } else if (!(indexCok==lastIndexCok)) {
            System.out.println("-birden fazla kullanilmis");

        }


    }
}
