package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthFromEndTest {

    @Test
    @DisplayName("递归删除尾部节点")
    public void testRemove() {
        Node<Integer> head = Node.of(1, 2, 3, 4, 5);
        Node<Integer> remove = RemoveNthFromEnd.removeNthFromEnd(head, 2);
        System.out.println(remove);
        assertEquals("[1,2,3,5]", remove.toString());

        Node<Integer> remove2 = RemoveNthFromEnd.removeNthFromEnd(head, 4);
        System.out.println(remove2);
        assertEquals("[2,3,5]", remove2.toString());
    }

    @Test
    @DisplayName("快慢指针删除尾部节点")
    public void testRemove2() {
        Node<Integer> head = Node.of(1, 2, 3, 4, 5);
        Node<Integer> remove = RemoveNthFromEnd.removeNthFromEnd2(head, 2);
        System.out.println(remove);
        assertEquals("[1,2,3,5]", remove.toString());

        Node<Integer> remove2 = RemoveNthFromEnd.removeNthFromEnd2(head, 4);
        System.out.println(remove2);
        assertEquals("[2,3,5]", remove2.toString());
    }
}