package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;

import java.util.Objects;

public class PalindromeLinkedList {

    public static boolean isPalindrome(Node<Integer> head) {
        Node<Integer> middle = findMiddle(head);

        Node<Integer> reverse = reverse(middle);
        while (reverse != null) {
            if (!Objects.equals(reverse.val, head.val)) {
                return false;
            }
            reverse = reverse.next;
            head = head.next;
        }
        return true;
    }

    /**
     * 优化版判断是否是回文链表
     * 在找中间点的同时反转前面一半的链表 再跟后一半链表进行比较
     * example:
     *      sl
     *           fa
     * 1 -> 2 -> 1 -> null
     * 1
     *      VS  slow.next   奇数节点需要特殊处理
     *           1
     *
     * ========================
     *           sl
     *                      fa
     * 1 -> 2 -> 2 -> 1 -> null
     * 2 -> 1
     *        VS
     *           2 -> 1
     *
     * @param head ~
     * @return ~
     */
    public static boolean isPalindrome2(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        Node<Integer> reversedFirstHalf = null;
        Node<Integer> cursor = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            cursor.next = reversedFirstHalf;
            reversedFirstHalf = cursor;
            cursor = slow;
        }

        if (fast != null) { // Odd number of nodes
            slow = slow.next;
        }

        while (reversedFirstHalf != null) {
            if (!Objects.equals(reversedFirstHalf.val, slow.val)) {
                return false;
            }
            reversedFirstHalf = reversedFirstHalf.next;
            slow = slow.next;
        }

        return true;
    }

    private static <E> Node<E> findMiddle(Node<E> head) {
        Node<E> slow = head;
        Node<E> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static <E> Node<E> reverse(Node<E> head) {
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
