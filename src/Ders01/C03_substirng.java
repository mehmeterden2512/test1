package Ders01;

public class C03_substirng {
    public static void main(String[] args) {

        String str="Jav ögren, isi kap haho!";
        System.out.println(str.length());//24 karakter
        System.out.println(str.charAt(str.length()/2));
        System.out.println(str.substring(4, 12));
        System.out.println(str.substring((str.length() - 3)));


    }
}
