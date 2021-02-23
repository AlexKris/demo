package com.example.demo.study.geektime.datastructure.stack;

import lombok.ToString;

import java.io.Serializable;

/**
 * 基于数组实现的顺序栈
 * 出栈、入栈时间复杂度都是：O(1)
 *
 * @author gaoruiting
 * @date 2020-05-08
 */
@ToString
public class ArrayStack implements Serializable {

    private static final long serialVersionUID = 1339531216027005896L;
    // 数组
    private final String[] items;
    // 栈中元素个数
    private int count;
    // 栈的大小
    private final int size;

    // 初始化，申请一个大小为size的数组空间
    public ArrayStack(int size) {
        this.items = new String[size];
        this.size = size;
        this.count = 0;
    }

    public static ArrayStack getInstance(int size) {
        return new ArrayStack(size);
    }

    // 入栈操作
    public boolean push(String item) {
        // 数组空间不够了，直接返回false，入栈失败
        if (count == size) return false;
        // 将item放到下标为count的位置，并且count+1
        items[count++] = item;
        return true;
    }

    // 出栈操作
    public String pop() {
        // 栈为空，则直接返回null
        if (count == 0) return null;
        // 返回下标为count-1的数组元素，并且栈中元素个数count-1
        return items[--count];
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = ArrayStack.getInstance(5);
        System.out.println(arrayStack.push("1"));
        System.out.println(arrayStack.push("2"));
        System.out.println(arrayStack.push("3"));
        System.out.println(arrayStack.push("4"));
        System.out.println(arrayStack.push("5"));
        System.out.println(arrayStack);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.push("5"));
        System.out.println(arrayStack.push("4"));
        System.out.println(arrayStack.push("3"));
        System.out.println(arrayStack.push("2"));
        System.out.println(arrayStack.push("1"));
        System.out.println(arrayStack.push("0"));
    }

}
