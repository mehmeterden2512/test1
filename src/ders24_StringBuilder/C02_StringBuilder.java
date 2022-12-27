package ders24_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Veli Cem");
        sb1.delete(4,7);//ilk index dahil,2.index haric olacak sekide siler

        System.out.println(sb1);//Velim
        sb1.deleteCharAt(4);
        System.out.println(sb1);// veli

        sb1.insert(4," Han");

        System.out.println(sb1);//Veli Han

        sb1.reverse();
        System.out.println(sb1);//naH ileV

    }
}
