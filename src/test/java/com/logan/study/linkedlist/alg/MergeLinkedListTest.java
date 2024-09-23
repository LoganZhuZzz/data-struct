package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeLinkedListTest {


    @Test
    public void testMerge() {
        Node<Integer> l1 = Node.of(1, 3, 8, 9);
        Node<Integer> l2 = Node.of(2, 4);
        Node<Integer> m1 = MergeLinkedList.mergeList(l1, l2);
        System.out.println(m1);
        assertEquals("[1,2,3,4,8,9]", m1.toString());


        Node<Integer> l22 = Node.of(2, 4);
        Node<Integer> m11 = MergeLinkedList.mergeList(null, l22);
        System.out.println(m11);
        assertEquals("[2,4]", m11.toString());

        Node<Integer> m111 = MergeLinkedList.mergeList(null, null);
        assertNull(m111);
    }

    @Test
    public void testMerge2() {
        Node<Integer> l1 = Node.of(1, 3, 8, 9);
        Node<Integer> l2 = Node.of(2, 4);
        Node<Integer> m1 = MergeLinkedList.mergeList2(l1, l2);
        System.out.println(m1);
        assertEquals("[1,2,3,4,8,9]", m1.toString());


        Node<Integer> l22 = Node.of(2, 4);
        Node<Integer> m11 = MergeLinkedList.mergeList2(null, l22);
        System.out.println(m11);
        assertEquals("[2,4]", m11.toString());

    }

    @Test
    @SuppressWarnings("unchecked")
    public void testMultipleMerge() {
        Node<Integer>[] nodes = new Node[]{
          Node.of(1, 4, 5),
          Node.of(1, 3, 4),
          Node.of(2, 6)
        };
        Node<Integer> node = MergeMultipleLinkedList.mergeList(nodes);
        System.out.println(node);
        assertEquals("[1,1,2,3,4,4,5,6]", node.toString());
    }
}