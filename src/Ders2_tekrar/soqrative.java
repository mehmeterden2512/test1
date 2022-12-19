package Ders2_tekrar;

import java.util.ArrayList;
import java.util.List;

public class soqrative {
    public static void main(String[] args) {
        int arr[] = new int[5];
        ArrayList<String> list = new ArrayList<String>();

        list.add("A");

        list.add("B");

        list.add("C");

        list.add("D");



        System.out.println(list.remove(2));

        System.out.println(list.remove("C"));
    }
}