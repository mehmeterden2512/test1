package Ders10_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        int intputBas=8;
        int  inputBit=1;
        int toplam=0;

       if (inputBit<intputBas){
           System.out.println("baslangic degeri bitis degerinden kücük olmali");
       } else if(intputBas<inputBit){
           for (int i = intputBas; i <=inputBit ; i++) {
               toplam+=i;

           }
           System.out.println(toplam);


       }
    }
}
