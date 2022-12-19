package Ders14;

import java.util.Scanner;

public class C03_ifElse {
    public static void main(String[] args) {
        //Klavyeden girilen su sıcaklığına göre suyun
        // katı, sıvı yada gaz halinde bulunduğunu bulan program.
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sıcaklık değeri girin");
        double derece= scan.nextDouble();
        if (derece<0){
            System.out.println("kati");
        } else if (derece<=100) {
            System.out.println("sıvı");

        }else {
            System.out.println("gaz");
        }
    }
}
