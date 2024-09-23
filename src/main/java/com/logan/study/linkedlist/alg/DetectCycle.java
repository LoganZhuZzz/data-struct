package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;

import java.util.Objects;

public class DetectCycle {
    public static <E> Node<E> detectCycle(Node<E> head) {
        Node<E> slow = head;
        Node<E> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (Objects.equals(slow, fast)) {
                slow = head;
                break;
            }
        }

        while (fast != null && fast.next != null) {
            if (Objects.equals(slow, fast)) {
                return slow;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return null;
    }

}
