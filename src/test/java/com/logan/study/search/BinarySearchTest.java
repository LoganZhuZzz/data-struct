package com.logan.study.search;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testCloseCloseSearch() {
        int[] arr = {1, 3, 5, 10, 29, 31};
        Assertions.assertEquals(0, BinarySearch.closeCloseSearch(arr, 1));
        Assertions.assertEquals(1, BinarySearch.closeCloseSearch(arr, 3));
        Assertions.assertEquals(2, BinarySearch.closeCloseSearch(arr, 5));
        Assertions.assertEquals(3, BinarySearch.closeCloseSearch(arr, 10));
        Assertions.assertEquals(4, BinarySearch.closeCloseSearch(arr, 29));
        Assertions.assertEquals(5, BinarySearch.closeCloseSearch(arr, 31));
        Assertions.assertEquals(-1, BinarySearch.closeCloseSearch(arr, 100));
    }

    @Test
    public void testCloseOpenSearch() {
        int[] arr = {1, 3, 5, 10, 29, 31};
        Assertions.assertEquals(0, BinarySearch.closeOpenSearch(arr, 1));
        Assertions.assertEquals(1, BinarySearch.closeOpenSearch(arr, 3));
        Assertions.assertEquals(2, BinarySearch.closeOpenSearch(arr, 5));
        Assertions.assertEquals(3, BinarySearch.closeOpenSearch(arr, 10));
        Assertions.assertEquals(4, BinarySearch.closeOpenSearch(arr, 29));
        Assertions.assertEquals(5, BinarySearch.closeOpenSearch(arr, 31));
        Assertions.assertEquals(-1, BinarySearch.closeOpenSearch(arr, 9));
        Assertions.assertEquals(-1, BinarySearch.closeOpenSearch(arr, 100));

    }

    @Test
    public void testBalanceSearch() {
        int[] arr = {1, 3, 5, 10, 29, 31};
        Assertions.assertEquals(0, BinarySearch.balanceSearch(arr, 1));
        Assertions.assertEquals(1, BinarySearch.balanceSearch(arr, 3));
        Assertions.assertEquals(2, BinarySearch.balanceSearch(arr, 5));
        Assertions.assertEquals(3, BinarySearch.balanceSearch(arr, 10));
        Assertions.assertEquals(4, BinarySearch.balanceSearch(arr, 29));
        Assertions.assertEquals(5, BinarySearch.balanceSearch(arr, 31));
        Assertions.assertEquals(-1, BinarySearch.balanceSearch(arr, 9));
        Assertions.assertEquals(-1, BinarySearch.balanceSearch(arr, 100));
    }

    @Test
    public void testLeftMostSearch() {
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 7};
        Assertions.assertEquals(0, BinarySearch.leftMostSearch(arr, 1));
        Assertions.assertEquals(1, BinarySearch.leftMostSearch(arr, 2));
        Assertions.assertEquals(2, BinarySearch.leftMostSearch(arr, 4));
        Assertions.assertEquals(5, BinarySearch.leftMostSearch(arr, 5));
        Assertions.assertEquals(6, BinarySearch.leftMostSearch(arr, 6));
        Assertions.assertEquals(7, BinarySearch.leftMostSearch(arr, 7));

        Assertions.assertEquals(-1, BinarySearch.leftMostSearch(arr, 0));
        Assertions.assertEquals(-1, BinarySearch.leftMostSearch(arr, 3));
        Assertions.assertEquals(-1, BinarySearch.leftMostSearch(arr, 8));
    }

    @Test
    public void testRightMostSearch() {
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 7};
        Assertions.assertEquals(0, BinarySearch.rightMostSearch(arr, 1));
        Assertions.assertEquals(1, BinarySearch.rightMostSearch(arr, 2));
        Assertions.assertEquals(4, BinarySearch.rightMostSearch(arr, 4));
        Assertions.assertEquals(5, BinarySearch.rightMostSearch(arr, 5));
        Assertions.assertEquals(6, BinarySearch.rightMostSearch(arr, 6));
        Assertions.assertEquals(7, BinarySearch.rightMostSearch(arr, 7));

        Assertions.assertEquals(-1, BinarySearch.rightMostSearch(arr, 0));
        Assertions.assertEquals(-1, BinarySearch.rightMostSearch(arr, 3));
        Assertions.assertEquals(-1, BinarySearch.rightMostSearch(arr, 8));
    }

}