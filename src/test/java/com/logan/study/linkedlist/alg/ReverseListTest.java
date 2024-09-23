package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverseListTest {

    private Node<Integer> head;

    @BeforeEach
    public void init() {
        Node<Integer> n4 = new Node<>(5, null);
        Node<Integer> n3 = new Node<>(4, n4);
        Node<Integer> n2 = new Node<>(3, n3);
        Node<Integer> n1 = new Node<>(2, n2);
        head = new Node<>(1, n1);

        System.out.println(head);
    }


    @Test
    @DisplayName("头插法反转链表")
    public void reverseList() {
        Node<Integer> tail = ReverseList.reverse1(head);
        System.out.println(tail);
        Assertions.assertEquals("[5,4,3,2,1]", tail.toString());
    }

    @Test
    @DisplayName("递归反转链表")
    public void reverseList2() {
        Node<Integer> tail = ReverseList.reverse2(head);
        System.out.println(tail);
        Assertions.assertEquals("[5,4,3,2,1]", tail.toString());
    }

    @Test
    @DisplayName("双指针反转链表")
    public void reverseList3() {
        Node<Integer> tail = ReverseList.reverse3(head);
        System.out.println(tail);
        Assertions.assertEquals("[5,4,3,2,1]", tail.toString());
    }

    @Test
    public void reverseList4() {
        Node<Integer> tail = ReverseList.reverse4(head);
        System.out.println(tail);
        Assertions.assertEquals("[5,4,3,2,1]", tail.toString());
    }


}
