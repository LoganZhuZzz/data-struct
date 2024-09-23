package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleNodeTest {

    @Test
    public void testMerge() {
        Node<Integer> l1 = Node.of(1, 2, 3, 4, 5);
        Node<Integer> l2 = Node.of(1, 2, 3, 4, 5, 6);
        assertEquals(3, MiddleNode.findMiddleNode(l1).val);
        assertEquals(4, MiddleNode.findMiddleNode(l2).val);
    }
}