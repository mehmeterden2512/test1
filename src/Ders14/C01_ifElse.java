package Ders14;

import java.util.Scanner;

public class C01_ifElse {
    public static void main(String[] args) {
        //Kullanıcıdan 3 adet sınav notu girmesini isteyin.
        // Girilen sınav notlarının ortalaması 0 ve 50 aralığındaysa ekrana “Kaldınız”,
        // 50 ve 100 aralığındaysa ekrana “Geçtiniz” yazdırın.
        // Eğer bu değerler arasında değilse ekrana “Geçersiz Değer” yazdırın.

        Scanner scan=new Scanner(System.in);
        double not1=scan.nextDouble();
        double not2=scan.nextDouble();
        double not3=scan.nextDouble();
        double ortNot=(not1+not2+not3)/3;
        if (ortNot>=0&&ortNot<=50){
            System.out.println("kaldiniz");
        } else if (ortNot>50&&ortNot<=100) {
            System.out.println("gectiniz");
            
        }else {
            System.out.println("gecersiz not bilgisi");
        }


    }
}
