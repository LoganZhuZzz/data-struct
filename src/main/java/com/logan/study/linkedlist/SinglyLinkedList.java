package com.logan.study.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class SinglyLinkedList<E> implements Iterable<E> {
    private Node<E> head;

    public boolean add(E e) {
        linkFirst(e);
        return true;
    }

    public void add(int index, E e) {
        if (index == 0) {
            linkFirst(e);
            return;
        }
        Node<E> prev = node(index - 1);
        prev.next = new Node<>(e, prev.next);
    }

    public void addLast(E e) {
        linkLast(e);
    }

    public E removeFirst() {
        Node<E> n = head;
        if (n == null) {
            throw new NoSuchElementException();
        }
        E e = n.val;
        head = head.next;
        return e;
    }

    public E remove(int index) {
        if (index == 0) {
            return removeFirst();
        }

        Node<E> prev = node(index - 1);
        if (prev.next == null) {
            throw new IndexOutOfBoundsException();
        }
        E val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    public E get(int index) {
        return node(index).val;
    }

    Node<E> node(int index) {
        Node<E> n = head;
        for (int i = 0; n != null; i++) {
            if (i == index) {
                return n;
            }
            n = n.next;
        }
        throw new IndexOutOfBoundsException();
    }

    public void forEach(Consumer<? super E> action) {
        Node<E> n = head;
        while (n != null) {
            action.accept(n.val);
            n = n.next;
        }
    }

    public void forEachByRecursion(Consumer<? super E> beforeAction, Consumer<? super E> afterAction) {
        recursion(head, beforeAction, afterAction);
    }

    private void recursion(Node<E> cur, Consumer<? super E> beforeAction, Consumer<? super E> afterAction) {
        if (cur == null) {
            return;
        }
        beforeAction.accept(cur.val);
        recursion(cur.next, beforeAction, afterAction);
        afterAction.accept(cur.val);
    }

    private void linkFirst(E e) {
        head = new Node<>(e, head);
    }

    private void linkLast(E e) {
        Node<E> last = findLast();
        if (last == null) {
            linkFirst(e);
            return;
        }
        last.next = new Node<>(e, null);
    }

    private Node<E> findLast() {
        Node<E> n = head;
        while (n != null && n.next != null) {
            n = n.next;
        }
        return n;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        Node<E> cursor = head;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public E next() {
            E val = cursor.val;
            cursor = cursor.next;
            return val;
        }
    }

    private static class Node<E> {
        E val;
        Node<E> next;

        public Node(E val, Node<E> next) {
            this.val = val;
            this.next = next;
        }
    }
}
