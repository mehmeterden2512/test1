package Ders12;

import java.util.Scanner;

public class C05ifeElseStatements {
    public static void main(String[] args) {

       //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kilonozu giriniz");
        double kg= scan.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy=scan.nextDouble();
        double vke=(kg*10000)/(boy*boy);

        if (vke>=30) System.out.println("obez");
        else if (vke>=25) System.out.println("kilolu");
        else if (vke>=20) System.out.println("normal");
        else System.out.println("zayif");





    }
}
