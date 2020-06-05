package com.example.demo.y2018.m10.d29;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>(16);
        map.put("test", "test1");
        System.out.println(map);
        map.put("test", "test2");
        System.out.println(map);
        changeMap(map);
        System.out.println(map);
    }

    private static void changeMap(Map<String, Object> map) {
        map.put("test", "test3");
    }
}
