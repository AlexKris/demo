package com.example.demo.y2020.m01.d06;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Test {
    public static void main(String[] args) {
        JSONObject jsonObject = JSON.parseObject(null);
        System.out.println(jsonObject);
        System.out.println(jsonObject.getString("name"));
    }
}
