package com.logan.study.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayQueueTest {

    ArrayQueue<Integer> queue = new ArrayQueue<>(3);

    @BeforeEach
    void init() {
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
    }

    @Test
    void offer() {
        assertIterableEquals(List.of(1, 2, 3), queue);
        assertFalse(queue.offer(6));
    }

    @Test
    void poll() {
        assertEquals(1, queue.poll());
        assertEquals(2, queue.poll());
        assertEquals(3, queue.poll());
        assertNull(queue.poll());
        assertTrue(queue.offer(1));
        assertTrue(queue.offer(2));
        assertTrue(queue.offer(3));
    }

    @Test
    void peek() {
        assertEquals(1, queue.peek());
        assertIterableEquals(List.of(1, 2, 3), queue);
    }
}
