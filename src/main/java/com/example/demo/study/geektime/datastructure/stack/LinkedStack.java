package com.example.demo.study.geektime.datastructure.stack;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 基于链表实现的顺序栈
 * 出栈、入栈时间复杂度都是：O(1)
 *
 * @author gaoruiting
 * @date 2020-05-08
 */
public class LinkedStack {
    private Node node;

    public void push(String new_data) {
        Node new_node = new Node(new_data);
        // 判断是否为空栈
        if (node != null) new_node.next = node;
        node = new_node;
    }

    public String pop() {
        // null表示没有数据
        if (node == null) return null;
        String top = node.data;
        node = node.next;
        return top;
    }

    public void printAll() {
        Node p = node;
        while (p != null) {
            System.out.print(p.data + ",");
            p = p.next;
        }
        System.out.println();
    }

    @Data
    @AllArgsConstructor
    public static class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push("1");
        linkedStack.push("2");
        linkedStack.push("3");
        linkedStack.push("4");
        linkedStack.push("5");
        linkedStack.push("6");
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
    }

}
