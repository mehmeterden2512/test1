package Ders01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        //Verilen bir array’deki tekrar eden elementleri silerek, her element’den
        //sadece bir tane olacak sekilde yeni bir array olusturun

        int [] arr={1,2,3,1,2,5,6,2,3,8,7,8,4,6,1,2,3,4,6,};

       Set<Integer> sayilar=new HashSet<>();

        Long basganlıc=System.currentTimeMillis();
        for (int each:arr
             ) {
            sayilar.add(each);
        }

        int [] arrYeni=new int[sayilar.size()];//[0,0,0]
            int index=0;
        for (int eachSet:sayilar
             ) {
            arrYeni[index]=eachSet;
            index++;
        }
        System.out.println("arrnin son hali : "+Arrays.toString(arrYeni));//arrnin son hali : [1, 2, 3, 4, 5, 6, 7, 8]
        Long bitis=System.currentTimeMillis();

    }
}
