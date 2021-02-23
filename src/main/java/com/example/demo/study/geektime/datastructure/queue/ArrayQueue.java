package com.example.demo.study.geektime.datastructure.queue;

import java.io.Serializable;

/**
 * 基于数组实现的队列
 * 顺序队列
 *
 * @author gaoruiting
 * @date 2020-05-09
 */
public class ArrayQueue implements Serializable {
    private static final long serialVersionUID = 7466258984128774907L;

    // Object数组
    private final Object[] items;
    // 数组大小
    private int size = 0;
    // 队首下标
    private int head = 0;
    // 队尾下标
    private int tail = 0;

    // 申请大小为size的数组
    public ArrayQueue(int size) {
        items = new Object[size];
        this.size = size;
    }

    // 入队 均摊时间复杂度 O(1)
    public boolean enqueue(Object item) {
        // 如果队尾下标等于size
        if (tail == size) {
            if (head == 0) {
                // 代表队列满了
                return false;
            } else {
                // 数组迁移
                for (int i = head; i < tail; ++i)
                    items[i - head] = items[i];
            }
            tail -= head;
            head = 0;
        }
        items[tail++] = item;
        return true;
    }

    // 出队 时间复杂度 O(1)
    public Object dequeue() {
        // 如果队首下标等于队尾下标，代表队列为空
        if (head == tail) return null;
        // 将队首下标向后移动
        return items[head++];
    }
}
