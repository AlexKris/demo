package com.example.demo.study.datastructure.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 链表
 *
 * @author gaoruiting
 * @date 2020-05-08
 */
public class LinkedList {
    public static void main(String[] args) {
        // 在数组a中，查找key，返回key所在的位置
        // 其中，n表示数组a的长度
        // 我举2个例子，你可以拿例子走一下代码
        // a = {4, 2, 3, 5, 9, 6}  n=6 key = 7
        // a = {4, 2, 3, 5, 9, 6}  n=6 key = 6
        System.out.println(find2(new char[]{'4', '2', '3', '5', '9', '6'}, '7'));
        System.out.println(find2(new char[]{'4', '2', '3', '5', '9', '6'}, '6'));
    }


    // 在数组a中，查找key，返回key所在的位置
    // 其中，n表示数组a的长度
    private static int find1(char[] a, char key) {
        // 边界条件处理，如果a为空，或者n<=0，说明数组中没有数据，就不用while循环比较了
        if (a == null || a.length <= 0) {
            return -1;
        }

        int i = 0;
        // 这里有两个比较操作：i<n和a[i]==key.
        while (i < a.length) {
            if (a[i] == key) {
                return i;
            }
            ++i;
        }

        return -1;
    }

    private static int find2(char[] a, char key) {
        if (a == null || a.length <= 0) {
            return -1;
        }

        // 这里因为要将a[a.length-1]的值替换成key，所以要特殊处理这个值
        if (a[a.length - 1] == key) {
            return a.length - 1;
        }

        // 把a[a.length-1]的值临时保存在变量tmp中，以便之后恢复。tmp=6。
        // 之所以这样做的目的是：希望find()代码不要改变a数组中的内容
        char tmp = a[a.length - 1];
        // 把key的值放到a[a.length-1]中，此时a = {4, 2, 3, 5, 9, 7}
        a[a.length - 1] = key;
        int i = 0;
        // while 循环比起代码一，少了i<n这个比较操作
        while (a[i] != key) {
            ++i;
        }

        // 恢复a[a.length-1]原来的值,此时a= {4, 2, 3, 5, 9, 6}
        a[a.length - 1] = tmp;
        if (i == a.length - 1) {
            // 如果i == n-1说明，在0...a.length-2之间都没有key，所以返回-1
            return -1;
        } else {
            // 否则，返回i，就是等于key值的元素的下标
            return i;
        }
    }

    // 单链表反转 LeetCode 206
    private static Node reverse(Node list) {
        Node curr = list, pre = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    // 检测环 LeetCode 141
    private static boolean checkCircle(Node list) {
        if (list == null) return false;

        Node fast = list.next;
        Node slow = list;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) return true;
        }

        return false;
    }

    // 有序链表合并 LeetCode 21
    public static Node mergeSortedLists(Node n1, Node n2) {
        if (n1 == null) return n2;
        if (n2 == null) return n1;

        Node p = n1;
        Node q = n2;
        Node head;
        if (p.data < q.data) {
            head = p;
            p = p.next;
        } else {
            head = q;
            q = q.next;
        }
        Node r = head;

        while (p != null && q != null) {
            if (p.data < q.data) {
                r.next = p;
                p = p.next;
            } else {
                r.next = q;
                q = q.next;
            }
            r = r.next;
        }

        if (p != null) {
            r.next = p;
        } else {
            r.next = q;
        }

        return head;
    }

    /**
     * 有序链表合并
     * LeetCode 21
     * Definition for singly-linked list.
     *
     * @param n1
     * @param n2
     * @return
     */
    public Node mergeTwoLists(Node n1, Node n2) {
        Node soldier = new Node(0); //利用哨兵结点简化实现难度 技巧三
        Node p = soldier;

        while (n1 != null && n2 != null) {
            if (n1.data < n2.data) {
                p.next = n1;
                n1 = n1.next;
            } else {
                p.next = n2;
                n2 = n2.next;
            }
            p = p.next;
        }

        if (n1 != null) {
            p.next = n1;
        }
        if (n2 != null) {
            p.next = n2;
        }
        return soldier.next;
    }

    // 删除倒数第K个结点 LeetCode 19
    public static Node deleteLastKth(Node list, int k) {
        Node fast = list;
        int i = 1;
        while (fast != null && i < k) {
            fast = fast.next;
            ++i;
        }

        if (fast == null) return list;

        Node slow = list;
        Node prev = null;
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }

        if (prev == null) {
            list = list.next;
        } else {
            prev.next = prev.next.next;
        }
        return list;
    }

    // 求中间结点 LeetCode 876
    public static Node findMiddleNode(Node list) {
        if (list == null) return null;

        Node fast = list;
        Node slow = list;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    @Data
    @AllArgsConstructor
    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
