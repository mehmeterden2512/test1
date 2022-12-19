package Day09_replaceManipulation;

import java.util.Scanner;

public class C04_sorular {
    public static void main(String[] args) {

        //Soru 1 : Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir cümle girin"+"\nörnek:\"Ben isimi evden calisarak yapmayi cok seviyorum\"");
        String girilenCumle ="Ben isimi evden calisarak yapmayi cok seviyorum";
            if (girilenCumle.contains("ev")){
                System.out.println("home home sweet home");
            }if (girilenCumle.contains("is")){
            System.out.println("calismak guzeldir");
        }if (girilenCumle.contains("ev")&&girilenCumle.contains("is")){
            System.out.println("Hem ev lazim hem is");
        }if (!(girilenCumle.contains("ev")||girilenCumle.contains("is"))){
            System.out.println("cok calisman lazim");
        }



    }
}
