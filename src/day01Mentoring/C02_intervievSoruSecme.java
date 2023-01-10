package day01Mentoring;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
/*
            S1: Java platformu neden bağımsızdır?
            S2: Java neden %100 nesne yönelimli değil?
            S3: public static void main (String [] args) Java’da yer alan bu yapıyı açıklayınız.
            S4: Wrapper Class’lar nelerdir?
            S5: Java da Constructor nedir?
            S6: Kaç çeşit Constructor vardır?
            S7: Bir Class i nasıl singleton yapabiliriz?
            S8: Java da ArrayList ve Vector arasındaki fark nedir?
            S9: Java da equals () ve = = işareti arasındaki fark nedir?
           Q10: Java’da Heap ve Stack Memory arasındaki farklar nelerdir?
           S11: Java da package nedir?
           S12: Package’ların avantajları nelerdir?
           S13: Neden pointer lar Java da kullanılmazlar?
           S14: Java da JIT derleyici (compiler) nedir?
           S15: Java da access modifier lar nelerdir?

 */
/*
yukarıda verilen sorular Random class indan yardim alinarak soru numarasi secilmiştir
Team listesinde yer alan kişiler de index numarasina göre sıralandirilip
 secilen soru team3 listesindeki index ile eşleştirilmiştir.
 */

public class C02_intervievSoruSecme {
   static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Random rnd = new Random();
        List<String> team3 = new ArrayList<>(Arrays.asList("Yücel Bey", "Mehmet Dag", "Vahit Bey", "Duygu Günaydin", "Erman Bey", "F.Betül Alptekin",
                "Hamza Cicek", "Hüseyin Emre", "Mehmet Meral", "Tugce Bol", "Yahya Bey", "Zehranur Avcibas", "Mehmet Erden", "Hakan Bey", "Muhammet Bey"));
        //listeye herkes eklendiğini görmek için.
        System.out.println(team3.size());
        List<String> soruSayisi = new ArrayList<>(Arrays.asList(   "S1","S2"," S3" ,"S4" ,"S5","S6" ,"S7", "S8" ,"S9", "S10" ,"S11" ,"S12" ,"S13", "S14", "S15"));
        int kisi = rnd.nextInt(15);

        int konusmaSirasi = 0;
        int soruSirasi=0;

        while (team3.size() != 0) {
            if (kisi < team3.size()) {
                konusmaSirasi++;//siralama için
                System.out.println(konusmaSirasi +  " = " + team3.get(kisi));//sansli kişi ismi

                team3.remove(team3.get(kisi));//secileni listeden cıkar
                soruSayisi.remove(soruSayisi.get(kisi));//secilen soru listeden cıkar.
            } else {
                kisi = rnd.nextInt(15);//eger listeden cıkan biri oldugunda yeniden sayi tut.
            }


        }
        System.out.println("soruları görmek icin \"evet\" yazınız");
        String str=scan.nextLine();
        try {
            FileInputStream interviev=new FileInputStream("src/day01Mentoring/interviewSorular");
            int s=0;
            while ((s=interviev.read())!=(-1)){

                System.out.print((char)s);

            }

        } catch (FileNotFoundException e) {
            System.out.println("sorular okunmuyor");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
