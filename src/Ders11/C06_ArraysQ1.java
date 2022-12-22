package Ders11;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArraysQ1 {
    public static void main(String[] args) {
       /* Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]

        */
        int[] sayilar = {1, 2, 3, 4,-3,-5,-7, 5, 9, 10};
        List<Integer> mm=new ArrayList<>();
        for (int i = 1; i <sayilar.length ; i++) {
            mm.add(sayilar[i]);
        }
        mm.add(sayilar[0]);
        System.out.println(mm);
        for (int i = 0; i <mm.size() ; i++) {
            sayilar[i]= mm.get(i);
        }
        System.out.println(Arrays.toString(sayilar));
    }
}
