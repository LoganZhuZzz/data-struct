package com.logan.study.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListQueueTest {
    LinkedListQueue<Integer> queue = new LinkedListQueue<>(5);

    @BeforeEach
    void init() {
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
    }

    @Test
    void offer() {
        assertIterableEquals(List.of(1,2,3,4,5), queue);
        assertFalse(queue.offer(6));
    }

    @Test
    void poll() {
        assertEquals(1, queue.poll());
        assertEquals(2, queue.poll());
        assertEquals(3, queue.poll());
        assertEquals(4, queue.poll());
        assertEquals(5, queue.poll());
        assertNull(queue.poll());
    }

    @Test
    void peek() {
        assertEquals(1, queue.peek());
        assertIterableEquals(List.of(1,2,3,4,5), queue);
    }

}