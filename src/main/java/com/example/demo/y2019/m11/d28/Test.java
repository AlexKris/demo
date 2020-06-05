package com.example.demo.y2019.m11.d28;

import com.example.demo.util.NullUtils;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String class5State = RankClassificationEnum.MSRANK_PARAM_05.getCode();
        List<String> list = new ArrayList<>();
//        list.add("正常");
//        list.add("关注");
//        list.add("次级");
//        list.add("可疑");
        list.add("损失");
        list.add("未知");
        int num = 20;
        for (String s : list) {
            String number = RankClassificationEnum.getName(s);
            if (NullUtils.isNullOrEmpty(number)) {
                continue;
            }
            int i = Integer.parseInt(number);
            if (i <= num) {
                num = i;
            }
        }
        if (num != 20) {
            class5State = RankClassificationEnum.getCode(RankClassificationEnum.getCode(String.valueOf(num)));
        }
        System.out.println(class5State);
    }
}
