package com.example.demo.y2019.m03.d28;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
//        map.put("modlName", null);
        String modlName = String.valueOf(map.get("modlName"));
        System.out.println(modlName);
    }
}
