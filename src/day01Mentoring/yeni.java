package day01Mentoring;

public class yeni {
    public static void main(String[] args) {
        int veritabaniKayitSayisi = 15;
        for(int i =1; i<=veritabaniKayitSayisi; i++) {
            if(i == 2) {
               continue;
            }
            System.out.println(i + ". kayit");
        }
    }
}
