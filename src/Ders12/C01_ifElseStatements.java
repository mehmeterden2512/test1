package Ders12;

import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {
           //Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
           // sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
           //istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen mesafe km olarak  girin");
       long mesafe=scan.nextLong();
        System.out.println("lütfen çevirmek istediğiniz parametreyi girin");

       String typ1=scan.next();

   if (typ1.toLowerCase().equals("cm")){
       System.out.println(mesafe*10000);
   } else if (typ1.toLowerCase().equals("m")) {
       System.out.println(mesafe*1000);

   }else {
       System.out.println("istediğiniz birim sisteme kayitli degil");
   }


    }
}
