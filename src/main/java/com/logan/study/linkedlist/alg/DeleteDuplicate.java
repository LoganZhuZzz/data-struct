package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;

import java.util.Objects;

public class DeleteDuplicate {
    public static <E> Node<E> deleteDuplicateNode(Node<E> head) {
        if (head == null || head.next == null) {
            return head;
        }

        if (!Objects.equals(head.val, head.next.val)) {
            head.next = deleteDuplicateNode(head.next);
            return head;
        }

        Node<E> temp = head.next.next;
        while (temp != null && Objects.equals(temp.val, head.val)) {
            temp = temp.next;
        }
        return deleteDuplicateNode(temp);
    }

    public static <E> Node<E> deleteDuplicateNode2(Node<E> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<E> sentinel = new Node<>(null, head);
        Node<E> n1 = sentinel;

        while (n1.next != null) {
            Node<E> n2 = n1.next;
            Node<E> n3 = n2.next;

            if (n3 == null || !Objects.equals(n2.val, n3.val)) {
                n1 = n1.next;
                continue;
            }

            // 删除所有重复节点
            while (n3 != null && Objects.equals(n2.val, n3.val)) {
                n3 = n3.next;
            }

            n1.next = n3;
        }

        return sentinel.next;
    }
}
