package a_01interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class MethodDepom {
   static Scanner scan=new Scanner(System.in);
    public static Map<Integer, String> mapOlustur() {
        List<String> team3 = new ArrayList<>(Arrays.asList("Yücel Bey", "Mehmet Dag", "Vahit Bey", "Duygu Günaydin", "Erman Bey", "F.Betül Alptekin",
                "Hamza Cicek", "Hüseyin Emre", "Mehmet Meral", "Tugce Bol", "Yahya Bey", "Zehranur Avcibas", "Mehmet Erden", "Hakan Bey", "Muhammet Bey"));
        Map<Integer,String> fellowShipTeam=new HashMap<>();
        int key=1;
        for (int i = 0; i <team3.size() ; i++) {
            fellowShipTeam.put(key,team3.get(i));
            key++;
        }
        return fellowShipTeam;
    }/*
    public static String soruGonder(Map<Integer,String> fellowShipTeam){
        Set<Map.Entry<Integer, String>> entrySet = fellowShipTeam.entrySet();//Map deki kkey ve valueleri getirdi.
        Random rnd=new Random(15);

        try {
            FileInputStream fis=new FileInputStream("src/a_01interview/ocak13Sorular");//dosya yolu ekle
            int k=0;
            while ((k=fis.read())!=(-1)){
                if (k=='?'){
                   String soru= fellowShipTeam.get(rnd)+(char)k;
                    System.out.print((char)k);
                   return soru;

                }else {
                    System.out.print((char)k);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadı");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
     return "bir sonraki soru icin soruGonder methodu cagirin";
    }
    */
    public static Map<Integer, String> sorularMap() {
        List<Integer> soruNo=new ArrayList<>(Arrays.asList(31,32,33,34,35,36,37,38,39,40,41,42,43,44,45));
        List<String> sorularList=new ArrayList<>(Arrays.asList(
                 " S31->String’ler ve StringBuilder’lar arasındaki farklar?"
                ," S32->Constructor’lar inherited edilebilir mi?"
                ," S33->ClassLoader nedir?"
                ," S34->Kaç tane ClassLoader vardır ve nelerdir?"
                ," S35->Java’da String’ler neden doğası gereği değişmezdir?"
                ," S36->Array ve ArrayList arasındaki farklar nelerdir?"
                ," S37->Java da Map nedir?"
                ," S38->Java da Collection Class nedir?"
                ," S39->Collection Class’lar neler içerirler açıklayınız?"
                ," S40->Polymorphism nedir?"
                ," S41->Kaç çeşit Polymorphism vardır?"
                ," S42->Java’da Abstraction (soyutlama) nedir?"
                ," S43->Java da Interface ne anlam ifade eder?"
                ," S44->Abstract Class ile Interface arasındaki farklar nelerdir (Bu soru olmazsa olmazlardan)?"
                ," S45->Java da Inheritance (kalıtım-miras) nedir?"));
        Map<Integer,String> sorularMap=new HashMap<>();
        for (int i = 0; i <soruNo.size() ; i++) {
            sorularMap.put(soruNo.get(i),sorularList.get(i));

        }
        return sorularMap;
    }

    public static Map<String, String> soruYolla() {
        List<String> team3 = new ArrayList<>(Arrays.asList("Yücel Bey", "Mehmet Dag Bey", "Vahit Bey", "Duygu Günaydin Hanim", "Erman Bey", "F.Betül Alptekin Hanim",
                "Hamza Cicek Bey", "Hüseyin Emre Bey", "Mehmet Meral Bey", "Tugce Bol Hanim", "Yahya Bey", "Zehranur Avcibas Hanim", "Mehmet Erden", "Hakan Bey", "Muhammet Bey"));
        List<String> sorularList=new ArrayList<>(Arrays.asList(
                 "S31->String’ler ve StringBuilder’lar arasındaki farklar?"
                ,"S32->Constructor’lar inherited edilebilir mi?"
                ,"S33->ClassLoader nedir?"
                ,"S34->Kaç tane ClassLoader vardır ve nelerdir?"
                ,"S35->Java’da String’ler neden doğası gereği değişmezdir?"
                ,"S36->Array ve ArrayList arasındaki farklar nelerdir?"
                ,"S37->Java da Map nedir?"
                ,"S38->Java da Collection Class nedir?"
                ,"S39->Collection Class’lar neler içerirler açıklayınız?"
                ,"S40->Polymorphism nedir?"
                ,"S41->Kaç çeşit Polymorphism vardır?"
                ,"S42->Java’da Abstraction (soyutlama) nedir?"
                ,"S43->Java da Interface ne anlam ifade eder?"
                ,"S44->Abstract Class ile Interface arasındaki farklar nelerdir (Bu soru olmazsa olmazlardan)?"
                ,"S45->Java da Inheritance (kalıtım-miras) nedir?"));
        Map<String,String> eslestirme=new HashMap<>();
        for (int i = 0; i <team3.size() ; i++) {

                    eslestirme.put(team3.get(i),sorularList.get(i));
        }
            return eslestirme;
    }
    public static void benimSorum(){
        System.out.println("*****Fellowship Team **** Hepiniz Hoş Geldiniz.\nBaslamak icin ve soru gecişleri icin enter kullanın");

        String kataKulli=scan.nextLine();

        //Map<Integer, String> fellowShipTeam = MethodDepom.mapOlustur();
        //Map<Integer,String> sorularYeniMap=MethodDepom.sorularMap();
        //Set<Map.Entry<Integer, String>> entrySetSorular = sorularYeniMap.entrySet();

        //System.out.println(MethodDepom.soruYolla(fellowShipTeam, sorularYeniMap));
        Map<String,String> sorular=MethodDepom.soruYolla();
        Set<Map.Entry<String, String>> entries = sorular.entrySet();


        Random rnd=new Random();
        int tutulanSayi;

        for (Map.Entry<String, String> stringStringEntry : entries)
        {
            String team3="fellowShip";
            int index=0;
            String key=team3.substring(index,index+1);
            ++index;
            System.out.println(stringStringEntry.getKey()+" =====>>> "+ stringStringEntry.getValue());
            String str=scan.nextLine();
        }

    }
}
