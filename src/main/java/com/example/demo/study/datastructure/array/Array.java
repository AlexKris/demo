package com.example.demo.study.datastructure.array;

import lombok.ToString;

@ToString
public class Array<T> {
    private T[] data;
    private int size;

    public Array() {
        this(10);
    }

    public Array(int init) {
        this.data = (T[]) new Object[init];
        this.size = 0;
    }

    public int length() {
        return data.length;
    }

    public int count() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, T t) {
    }

    // 扩容方法，时间复杂度 O(n)
    private void resize(int init) {
        T[] newData = (T[]) new Object[init];

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Add failed! Require index >=0 and index < size.");
        }
    }
}
