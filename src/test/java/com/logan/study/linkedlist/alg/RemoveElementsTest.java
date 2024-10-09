package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementsTest {

    @Test
    public void testRemove() {
        Node<Integer> head1 = Node.of(2, 3, 2, 4, 2, 5, 2, 6);
        Node<Integer> remove = RemoveElements.remove(head1, 2);
        System.out.println(remove);
        assertEquals("[3,4,5,6]", remove.toString());

        Node<Integer> head2 = Node.of(8, 8, 8, 8, 8, 1, 8, 8);
        Node<Integer> remove2 = RemoveElements.remove(head2, 8);
        System.out.println(remove2);
        assertEquals("[1]", remove2.toString());
    }

    @Test
    @DisplayName("递归删除")
    public void testRemove2() {
        Node<Integer> head1 = Node.of(2, 3, 2, 4, 2, 5, 2, 6);
        Node<Integer> remove = RemoveElements.remove2(head1, 2);
        System.out.println(remove);
        assertEquals("[3,4,5,6]", remove.toString());

        Node<Integer> head2 = Node.of(8, 8, 8, 8, 8, 1, 8, 8);
        Node<Integer> remove2 = RemoveElements.remove2(head2, 8);
        System.out.println(remove2);
        assertEquals("[1]", remove2.toString());
    }
}
