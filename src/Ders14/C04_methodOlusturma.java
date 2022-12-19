package Ders14;

import java.util.Scanner;

public class C04_methodOlusturma {
    public static void main(String[] args) {

        /*Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
                bolenleri sayisini bulup bize donduren bir method olusturun

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi girin:");
        int sayi=scan.nextInt();

            bolenleriBulma(sayi);

    }
    public static int bolenleriBulma(int sayi){
        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                System.out.print(i+" ");
            }
        }
        return sayi;
    }

}
