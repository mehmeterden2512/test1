package Day09_replaceManipulation;

public class C01_replaca {
    public static void main(String[] args) {

        String str="Java ogren,isi kap";
        System.out.println(str.replace('J','j'));//java ogren,isi kap


        str=str.replace("isi","offer'i");
        System.out.println(str);//Java ogren,offer'i kap

    str=str.replace("kap","");//eski degeri tamamamen silmek istersk yeni degeri,
                                                //atamaliyiyz
        System.out.println(str);//java ogren,offer'i



    }
}
