package ders24_StringBuilder;

public class C03_StringBuilderSlaytSorular {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb);
        System.out.println("soru2 cozum");
        String s1="Java";
        StringBuilder s2=new StringBuilder();
       // if (s1==s2); data turleri farklı oldugundan kıyaslanamaz
        System.out.println("1");
        if (s1.equals(s2));//hata vermez ama false doner.
        System.out.println("2");
        System.out.println("soru 3cozum");
        String numbers="012345678";
        System.out.println(numbers.substring(1,3));
        System.out.println(numbers.substring(7,7));
        System.out.println(numbers.substring(7));
    }
}
