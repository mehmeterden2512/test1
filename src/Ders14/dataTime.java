package Ders14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class dataTime {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2022-12-19


        LocalTime saat=LocalTime.now();
        System.out.println(saat);//00:16:59.751234900

        LocalDateTime tarihZaman=LocalDateTime.now();
        System.out.println(tarihZaman);//2022-12-19T00:18:52.849192100
    }
}
