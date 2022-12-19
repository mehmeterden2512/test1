package Ders09_Tekrar;

public class c04_Tekrar {
    public static void main(String[] args) {
        String str="Java ile kodlama cok kolay cokca";
        //kullanicidan aldiginiz cumlede "cok "ile baslayan ilk kelimeyi yazdirin,
        int cokIndex=str.indexOf("cok");
        System.out.println(cokIndex);
        int cokIndexSon=str.lastIndexOf("cok");
        System.out.println(cokIndexSon);

        System.out.println(str.substring(cokIndex,cokIndexSon+3));
    }
}
