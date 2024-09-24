package com.logan.study.queue;

import java.util.Iterator;

public class ArrayQueue<E> implements Queue<E>, Iterable<E> {

    private final int capacity;
    private final transient Object[] elements;

    private int head;

    private int tail;

    public ArrayQueue(int capacity) {
        this.capacity = capacity + 1;
        elements = new Object[this.capacity];
    }

    @Override
    public boolean offer(E value) {
        if (isFull()) {
            return false;
        }
        elements[tail] = value;
        tail = (tail + 1) % capacity;
        return true;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        Object element = elements[head];
        head = (head + 1) % capacity;
        return (E) element;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) elements[head];
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return (tail + 1) % capacity == head;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            int cursor = head;

            @Override
            public boolean hasNext() {
                return cursor != tail;
            }

            @Override
            @SuppressWarnings("unchecked")
            public E next() {
                Object element = elements[cursor];
                cursor = (cursor + 1) % capacity;
                return (E) element;
            }
        };
    }
}
