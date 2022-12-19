package Day15WhileLoop;

import java.util.Scanner;

public class C02_kull {
    public static void main(String[] args) {
        //Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf girin");
        String harf=scan.next();

       char charHarf=harf.charAt(0);


      for (int i = (charHarf+1); i <(charHarf+4 ); i++) {
            System.out.print((char)(i)+" ");

        }






    }
}
