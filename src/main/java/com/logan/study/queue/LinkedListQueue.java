package com.logan.study.queue;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListQueue<E> implements Queue<E>, Iterable<E> {
    private final Node<E> head = new Node<>(null, null);
    private Node<E> tail = head;
    private int size;
    private int capacity = Integer.MAX_VALUE;

    {
        tail.next = head;
    }

    public LinkedListQueue() {

    }

    public LinkedListQueue(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean offer(E value) {
        if (size == capacity) {
            return false;
        }
        Node<E> node = new Node<>(value, head);
        tail.next = node;
        tail = node;
        size++;
        return true;
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        Node<E> next = head.next;
        head.next = next.next;
        if (tail == next) {
            tail = head;
        }
        size--;
        return next.val;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return head.next.val;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<>() {
            Node<E> p = head.next;

            @Override
            public boolean hasNext() {
                return p != head;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E val = p.val;
                p = p.next;
                return val;
            }
        };
    }

    private static class Node<E> {
        E val;
        Node<E> next;

        Node(E val, Node<E> next) {
            this.val = val;
            this.next = next;
        }
    }
}
