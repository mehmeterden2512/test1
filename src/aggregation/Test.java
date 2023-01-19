package aggregation;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Hoca hoca1=new Hoca("Mehmet Erden");
        Ogrenci ogrenci1=new Ogrenci(hoca1);
        System.out.println("Danişman: "+ogrenci1.getDanisman().getHocaAdi());
        ogrenci1=null;
        System.out.println("Öğrenci nesnesi silindikten sonraki Hoca: "+hoca1);
        /*
        Main class’ımız içerisinde yeni bir hoca nesnesi oluşturduk.
        Bu hoca nesnesini ogrenci1 adlı öğrencinin danışmanına eşitledik.
        Ardından o öğrencinin danışmanını yazdırdık.
        Bu işlemden sonra öğrenci nesnesine null değer atarsam o danışmanın hayatı hala devam etmekte.
        Yani hoca nesnesinin hayatını öğrenci nesnesi etkilemiyor.
        Bu tür olaylara Aggregation denilmektedir
         */
    }
}
