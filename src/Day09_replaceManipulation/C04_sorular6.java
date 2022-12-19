package Day09_replaceManipulation;

public class C04_sorular6 {
    public static void main(String[] args) {
        //Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin
        String input="Java calisiyorum ve gelecegimi kazaniyorum";
        int length = input.length();
        System.out.println(length);

        if ((input.length())%2==0){
            System.out.println(input.substring(0,input.length()/2)+":)"+input.substring(input.length()/2));//
        } else if ((input.length())%2!=0) {
            System.out.println(input.substring(0,input.length()/2)+":("+input.substring(input.length()/2 + 1));
        }


    }
}
