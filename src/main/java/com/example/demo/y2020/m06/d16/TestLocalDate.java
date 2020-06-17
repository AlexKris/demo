package com.example.demo.y2020.m06.d16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2020-07-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(date);
        String dataTime1 = "2020-07-01 11:00:00";
        LocalDate parse = LocalDate.parse(dataTime1, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(parse);
        System.out.println(parse.isBefore(date));
    }
}
