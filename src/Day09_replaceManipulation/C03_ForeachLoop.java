package Day09_replaceManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_ForeachLoop {
    public static void main(String[] args) {
       //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //- Kelimenin uzunlugu cift sayi ise ilk yarisini
        //- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //yeni bir listeye ekleyip yazdirin


        String [] asd={"mehmet","kitap","memleket","mektebihayriye","aslanparcasi","harbiyeli"};
        System.out.println(kelimeKontrolu(asd));


    }public static List<String> kelimeKontrolu(String[] str){
        List<String> kelimeler=new ArrayList<>();

        Scanner scan=new Scanner(System.in);

        for (String each:str
             ) {
            if (each.length()%2==0){
                kelimeler.add(each.substring(0,each.length()/2));
            }else {
                kelimeler.add(each.substring(each.length()/2));
            }
        }

        return kelimeler;
    }
}
