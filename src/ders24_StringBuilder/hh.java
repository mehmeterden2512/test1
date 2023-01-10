package ders24_StringBuilder;

public class hh {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("OCAJP8");

        System.out.println(sb1.subSequence(2, 4));

        System.out.println(sb1.deleteCharAt(3));

        System.out.println(sb1.reverse());
        sb1.reverse();

        System.out.println(sb1);
    }}
