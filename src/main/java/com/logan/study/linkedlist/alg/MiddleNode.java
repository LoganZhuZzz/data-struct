package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;

public class MiddleNode {
    public static Node<Integer> findMiddleNode(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
