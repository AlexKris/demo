package com.example.demo.y2019.m05.d13;

import com.example.demo.util.DesEncrypter;

public class TestSomeThing {
    public static void main(String[] args) {
        try {
            DesEncrypter desEncrypter = new DesEncrypter("admin");
            String password = desEncrypter.encrypt("123456");
            System.out.println(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("111111198101014872 ".trim());
        System.out.println("111111198101014872 ".trim());
        System.out.println("111111198101014872 ".trim());
        System.out.println("贷零四一 ".trim());
        System.out.println("贷零四一 ".trim());
    }
}
