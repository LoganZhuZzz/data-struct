package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;

public class ReverseList {

    public static <E> Node<E> reverse1(Node<E> head) {
        Node<E> cursor = head;
        Node<E> node = null;

        while (cursor != null) {
            node = new Node<>(cursor.val, node);
            cursor = cursor.next;
        }
        return node;
    }

    public static <E> Node<E> reverse2(Node<E> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<E> node = reverse2(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static <E> Node<E> reverse3(Node<E> head) {
        Node<E> n1 = head;
        Node<E> next = head.next;

        while (next != null) {
            head.next = next.next;
            next.next = n1;
            n1 = next;
            next = head.next;
        }
        return n1;
    }

    public static <E> Node<E> reverse4(Node<E> head) {
        Node<E> reverse = null;
        while (head != null) {
            Node<E> next = head.next;
            head.next = reverse;
            reverse = head;
            head = next;
        }
        return reverse;
    }

}
