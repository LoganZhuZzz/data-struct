package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCycleTest {

    @Test
    public void testDetectCycle() {
        Node<Integer> n12 = new Node<>(12, null);
        Node<Integer> n11 = new Node<>(11, n12);
        Node<Integer> n10 = new Node<>(10, n11);
        Node<Integer> n9 = new Node<>(9, n10);
        Node<Integer> n8 = new Node<>(8, n9);
        Node<Integer> n7 = new Node<>(7, n8);
        Node<Integer> n6 = new Node<>(6, n7);
        Node<Integer> n5 = new Node<>(5, n6);
        Node<Integer> n4 = new Node<>(4, n5);
        Node<Integer> n3 = new Node<>(3, n4);
        Node<Integer> n2 = new Node<>(2, n3);
        Node<Integer> n1 = new Node<>(1, n2);
        n12.next = n8;

        assertEquals(n8, DetectCycle.detectCycle(n1));
    }

    @Test
    public void testDetectWholeCycle() {
        Node<Integer> n12 = new Node<>(12, null);
        Node<Integer> n11 = new Node<>(11, n12);
        Node<Integer> n10 = new Node<>(10, n11);
        Node<Integer> n9 = new Node<>(9, n10);
        Node<Integer> n8 = new Node<>(8, n9);
        Node<Integer> n7 = new Node<>(7, n8);
        Node<Integer> n6 = new Node<>(6, n7);
        Node<Integer> n5 = new Node<>(5, n6);
        Node<Integer> n4 = new Node<>(4, n5);
        Node<Integer> n3 = new Node<>(3, n4);
        Node<Integer> n2 = new Node<>(2, n3);
        Node<Integer> n1 = new Node<>(1, n2);
        n12.next = n1;

        assertEquals(n1, DetectCycle.detectCycle(n1));
    }

    @Test
    public void testDetectShortWholeCycle() {
        Node<Integer> n3 = new Node<>(3, null);
        Node<Integer> n2 = new Node<>(2, n3);
        Node<Integer> n1 = new Node<>(1, n2);
        n3.next = n1;

        assertEquals(n1, DetectCycle.detectCycle(n1));
    }

}
