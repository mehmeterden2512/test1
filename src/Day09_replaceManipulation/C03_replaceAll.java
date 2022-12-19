package Day09_replaceManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str="J1a2va3 G4u5z6e7l8di0r.";
        System.out.println(str.replaceAll("\\d",""));
        //Java Guzeldir.

            str="Java Guzeldir.";
        System.out.println(str.repeat(3));

        str="    Java Guzeldir ama calısmak lazim.    ";
        System.out.println(str.trim());
        //Java Guzeldir ama calısmak lazim.sadece basinda ve sonundaki spaceleri siler

    }
}
