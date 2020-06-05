package com.example.demo.study.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * 排序算法
 * <p>
 * 插入排序比冒泡排序更受欢迎
 * 冒泡排序的数据交换需要3个赋值操作
 * 插入排序只需要1个
 * <p>
 * 选择排序
 * <p>
 * 1.空间复杂度为O(1)，是原地排序算法
 * 2.每次都要找剩余未排序元素中的最小值，并和前面的元素交换位置，这样破坏了稳定性，是不稳定的排序算法
 *
 * @author gaoruiting
 * @date 2020-05-20
 */
public class Sort {

    /**
     * 冒泡排序
     * <p>
     * 1.空间复杂度为O(1)，是原地排序算法
     * 2.两个相邻元素大小相等时不做交换，相同大小的数据在排序前后不会改变顺序，是稳定的排序算法
     * 3.时间复杂度
     * <pre>
     *     1.最好情况，数据已有序，只需一次冒泡，O(n)
     *     2.最坏情况，数据刚好是倒序的，需要进行n次冒泡，O(n^2)
     *     3.平均时间复杂度，O(n^2)
     *     <pre>
     *         有序度：有序元素对个数，a[i]<=a[j] i<j，例：2,4,3,1,5,6有序度为11
     *         满有序度：完全有序，公式n*(n-1)/2,例：1,2,3,4,5,6，有序度是15
     *         逆序度：逆序元素对个数，a[i]>a[j] i<j，逆序度=满有序度-有序度
     *         <pre>
     *             逆序度=n*(n-1)/2-初始有序度
     *             需要进行(逆序度)次交换操作
     *         </pre>
     *         最坏情况，初始有序度为0，需要进行n*(n-1)/2次交换
     *         最好情况，初始有序度为n*(n-1)/2，需要进行0次交换
     *         取平均值为n*(n-1)/4
     *         所以平均复杂度是O(n^2)
     *     </pre>
     * </pre>
     *
     * @param array 数组
     */
    private static void bubbleSort(int[] array) {
        if (array.length <= 1) return;

        for (int i = 0; i < array.length; i++) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // 交换
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    // 表示数据有交换
                    flag = true;
                }
            }
            // 没有数据交换，提前退出
            if (!flag) break;
        }
    }

    /**
     * 插入排序
     * <p>
     * 1.空间复杂度为O(1)，是原地排序算法
     * 2.两个相邻元素大小相等时不做交换，相同大小的数据在排序前后不会改变顺序，是稳定的排序算法
     * 3.时间复杂度
     * <pre>
     *     1.最好情况，数据已有序，需从头到尾遍历已经有序的数据，O(n)
     *     2.最坏情况，数据刚好是倒序的，每次插入都相当于在数组的第一个位置插入新的数据O(n)，循环执行n次插入，O(n^2)
     *     3.平均时间复杂度，O(n^2)
     * </pre>
     *
     * @param array 数组
     */
    public static void insertSort(int[] array) {
        if (array.length <= 1) return;

        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; j--) {
                if (array[j] > value)
                    // 数据移动
                    array[j + 1] = array[j];
                else
                    break;
            }
            // 插入数据
            array[j + 1] = value;
        }
    }

    /**
     * 归并排序
     * <p>
     * 分治思想：分而治之，将一个大问题分解成小的子问题来解决。小的子问题解决了，大问题也就解决了。
     * 核心思想：如果要排序一个数组，我们先把数组从中间分成前后两部分，然后对前后两部分分别排序，再将排好序的两部分合并在一起，这样整个数组就都有序了。
     * <pre>
     *     分治是一种解决问题的处理思想，递归是一种编程技巧。
     * </pre>
     * <p>
     * 递推公式：mergeSort(p...r) = merge(mergeSort(p...q), mergeSort(q+1...r))
     * 终止条件：p >= r
     * <p>
     * 1.稳定的排序算法
     * 2.时间复杂度，O(nlogn)
     * <pre>
     *     递推算法公式：问题a分解为问题b和c，b和c计算完合并成a的结果
     *     T(a) = T(b) + T(c) + K 其中K为将b和c的结果合并成a所消耗的时间
     *
     *     假设对n个元素进行归并排序需要的时间是T(n)，则分解成两个子数组排序的时间为T(n/2)，合并两个数组的时间复杂度为O(n)
     *     T(1) = C
     *     T(n) = 2*T(n/2) + n 其中n>1
     *          = 2^k * T(n/2^k) + k * n
     *     T(1) = T(n/2^k)
     *     1 = n/2^k => k = log2n
     *     T(n) = Cn + nlog2n
     *     O(nlogn)
     * </pre>
     * 3.空间复杂度，O(n)，不是原地排序算法
     *
     * @param array 数组
     */
    private static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    /**
     * 递归
     *
     * @param array      数组
     * @param startIndex 开始下标
     * @param endIndex   结束下标
     */
    private static void mergeSort(int[] array, int startIndex, int endIndex) {
        // 递归终止条件
        if (startIndex >= endIndex) return;

        // 取开始和结束的中间位置
        int index = startIndex + (endIndex - startIndex) / 2;
        // 分治递归
        mergeSort(array, startIndex, index);
        mergeSort(array, index + 1, endIndex);
        // 合并
        mergeSort(array, startIndex, index, endIndex);
    }

    private static void mergeSort(int[] array, int startIndex, int index, int endIndex) {
        // 初始化
        int i = startIndex, j = index + 1, k = 0;

        // 申请一个n+1到size大小的临时数组
        int[] tmp = new int[endIndex - startIndex + 1];
        while (i <= index && j <= endIndex) {
            if (array[i] <= array[j])
                tmp[k++] = array[i++];
            else
                tmp[k++] = array[j++];
        }

        // 判断哪个子数组中有剩余的数据
        int start = i, end = index;
        if (j <= endIndex) {
            start = j;
            end = endIndex;
        }

        // 将剩余的数据拷贝到临时数组tmp
        while (start <= end)
            tmp[k++] = array[start++];

        // 将tmp中的数组拷贝回a
        for (i = 0; i <= endIndex - startIndex; ++i) {
            array[startIndex + i] = tmp[i];
        }
    }

    /**
     * 快速排序
     * <p>
     * 分治思想：分而治之，将一个大问题分解成小的子问题来解决。小的子问题解决了，大问题也就解决了。
     * 核心思想：如果要排序数组中下标从p到r之间的一组数据，我们选择p到r之间的任意一个数据作为pivot（分区点）。
     * <pre>
     *     我们遍历p到r之间的数据，将小于pivot的放到左边，将大于pivot的放到右边，将pivot放到中间。经过这一步骤之后，数组p到r之间的数据就被分成了三个部分，前面p到q-1之间都是小于pivot的，中间是pivot，后面的q+1到r之间是大于pivot的。
     *     根据分治、递归的处理思想，我们可以用递归排序下标从p到q-1之间的数据和下标从q+1到r之间的数据，直到区间缩小为1，就说明所有的数据都有序了。
     * </pre>
     * 递推公式：quickSort(p...r) = quickSort(p...q-1) + quickSort(q+1...r)
     * 终止条件：p >= r
     *
     * @param array 数组
     */
    private static void quickSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int startIndex, int endIndex) {
        // 递归终止条件
        if (startIndex >= endIndex) return;
        int index = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, index - 1);
        quickSort(array, index + 1, endIndex);
    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        // 三数取中法，随机数在这里写
        int middle = (startIndex + endIndex) / 2;
        int pivot = array[middle];
        // 交换到最右边
        int val = array[endIndex];
        array[endIndex] = pivot;
        array[middle] = val;
        int i = startIndex;
        for (int j = startIndex; j < endIndex; j++) {
            if (array[j] < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    int tmp = array[i];
                    array[i++] = array[j];
                    array[j] = tmp;
                }
            }
        }
        int tmp = array[i];
        array[i] = array[endIndex];
        array[endIndex] = tmp;
        return i;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] a = random.ints(1000).toArray();
        long aStartTime = System.currentTimeMillis();
        bubbleSort(a);
        long aEndTime = System.currentTimeMillis();
        System.out.println("a时间" + (aEndTime - aStartTime));
        System.out.println("a:" + Arrays.toString(a));

        int[] b = random.ints(1000).toArray();
        long bStartTime = System.currentTimeMillis();
        insertSort(b);
        long bEndTime = System.currentTimeMillis();
        System.out.println("b时间" + (bEndTime - bStartTime));
        System.out.println("b:" + Arrays.toString(b));

        int[] c = new int[]{5, 1, 7, 2, 3, 8, 9, 6, 4};
        long cStartTime = System.currentTimeMillis();
        mergeSort(c);
        long cEndTime = System.currentTimeMillis();
        System.out.println("b时间" + (cEndTime - cStartTime));
        System.out.println("c:" + Arrays.toString(c));

        int[] d = new int[]{5, 1, 7, 2, 3, 8, 9, 6, 4};
        long dStartTime = System.currentTimeMillis();
        quickSort(d);
        long dEndTime = System.currentTimeMillis();
        System.out.println("b时间" + (dEndTime - dStartTime));
        System.out.println("d:" + Arrays.toString(d));
    }

}
