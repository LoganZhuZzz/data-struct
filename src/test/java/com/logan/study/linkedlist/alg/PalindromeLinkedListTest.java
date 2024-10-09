package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    @Test
    public void testIsPalindrome() {
        Node<Integer> n1 = Node.of(1, 2, 1);
        Node<Integer> n2 = Node.of(1, 2, 2, 1);
        Node<Integer> n3 = Node.of(1, 2, 3, 2, 1);
        Node<Integer> n4 = Node.of(1, 2, 3, 4, 5);
        assertTrue(PalindromeLinkedList.isPalindrome(n1));
        assertTrue(PalindromeLinkedList.isPalindrome(n2));
        assertTrue(PalindromeLinkedList.isPalindrome(n3));
        assertFalse(PalindromeLinkedList.isPalindrome(n4));
    }

    @Test
    public void testIsPalindrome2() {
        Node<Integer> n1 = Node.of(1, 2, 1);
        Node<Integer> n2 = Node.of(1, 2, 2, 1);
        Node<Integer> n3 = Node.of(1, 2, 3, 2, 1);
        Node<Integer> n4 = Node.of(1, 2, 3, 4, 5);
        assertTrue(PalindromeLinkedList.isPalindrome2(n1));
        assertTrue(PalindromeLinkedList.isPalindrome2(n2));
        assertTrue(PalindromeLinkedList.isPalindrome2(n3));
        assertFalse(PalindromeLinkedList.isPalindrome2(n4));
    }
}
