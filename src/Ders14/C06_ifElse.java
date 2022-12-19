package Ders14;

import java.util.Scanner;

public class C06_ifElse {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
        System.out.println("bir gun ismi yaziniz.");
        String gun=scan.next();
        if (gun.toLowerCase().equals("pazaresi")) System.out.println("hafta içi");
        else if (gun.toLowerCase().equals("sali")) System.out.println("hafta içi");
        else if (gun.toLowerCase().equals("çarşamba")) System.out.println("hafta içi");
        else if (gun.toLowerCase().equals("perşembe")) System.out.println("hafta içi");
        else if (gun.toLowerCase().equals("cuma")) System.out.println("hafta içi");
        else if (gun.toLowerCase().equals("cumartesi")) System.out.println("dinlenme zamani");
        else if (gun.toLowerCase().equals("pazar") )System.out.println("dinlenme zamani");

        else System.out.println("gecersiz gun bilgisi. Lutfen kucuk harfle girmeyi deneyiniz.");


    }
}
