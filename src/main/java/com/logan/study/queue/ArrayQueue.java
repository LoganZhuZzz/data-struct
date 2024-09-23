package com.logan.study.queue;

import java.util.Iterator;

public class ArrayQueue<E> implements Queue<E>, Iterable<E> {

    private int capacity;
    private transient Object[] elements;

    private int head;

    private int tail;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity + 1];
        head = 0;
        tail = capacity;
    }

    @Override
    public boolean offer(E value) {
        return false;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
