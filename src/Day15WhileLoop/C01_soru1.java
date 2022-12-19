package Day15WhileLoop;

import java.util.Scanner;

public class C01_soru1 {
    public static void main(String[] args) {
        //Soru : Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse
        //toplami yazdirin

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        while (toplam<=500){
            System.out.println("lutfen toplamak istediginiz sayi girin");
            int sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("Girilen sayilarin toplami:"+toplam);
    }
}
