package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;

/**
 * 删除链表的倒数第N个节点
 */
public class RemoveNthFromEnd {


    public static Node<Integer> removeNthFromEnd(Node<Integer> head, int n) {
        Node<Integer> sentinel = new Node<>(0, head);
        recursion(sentinel, n);
        return sentinel.next;
    }


    private static int recursion(Node<Integer> head, int n) {
        if (head == null) {
            return 0;
        }
        int nth = recursion(head.next, n);
        if (nth == n) {
            head.next = head.next.next;
        }
        return ++nth;
    }


    public static Node<Integer> removeNthFromEnd2(Node<Integer> head, int n) {
        Node<Integer> sentinel = new Node<>(-1, head);
        Node<Integer> slow = sentinel;
        Node<Integer> fast = sentinel;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return sentinel.next;
    }

}
