package aggregation;

import java.util.ArrayList;
import java.util.List;

public class OrnekClone {
    static class Ulke implements Cloneable {//interface ile implememyt edilmiş
        List<String> sehirler = new ArrayList<>();
        String adi;
        int nufus;

        @Override
        public String toString() {
            return "Ulke [sehirler=" + sehirler + ", adi=" + adi + ", nufus=" + nufus + "]";
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Ulke u = new Ulke();
            u.adi = this.adi;
            u.nufus = this.nufus;
            u.sehirler.addAll(this.sehirler);
            return u;
        }

    }

    public static void main(String[] args) {
        Ulke ulke1 = new Ulke();
        ulke1.adi = "Türkiye";
        ulke1.nufus = 75000000;
        ulke1.sehirler.add("Tokat");
        ulke1.sehirler.add("Ankara");
        ulke1.sehirler.add("Istanbul");

        System.out.println("Ulke 1 :" + ulke1);

        Ulke ulke2 = new Ulke();
        ulke2.adi = "Fransa";
        ulke2.nufus = 60000000;
        ulke2.sehirler.add("Nice");
        ulke2.sehirler.add("Marsellie");
        ulke2.sehirler.add("Paris");

        System.out.println("Ulke 2 :" + ulke2);


        Ulke ulke3 = ulke1;

        System.out.println("Ulke1 Ulke3'e atandı / ulke3 :" + ulke3);

        ulke3.adi = "Italya";
        System.out.println("Ulke3 adı italya oldu / Ulke 1 :" + ulke1); // 3 değiştirildi ama bir ekrana basılıyor

        Ulke ulke4 = null;
        try {
            ulke4 = (Ulke) ulke2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ulke4.adi = "Danimarka";
        ulke4.nufus = 100;

        System.out.println("Ulke 4 :" + ulke4);

    }
}
