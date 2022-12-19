package Ders01;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class C02_substring {
    public static void main(String[] args) {

        String erdo="orta dogu ve balkanlarin krali";
        System.out.println(erdo.length());// karakter sayisi :30
        System.out.println(erdo.toUpperCase().charAt(5));//5.karkterbüyük harfi "D"
        System.out.println(erdo.substring(1));
        System.out.println(erdo.substring(25,30));
        System.out.println(erdo.substring(erdo.length()));






    }
}
