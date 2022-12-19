package Day09_replaceManipulation;

public class C02_replaceFirst {
    public static void main(String[] args) {

        String str="Herkesin github'i olmali";
        System.out.println(str.replaceFirst("e","a"));
        //Harkesin github'i olmali

        System.out.println(str.replaceFirst("\\s","1"));//Herkesin1github'i olmali

    }
}
