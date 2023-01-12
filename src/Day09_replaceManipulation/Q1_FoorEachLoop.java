package Day09_replaceManipulation;

import java.util.Scanner;

public class Q1_FoorEachLoop {
    public static void main(String[]args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cümle girin ve bir  harf girin :");
        String cumle=scan.nextLine();
        System.out.println("aramak istediginiz harfi girin:");
        Character harf=scan.next().charAt(0);

         int sayac=0;

        for (String each:cumle.split("")
             ) {
            if (cumle.contains(Character.toString(harf))){
                if (each.charAt(0)==harf){
                    sayac++;

                }
            }else{
                System.out.println(harf +" harfi "+cumle + " cumlesinde kullanılmamıstır" );
                break;
            }
        }
        System.out.println(harf+ " harfi "+ cumle + " cumlesinde "+sayac+ " adet kullanılmıştır");

        System.out.printf( "%X", 16 );


    }
}
