package com.example.demo.study.geektime.datastructureandalgorithm.algorithm.sort;

/**
 * <p>插入排序</p>
 * <p>1、插入排序不需要额外的存储空间，空间复杂度是O(1)。原地排序算法。</p>
 * <p>2、对于值相同的元素可以将后面出现的元素插入到前面出现的元素的后面。稳定的排序算法。</p>
 * <p>3、最好时间复杂度是O(n)；最坏时间复杂度是O(n^2)；平均时间复杂度是O(n^2)。</p>
 *
 * @author grt
 */
public class InsertionSort {
    public static void main(String[] args) {
    }

    private static void insertionSort(int[] a) {
        if (a.length <= 1) return;

        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];// 数据移动
                } else {
                    break;
                }
            }
            a[j + 1] = value;// 插入数据
        }
    }
}
