package Ders11;

import java.util.Arrays;
import java.util.Scanner;

public class C07_ArraysQ2 {
    public static void main(String[] args) {
        /*Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
            donduren bir method olusturun

         */
        System.out.println(Arrays.toString(arayOlustur()));
    }
    public static int[] arayOlustur(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediğiniz degeri girin");
        int uzunluk=scan.nextInt();
        System.out.println("eklemek icin element girin ");
        int [] adam=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
                    adam[i]=scan.nextInt();
           if (i!=uzunluk-1){
               System.out.println("eklemek icin element girin ");
           }
        }
        return adam;
    }
}
