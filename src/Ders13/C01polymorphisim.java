package Ders13;

import java.util.Scanner;

public class C01polymorphisim {
    public static void main(String[] args) {
        //4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        //zamani” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün numarasi giriniz");
        int gunNo=scan.nextInt();

        if (gunNo<=0||gunNo>7){
            System.out.println("geçersiz giriş");
        } else if (gunNo==1) {
            System.out.println("şimdi çalışma zamani tatile"+(5-gunNo)+"gün var");

        }else if (gunNo==2) {
            System.out.println("şimdi çalışma zamani tatile"+(5-gunNo)+"gün var");

        }else if (gunNo==3) {
            System.out.println("şimdi çalışma zamani tatile"+(5-gunNo)+" gün var");

        }else if (gunNo==4) {
            System.out.println("şimdi çalışma zamani tatile"+(5-gunNo)+" gün var");

        }else if (gunNo==5) {
            System.out.println("şimdi çalışma zamani tatile"+(5-gunNo)+" gün var");

        }else if (gunNo==6) {
            System.out.println("şimdi diinlenme zamani\niyi tatiller");

        }else{
            System.out.println("şimdi diinlenme zamani\niyi tatiller");
        }


    }
}
