package Ders11;

import java.util.Scanner;

public class C04_ternary {
    public static void main(String[] args) {

        /*
        soru:kulllanicidan bir tam sayi alin
        sayi pozitifse ;çift sayi çifsayi dğil uygun olani   yazdirin
        sayi negetifse;üç basamakli ,üçbasamaklı değil uygun olani yazdirin
         */

        Scanner erdo=new Scanner(System.in);
        System.out.println("lütfen bir tam sayi girin");
        int sayi= erdo.nextInt();
        //System.out.println(sayi>0&&sayi%2==0?"çift sayi":"çift sayi değil" sayi>99&&sayi<1000?"üçbasamakli":"üçbasamkli değil");



    }
}
