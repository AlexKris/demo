package com.example.demo.y2020.m06.d16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestLocalDate {
    public static void main(String[] args) {
        LocalDate of = LocalDate.of(2020, 7, 1);
        System.out.println(of);
        String dataTime1 = "2020-06-16 11:00:00";
        LocalDate parse = LocalDate.parse(dataTime1, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(parse);
        System.out.println(parse.isAfter(of));
    }
}
