package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;

public class RemoveElements {

    public static Node<Integer> remove(Node<Integer> head, int val) {
        Node<Integer> sentinel = new Node<>(-1, head);
        Node<Integer> p1 = sentinel;
        Node<Integer> p2 = p1.next;
        while (p2 != null) {
            if (val == p2.val) {
                p1.next = p2.next;
            } else {
                p1 = p1.next;
            }
            p2 = p1.next;
        }
        return sentinel.next;
    }

    public static Node<Integer> remove2(Node<Integer> current, int val) {
        if (current == null) {
            return null;
        }

        if (val == current.val) {
            return remove2(current.next, val);
        } else {
            current.next = remove2(current.next, val);
            return current;
        }
    }

}
