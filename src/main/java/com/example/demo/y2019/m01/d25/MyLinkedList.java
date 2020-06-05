package com.example.demo.y2019.m01.d25;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {
    private int size;
    private int modCount = 0;
    private Node<E> beginMarker;
    private Node<E> endMarker;

    private static class Node<E> {
        private E data;
        private Node<E> prev;
        private Node<E> next;

        public Node(E d, Node<E> p, Node<E> n) {
            data = d;
            prev = p;
            next = n;
        }
    }

    public MyLinkedList() {
        clear();
    }

    public void clear() {
        /* Figure 3.26 */
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean add(E x) {
        add(size(), x);
        return true;
    }

    public void add(int idx, E x) {
        addBefore(getNode(idx), x);
    }

    public E get(int idx) {
        return getNode(idx).data;
    }

    public E set(int idx, E newVal) {
        Node<E> p = getNode(idx);
        E oldVal = p.data;
        p.data = newVal;
        return oldVal;
    }

    public E remove(int idx) {
        return remove(getNode(idx));
    }

    private void addBefore(Node<E> p, E x) {
        /* Figure 3.26 */
    }

    private E remove(Node<E> p) {
        /* Figure 3.26 */
        return null;
    }

    private Node<E> getNode(int idx) {
        /* Figure 3.26 */
        return null;
    }

    private class LinkedListIterator implements Iterator<E> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }
}
