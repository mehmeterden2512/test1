package aaMentoring;

import java.util.*;

public class Kitapci {
    /*
     * Bir kitapci icin program yapalim
     * Kitap no 1000'den baslayarak sirali no olsun Her kitap icin kitapAdi,
     * yazarAdi,yayinYili,fiyati bilgilerini girelim
     * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
     * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
     * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6- Bitir
     */
    Scanner scan=new Scanner(System.in);
    int kitapNo=1000;
    String kitapAdi;
    String yazarAdi;
    String yayinYili;
    String fiyati;
    Map<Integer,List<Kitapci>> kitaplar=new HashMap<>();

    public Kitapci(String kitapAdi, String yazarAdi, String yayinYili, String fiyati) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinYili = yayinYili;
        this.fiyati = fiyati;
    }

    public void menu() {
        System.out.println("yapmak istediginiz işlemi secin: ");
        System.out.println("1-kitap ekle\n2-numara ile kitap goruntule\n3-bilgi ile kitap  goruntule\n" +
                "4-numara ile kitap sil\n5-Tum kitaplari listele\n6-Bitir");
        String islem=scan.nextLine();
        islem=islem.substring(0,1);
        switch (islem){
            case "1":
                kitapEkle();

            case "2":numaraIleKitapGoruntule();
                   menu();
            case "3":
                bilgiIleKitapGoruntule();
                menu();
            case "4":
                numaraIleKitapSil();
                menu();

            case "5":
                kitaplariListele();

            case "6":
                System.exit(0);
            default:
                System.out.println("belirtilen işlemlerden birini secin");
        }
    }

    private void kitaplariListele() {
        for (Map.Entry<Integer, List<Kitapci>> integerStringEntry : kitaplar.entrySet()) {
            System.out.println(integerStringEntry);
        }
    }

    private void numaraIleKitapSil() {
        System.out.println("Silinecek kitapNo giriniz");
        int silinecekKitapNo=scan.nextInt();
        Set<Map.Entry<Integer, List<Kitapci>>> kitaplarEntrySeti = kitaplar.entrySet();
        if (kitaplar.containsKey(silinecekKitapNo)){
            kitaplarEntrySeti.remove(silinecekKitapNo);
        }else {
            System.out.println("silinecek kitap no ile kayıtlı kitap bulunmamaktadir");
            menu();
        }


    }

    private void bilgiIleKitapGoruntule() {
        System.out.println("aramak istediğiniz kitabin bilgisini girin");
        String girilenBilgi=scan.nextLine();
        for (Map.Entry<Integer, List<Kitapci>> integerListEntry : kitaplar.entrySet()) {
           List<Kitapci> kitapLis= integerListEntry.getValue();
            System.out.println(kitapLis);

        }
        System.out.println("girilen bşlgşye ait kitap yok");
        menu();
    }

    private void numaraIleKitapGoruntule() {
        System.out.println("goruntulemek istediğiniz kitap no girin ");
        int girilenKitapNo=scan.nextInt();

       if (kitaplar.containsKey(girilenKitapNo)){
           System.out.println(kitaplar.get(girilenKitapNo));
       }else {
           System.out.println(girilenKitapNo+" ait kayıtlı kitap bulunmamaktadir ");
       }

    }

    public Kitapci() {
    }

    private void kitapEkle() {
        System.out.println("kitap adi girin :");
        kitapAdi=scan.nextLine();
        System.out.println("kitabin yazari ");
        yazarAdi=scan.nextLine();
        System.out.println("kitabin yayin yılı:");
        yayinYili=scan.nextLine();
        System.out.println("kitabin fiyati :");
        fiyati=scan.nextLine();
        Kitapci kitap=new Kitapci(kitapAdi,yazarAdi,yayinYili,fiyati);
        List<Kitapci> kitapListesi=new ArrayList<>();
        kitapListesi.add(kitap);
        kitaplar.put(kitapNo++,kitapListesi);
        System.out.println(kitap.kitapAdi +" basari ile eklendi ");
        menu();
    }

    @Override
    public String toString() {
        return
                "kitapAdi= " + kitapAdi + "yazarAdi= " + yazarAdi  + "yayinYili= " + yayinYili + "fiyati= " + fiyati;
    }
}

