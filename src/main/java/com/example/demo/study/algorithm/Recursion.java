package com.example.demo.study.algorithm;

import java.util.Random;
import java.util.stream.LongStream;

/**
 * 递归算法
 * 1. 一个问题的解可以分解为几个子问题的解
 * 2. 这个问题与分解之后的子问题，除了数据规模不同，求解思路完全一样
 * 3. 存在递归终止条件
 * <p>
 * 关键：找到如何将大问题分解为小问题的规律，并且基于此写出递推公式，然后再推敲终止条件，最后将递推公式和终止条件翻译成代码
 *
 * @author gaoruiting
 * @date 2020-05-11
 */
public class Recursion {

    /**
     * 电影院 计算自己所在排数
     * f(1)=1 表示第一排
     *
     * @param n 所在排数
     * @return
     */
    static int f1(int n) {
        if (n == 1) return 1;
        return f1(n - 1) + 1;
    }

    static void f2(int n) {
    }

    static long findRootReferrerId(long actorId) {
        Long referrerId = select(actorId);
        if (referrerId == null) return actorId;
        return findRootReferrerId(referrerId);
    }

    static long select(long actorId) {
        // select referrer_id from [table] where actor_id = actorId
        Random random = new Random();
        LongStream longs = random.longs(1);
        return random.nextLong();
    }

    public static void main(String[] args) {
    }

}
