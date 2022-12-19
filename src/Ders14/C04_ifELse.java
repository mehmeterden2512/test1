package Ders14;

public class C04_ifELse {
    public static void main(String[] args) {
        //
        // Kullanicidan 2 sayi alin
        // ve kullaniciya istedigi islemi sorun
        // +, - , * , / isaretlerinden hangisini girerse
        // 2 sayi icin o islemi yapin
        // bu isaretlerden birini girmezse
        // "yanlis islem tercihi" yazdirin
        int sayi1=20;
        int sayi2= -5;

        char islem='/';
        //if else çözümü

            if (islem=='+'){
                System.out.println(sayi1+sayi2);
            } else if (islem=='-'){
                System.out.println(sayi1-sayi2);
            } else if (islem=='*') {
                System.out.println(sayi1*sayi2);

            } else if (islem=='/') {
                System.out.println(sayi1/sayi2);

            }else {
                System.out.println("gecersiz tercih");
            }


            //switch case
        switch (islem){
            case '+':
                System.out.println(sayi1+sayi2);
                break;
            case '-':
                System.out.println(sayi1-sayi2);
                break;
            case '*':
                System.out.println(sayi1*sayi2);
                break;
            case '/':
                System.out.println(sayi1/sayi2);
                break;
            default:
                System.out.println("gecersiz giris");
        }


    }
}
