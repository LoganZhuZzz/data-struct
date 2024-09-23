package com.logan.study.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursionTest {

    @Test
    public void testSearch() {
        int[] arr = {1, 3, 5, 10, 29, 31};
        assertEquals(0, RecursionBinarySearch.search(arr, 1));
        assertEquals(1, RecursionBinarySearch.search(arr, 3));
        assertEquals(2, RecursionBinarySearch.search(arr, 5));
        assertEquals(3, RecursionBinarySearch.search(arr, 10));
        assertEquals(4, RecursionBinarySearch.search(arr, 29));
        assertEquals(5, RecursionBinarySearch.search(arr, 31));
        assertEquals(-1, RecursionBinarySearch.search(arr, 100));
    }

    @Test
    public void testBubbleSort() {
        int[] expected = {1, 2, 3, 4, 5};

        int[] a1 = {5, 4, 3, 2, 1};
        BubbleSort.sort(a1);
        assertArrayEquals(expected, a1);

        int[] a2 = {4, 5, 3, 2, 1};
        BubbleSort.sort(a2);
        assertArrayEquals(expected, a2);
        int[] a3 = {3, 1, 4, 2, 5};
        BubbleSort.sort(a3);
        assertArrayEquals(expected, a3);
        int[] a4 = {1, 2, 3, 4, 5};
        BubbleSort.sort(a4);
        assertArrayEquals(expected, a4);
    }

    @Test
    public void testBubbleSortUseUnorderedBorder() {
        int[] expected = {1, 2, 3, 4, 5};

        int[] a1 = {5, 4, 3, 2, 1};
        BubbleSort.sortUseUnorderedBorder(a1);
        assertArrayEquals(expected, a1);

        int[] a2 = {4, 5, 3, 2, 1};
        BubbleSort.sortUseUnorderedBorder(a2);
        assertArrayEquals(expected, a2);
        int[] a3 = {3, 1, 4, 2, 5};
        BubbleSort.sortUseUnorderedBorder(a3);
        assertArrayEquals(expected, a3);
        int[] a4 = {1, 2, 3, 4, 5};
        BubbleSort.sortUseUnorderedBorder(a4);
        assertArrayEquals(expected, a4);
    }


    @Test
    public void testInsertionSort() {
        int[] expected = {1, 2, 3, 4, 5};

        int[] a1 = {5, 4, 3, 2, 1};
        InsertionSort.sort(a1);
        assertArrayEquals(expected, a1);

        int[] a2 = {4, 5, 3, 2, 1};
        InsertionSort.sort(a2);
        assertArrayEquals(expected, a2);
        int[] a3 = {3, 1, 4, 2, 5};
        InsertionSort.sort(a3);
        assertArrayEquals(expected, a3);
        int[] a4 = {1, 2, 3, 4, 5};
        InsertionSort.sort(a4);
        assertArrayEquals(expected, a4);

        int[] a5 = {5, 4, 3, 2, 1};
        int[] expected5 = {5, 4, 1, 2, 3};
        InsertionSort.sort(a5, 2, 4);
        assertArrayEquals(expected5, a5);

        int[] a6 = {5, 4, 3, 2, 1};
        int[] expected6 = {5, 4, 3, 2, 1};
        InsertionSort.sort(a5, 4, 4);
        assertArrayEquals(expected6, a6);
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, Fibonacci.f(0));
        assertEquals(1, Fibonacci.f(1));
        assertEquals(1, Fibonacci.f(2));
        assertEquals(2, Fibonacci.f(3));
        assertEquals(3, Fibonacci.f(4));
        assertEquals(5, Fibonacci.f(5));
        assertEquals(8, Fibonacci.f(6));
        assertEquals(13, Fibonacci.f(7));
        assertEquals(21, Fibonacci.f(8));
        assertEquals(34, Fibonacci.f(9));
    }

    @Test
    public void testMemoizationFibonacci() {
        assertEquals(0, Fibonacci.memoizationFibonacci(0));
        assertEquals(1, Fibonacci.memoizationFibonacci(1));
        assertEquals(1, Fibonacci.memoizationFibonacci(2));
        assertEquals(2, Fibonacci.memoizationFibonacci(3));
        assertEquals(3, Fibonacci.memoizationFibonacci(4));
        assertEquals(5, Fibonacci.memoizationFibonacci(5));
        assertEquals(8, Fibonacci.memoizationFibonacci(6));
        assertEquals(13, Fibonacci.memoizationFibonacci(7));
        assertEquals(21, Fibonacci.memoizationFibonacci(8));
        assertEquals(34, Fibonacci.memoizationFibonacci(9));
    }
}