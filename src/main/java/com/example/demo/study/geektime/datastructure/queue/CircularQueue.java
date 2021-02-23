package com.example.demo.study.geektime.datastructure.queue;

import java.io.Serializable;

/**
 * 循环队列
 *
 * @author gaoruiting
 * @date 2020-05-09
 */
public class CircularQueue implements Serializable {
    private static final long serialVersionUID = -5938915019398492330L;

    // 数组
    private final Object[] items;
    // 数组大小
    private int size = 0;
    // 队首下标
    private int head = 0;
    // 队尾下标
    private int tail = 0;

    // 初始化 申请一个大小为size的数组
    public CircularQueue(int size) {
        items = new Object[size];
        this.size = size;
    }

    // 入队
    public boolean enqueue(Object item) {
        // 队列满了
        if ((tail + 1) % size == head) return false;
        items[tail] = item;
        tail = (tail + 1) % size;
        return true;
    }

    // 出队
    public Object dequeue() {
        // 队列为空
        if (head == tail) return null;
        Object item = items[head];
        head = (head + 1) % size;
        return item;
    }
}
