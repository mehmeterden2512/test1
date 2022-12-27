package ders24_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        //kapasitesi 16 olan bos bir string builder SB olusturur
        System.out.println(sb1.capacity());//16

        StringBuilder sb2=new StringBuilder("Ali Can");
        //yazilan String'uygun kapasitede Sb olusturur
        //ve icine alican yazar.

        System.out.println(sb2.capacity());

        StringBuilder sb3=new StringBuilder(7);

            sb3.append("Ali");

            sb3.append(" Kemal");
        System.out.println(sb3);
        StringBuilder sb4=new StringBuilder(7);
        System.out.println(sb4.capacity());
        System.out.println(sb4.length());
        sb4.append("Ali Can");
        System.out.println(sb4.capacity());
        System.out.println(sb4.length());
        sb4.append("Bilmeyen var mi ? ");
        System.out.println(sb4.capacity());
        System.out.println(sb4.length());

        sb4.append("Inanmayan beri gelsin.");

        System.out.println(sb4.capacity());
        System.out.println(sb4.length());

        sb4.trimToSize();
        System.out.println(sb4.capacity());
        System.out.println(sb4.length());
    }
}
