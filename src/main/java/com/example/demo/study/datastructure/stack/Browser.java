package com.example.demo.study.datastructure.stack;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * stack实现浏览器前进后退
 *
 * @author gaoruiting
 * @date 2020-05-08
 */
public class Browser {

    // 当前页面
    private String currentPage;
    // 后退页面栈
    private final LinkedListStack backStack;
    // 前进页面栈
    private final LinkedListStack forwardStack;

    public Browser() {
        this.backStack = new LinkedListStack();
        this.forwardStack = new LinkedListStack();
    }

    public void open(String url) {
        if (this.currentPage != null) {
            this.backStack.push(this.currentPage);
            this.forwardStack.clear();
        }
        showUrl(url, "Open");
    }

    public boolean canGoBack() {
        return this.backStack.size() > 0;
    }

    public boolean canGoForward() {
        return this.forwardStack.size() > 0;
    }

    public String goBack() {
        if (this.canGoBack()) {
            this.forwardStack.push(this.currentPage);
            String backUrl = this.backStack.pop();
            showUrl(backUrl, "Back");
            return backUrl;
        }

        System.out.println("* Cannot go back, no pages behind.");
        return null;
    }

    public String goForward() {
        if (this.canGoForward()) {
            this.backStack.push(this.currentPage);
            String forwardUrl = this.forwardStack.pop();
            showUrl(forwardUrl, "Foward");
            return forwardUrl;
        }

        System.out.println("** Cannot go forward, no pages ahead.");
        return null;
    }

    public void showUrl(String url, String prefix) {
        this.currentPage = url;
        System.out.println(prefix + " page == " + url);
    }

    public void checkCurrentPage() {
        System.out.println("Current page is: " + this.currentPage);
    }

    /**
     * A LinkedList based Stack implementation.
     */
    public static class LinkedListStack {

        private int size;
        private Node top;

        static Node createNode(String data, Node next) {
            return new Node(data, next);
        }

        public void clear() {
            this.top = null;
            this.size = 0;
        }

        public void push(String data) {
            Node node = createNode(data, this.top);
            this.top = node;
            this.size++;
        }

        public String pop() {
            Node popNode = this.top;
            if (popNode == null) {
                System.out.println("Stack is empty.");
                return null;
            }
            this.top = popNode.next;
            if (this.size > 0) {
                this.size--;
            }
            return popNode.data;
        }

        public String getTopData() {
            if (this.top == null) {
                return null;
            }
            return this.top.data;
        }

        public int size() {
            return this.size;
        }

        public void print() {
            System.out.println("Print stack:");
            Node currentNode = this.top;
            while (currentNode != null) {
                String data = currentNode.getData();
                System.out.print(data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println();
        }

        @Data
        @AllArgsConstructor
        public static class Node {

            private String data;
            private Node next;

            public Node(String data) {
                this(data, null);
            }
        }

        public static void main(String[] args) {
            LinkedListStack stack = new LinkedListStack();
            stack.push("A");
            stack.push("B");
            stack.push("C");
            stack.pop();
            stack.push("D");
            stack.push("E");
            stack.pop();
            stack.push("F");
            stack.print();

            String data = stack.getTopData();
            System.out.println("Top data == " + data);
        }

    }

    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.open("http://www.baidu.com");
        browser.open("http://news.baidu.com/");
        browser.open("http://news.baidu.com/ent");
        System.out.println(browser.goBack());
        System.out.println(browser.goBack());
        System.out.println(browser.goForward());
        browser.open("http://www.qq.com");
        System.out.println(browser.goForward());
        System.out.println(browser.goBack());
        System.out.println(browser.goForward());
        System.out.println(browser.goBack());
        System.out.println(browser.goBack());
        System.out.println(browser.goBack());
        System.out.println(browser.goBack());
        browser.checkCurrentPage();
    }

}
