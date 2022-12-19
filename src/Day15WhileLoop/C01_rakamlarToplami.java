package Day15WhileLoop;

import java.util.Scanner;

public class C01_rakamlarToplami {
    public static void main(String[] args) {
//Soru 2- While loop kullanarak kullanicidan alinan
// sayinin rakamlar toplamini bulun


        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();

        int rakamlarToplmai=0;
        int birlerbasami=0;
        birlerbasami=sayi%10;

      while (sayi>=birlerbasami){
           birlerbasami=sayi%10;
           rakamlarToplmai+=birlerbasami;
            sayi/=10;
        }
      rakamlarToplmai+=sayi;
        System.out.println(rakamlarToplmai);




    }
}
