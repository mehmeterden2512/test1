package Ders2_tekrar;

import java.sql.Array;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
      // verilen 2 katli bir arraydaki ayni indexe sahip elementleri toplayip
      //          yeni olusturacaginiz tek katli bu array a bu toplamlari atatyin
        int[][] arr={{3,4,5},{2,3,6,7}};

     int enKisaArrayLength=arr[0].length;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length<enKisaArrayLength){
                enKisaArrayLength=arr[i].length;
            }
            System.out.println(enKisaArrayLength);
        }
        int[] toplamlarArrayi=new  int[enKisaArrayLength];
        int toplam=0;

        for (int i = 0; i <toplamlarArrayi.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                    toplam+=arr[j][i];
            }
            toplamlarArrayi[i]=toplam;
            toplam=0;
        }
        System.out.println(Arrays.toString(toplamlarArrayi));

    }
}
