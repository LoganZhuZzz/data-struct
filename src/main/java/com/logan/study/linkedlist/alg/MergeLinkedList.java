package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;

public class MergeLinkedList {

    public static Node<Integer> mergeList(Node<Integer> l1, Node<Integer> l2) {
        Node<Integer> sentinel = new Node<>(-1, null);
        Node<Integer> p1 = sentinel;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p1.next = l1;
                l1 = l1.next;
            } else {
                p1.next = l2;
                l2 = l2.next;
            }

            p1 = p1.next;
        }

        p1.next = l1 == null ? l2 : l1;
        return sentinel.next;
    }

    public static Node<Integer> mergeList2(Node<Integer> l1, Node<Integer> l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeList2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeList(l1, l2.next);
            return l2;
        }
    }
}
