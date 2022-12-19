package Day15WhileLoop;

public class C02_Terscevirmethod {
    public static void main(String[] args) {
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun

   String cumle="Ey edip adanada pide ye:";
        System.out.println(cumleTersCevir(cumle));
    }


    public static String cumleTersCevir(String str){
        String tersCumle="";
        int karakterSayisi=str.length()-1;

        while (karakterSayisi>=0){
            tersCumle+=str.charAt(karakterSayisi);
            karakterSayisi-=1;
        }
        return tersCumle;
    }
}
