package com.logan.study.linkedlist;

public class Node<E> {

    public E val;
    public Node<E> next;

    public Node(E val, Node<E> next) {
        this.val = val;
        this.next = next;
    }

    @SafeVarargs
    public static <E> Node<E> of(E... e) {
        if (e == null || e.length == 0) {
            throw new IllegalArgumentException("At least one element is required.");
        }
        Node<E> head = new Node<>(e[0], null);
        Node<E> current = head;
        for (int i = 1; i < e.length; i++) {
            current.next = new Node<>(e[i], null);
            current = current.next;
        }
        return head;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Node<E> p = this;
        while (p != null) {
            builder.append(p.val);
            if (p.next != null) {
                builder.append(",");
            }
            p = p.next;
        }
        builder.append("]");
        return builder.toString();
    }
}
