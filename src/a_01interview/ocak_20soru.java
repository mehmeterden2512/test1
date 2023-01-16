package a_01interview;

import java.util.*;


public class ocak_20soru {
    /*
     *
     * Bir kitapci icin program yapalim Kitap no 1000'den baslayarak sirali no olsun
     * Her kitap icin kitapAdi, yazarAdi,fiyati bilgilerini girelim
     *
     * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
     * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
     * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6- çıkış
     */
    static Map<Integer, String> kitapBilgileri = new HashMap<>();
    static  Scanner erd=new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static public Map<Integer, String> menu() {

        Scanner scan = new Scanner(System.in);
        System.out.println("yapmak istediginiz işlemi secin");
        System.out.println("1-kitap ekle\n2-numara ile kitap goruntule\n" +
                "3-bilgi ile kitap goruntule\n4-numara ile kitap sil\n5-Tum kitaplari listele\n6-çıkış");


        int secim;
        try {
            secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    kitapEkle();
                    menu();
                }
                case 2: {

                    kitapGoruntule();
                    break;

                }
                case 3:bilgiIleKitapGoruntule();
                break;

                case 4:kitapSil();
                break;
                case 5:
                    kitaplariListele();
                break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("işlemler dısında bir numara girdiniz");
                    menu();

            }

        } catch (InputMismatchException e) {
            System.out.println("seciminizi sayisal olarak yapmalısınız.");
            menu();
        }
        return kitapBilgileri;


    }

    private static void kitaplariListele() {
        System.out.println(kitapBilgileri);
        System.out.println("===================");
        System.out.println("kitap adi yazarAdi  fiyati");
        System.out.println("----------------------------");
        for (Map.Entry<Integer, String> integerStringEntry : kitapBilgileri.entrySet()) {


            System.out.println(integerStringEntry);
        }


    }

    private static void kitapSil() {
        System.out.println("silnecek kitap no girin : ");
        int silinecekKitap= erd.nextInt();
        for (Integer eachKey : kitapBilgileri.keySet()) {
            if (eachKey==silinecekKitap){
                kitapBilgileri.remove(eachKey);
                break;
            }else {
                System.out.println("silinecek kitap yok");
                menu();
            }
        }

    }

    private static void bilgiIleKitapGoruntule() {
        System.out.println("bilgi girin");
        String girilenBilgi= erd.nextLine();
        Collection<String> valuesEntrySeti = kitapBilgileri.values();
        for (String eachValue : kitapBilgileri.values()) {
            String [] eachValueArr=eachValue.split("-");
            for (int i = 0; i <eachValueArr.length ; i++) {
                if (eachValueArr[i].equalsIgnoreCase(girilenBilgi)){
                    System.out.println(eachValue);
                    break;
                }
            }
        }
        System.out.println(girilenBilgi+" ait kitap bilgisi bulunamadi!!!");
        menu();
    }

    static private void kitapGoruntule() {
        System.out.println("kitap no giriniz");
        int kitapNo= erd.nextInt();
        Set<Integer> integersSet = kitapBilgileri.keySet();
        if (integersSet.contains(kitapNo)){
            System.out.println(kitapNo+" ait kitap bilgileri: "+kitapBilgileri.get(kitapNo));
        }else {
            System.out.println(kitapNo+" ait kitap bilgisi bulunamadi ");
        }
    }

    static private void kitapEkle() {

        Scanner scan = new Scanner(System.in);
        boolean eklemeyeDevamEt = true;
        int kitapNo = 1000;
        while (eklemeyeDevamEt) {
            //Her kitap icin kitapAdi, yazarAdi,fiyati bilgilerini girelim
            System.out.println("kitap adi girin");
            String kitapAdi = scan.nextLine();
            System.out.println("yazar adi girin");
            String yazarAdi = scan.nextLine();
            System.out.println("fiyatBilgisiGirin");
            String fiyat = scan.nextLine();
            String bilgiler = kitapAdi + "-" + yazarAdi + "-" + fiyat;
            kitapBilgileri.put(kitapNo, "" + bilgiler);
            kitapNo++;

            System.out.println("eklemeye islemine devam etmek istermisiniz E/H girin");
            String yanit = scan.nextLine();
            yanit = yanit.substring(0, 1);
            if (yanit.equalsIgnoreCase("H")) {
                eklemeyeDevamEt = false;
                for (Map.Entry<Integer, String> eachEntry : kitapBilgileri.entrySet()
                ) {

                    String[] eachEntryArr = eachEntry.getValue().split("-");
                    System.out.println("girilen " + "\'" + eachEntryArr[0] + "\'+" + " isimli kitap basari ile eklendi ");
                }

            } else {
               menu();
            }
        }
    }
}
