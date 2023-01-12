package Ders11;

import java.util.Arrays;

public class C01_Q3 {
    public static void main(String[] args) {
        //Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        //olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //output: [10, 3, 12, 10, 9]

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7},{2,5,6}};
        int toplam=0;
        int [] icArrayElmentToplami=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               toplam+=arr[i][j];
            }

            icArrayElmentToplami[i]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(icArrayElmentToplami));//[10, 3, 12, 10, 9]

        //Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        //toplaminini yazdiran bir method olusturun
       // arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7},{2,5,6};
        toplam=0;
        for (int i = 0; i <arr.length ; i++) {

                toplam+=arr[i][arr[i].length-1];

        }
        System.out.println(toplam);
    }
}
