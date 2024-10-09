package com.logan.study.linkedlist;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

public class SinglyLinkedListTest {
    private SinglyLinkedList<Integer> linkedList;

    @BeforeEach
    public void setUp() {
        linkedList = new SinglyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
    }

    @Test
    public void forEach() {
        linkedList.forEach(System.out::println);
    }

    @Test
    public void forEachByRecursion() {
        linkedList.forEachByRecursion(item -> System.out.println("befor - " + item),
                item -> System.out.println("after -" + item));
    }

    @Test
    public void iterator() {
        for (Integer i : linkedList) {
            System.out.println(i);
        }
    }

    @Test
    public void addLast() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        Assertions.assertIterableEquals(List.of(1, 2, 3, 4), linkedList);
    }

    @Test
    public void get() {
        Assertions.assertEquals(2, linkedList.get(2));
        Assertions.assertEquals(3, linkedList.get(1));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> linkedList.get(5));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> linkedList.get(-1));
    }

    @Test
    public void addByIndex() {
        linkedList.add(2, 10);
        Assertions.assertIterableEquals(List.of(4, 3, 10, 2, 1), linkedList);
        linkedList.add(0, 20);
        Assertions.assertIterableEquals(List.of(20, 4, 3, 10, 2, 1), linkedList);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> linkedList.add(-1, 9));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> linkedList.add(20, 9));
    }

    @Test
    public void removeFirst() {
        Integer i1 = linkedList.removeFirst();
        Assertions.assertIterableEquals(List.of(3, 2, 1), linkedList);
        Integer i2 = linkedList.removeFirst();
        Assertions.assertIterableEquals(List.of(2, 1), linkedList);
        Integer i3 = linkedList.removeFirst();
        Assertions.assertIterableEquals(List.of(1), linkedList);
        Integer i4 = linkedList.removeFirst();
        Assertions.assertIterableEquals(List.of(), linkedList);
        Assertions.assertThrows(NoSuchElementException.class, () -> linkedList.removeFirst());

        Assertions.assertEquals(4, i1);
        Assertions.assertEquals(3, i2);
        Assertions.assertEquals(2, i3);
        Assertions.assertEquals(1, i4);
    }

    @Test
    public void testRemove() {
        Assertions.assertEquals(2, linkedList.remove(2));
        Assertions.assertIterableEquals(List.of(4, 3, 1), linkedList);
        Assertions.assertEquals(4, linkedList.remove(0));
        Assertions.assertIterableEquals(List.of(3, 1), linkedList);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> linkedList.remove(2));
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> linkedList.remove(3));
    }

}
