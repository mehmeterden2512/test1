package Ders10_ForLoop;

public class C02_ForLoop {
    public static void main(String[] args) {
        //metni tersten yazdirin
        String input="aksama geleceğim baban evdemi";
        int i;
        String sonuc="";

        for (i = input.length()-1; i <=0; i--) {
           sonuc+=input.charAt(i);
            System.out.println(sonuc);

        }
        
    }
}
