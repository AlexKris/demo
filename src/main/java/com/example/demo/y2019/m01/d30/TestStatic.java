package com.example.demo.y2019.m01.d30;

import java.util.ArrayList;

public class TestStatic {
    private static ArrayList arrayList;
    { }
    static {
        arrayList = new ArrayList();
    }

    private static void test1() {
        arrayList.clone();
        {
            System.out.println();
        }
    }
}
