package Ders13;

import java.util.Scanner;

public class C04_switch {
    public static void main(String[] args) {
        //- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println(" lütfen bir rakam giriniz");
      int rakam=scan.nextInt();

      switch(rakam) {
          case 1:
              System.out.print(" bir");
              break;
          case 2:
              System.out.print(" iki");
              break;
          case 3:
              System.out.print(" üç");
              break;
          case 4:
              System.out.print(" dört");
              break;
          case 5:
              System.out.print(" beş");
              break;
          case 6:
              System.out.print(" altı");
              break;
          case 7:
              System.out.print(" yedi");
              break;
          case 8:
              System.out.print(" sekiz");
              break;
          case 9:
              System.out.print(" dokuz");
              break;

          default:System.out.println("gecersiz giriş");
      }

    }
}
