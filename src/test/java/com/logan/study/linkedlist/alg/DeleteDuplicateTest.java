package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DeleteDuplicateTest {

    @Test
    public void testDeleteDuplicateNode() {
        Node<Integer> head1 = Node.of(2, 2, 2, 3, 4, 4, 5, 6, 6, 6);
        Node<Integer> remove = DeleteDuplicate.deleteDuplicateNode(head1);
        System.out.println(remove);
        assertEquals("[3,5]", remove.toString());

        Node<Integer> head2 = Node.of(1, 8, 8, 8, 8, 8, 8, 8);
        Node<Integer> remove2 = DeleteDuplicate.deleteDuplicateNode(head2);
        System.out.println(remove2);
        assertEquals("[1]", remove2.toString());

        Node<Integer> head3 = Node.of(8, 8, 8, 8, 8, 8, 8);
        Node<Integer> remove3 = DeleteDuplicate.deleteDuplicateNode(head3);
        System.out.println(remove3);
        assertNull(remove3);

        Node<Integer> head4 = Node.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 15);
        Node<Integer> remove4 = DeleteDuplicate.deleteDuplicateNode(head4);
        System.out.println(remove4);
        assertEquals("[1,2,3,4,5,6,7,8,9,11,12,13,14]", remove4.toString());
    }

    @Test
    public void testDeleteDuplicateNode2() {
        Node<Integer> head1 = Node.of(2, 2, 2, 3, 4, 4, 5, 6, 6, 6);
        Node<Integer> remove = DeleteDuplicate.deleteDuplicateNode2(head1);
        System.out.println(remove);
        assertEquals("[3,5]", remove.toString());

        Node<Integer> head2 = Node.of(1, 8, 8, 8, 8, 8, 8, 8);
        Node<Integer> remove2 = DeleteDuplicate.deleteDuplicateNode2(head2);
        System.out.println(remove2);
        assertEquals("[1]", remove2.toString());

        Node<Integer> head3 = Node.of(8, 8, 8, 8, 8, 8, 8);
        Node<Integer> remove3 = DeleteDuplicate.deleteDuplicateNode2(head3);
        System.out.println(remove3);
        assertNull(remove3);

        Node<Integer> head4 = Node.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 15);
        Node<Integer> remove4 = DeleteDuplicate.deleteDuplicateNode2(head4);
        System.out.println(remove4);
        assertEquals("[1,2,3,4,5,6,7,8,9,11,12,13,14]", remove4.toString());
    }
}