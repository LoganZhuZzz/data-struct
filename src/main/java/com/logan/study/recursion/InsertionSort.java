package com.logan.study.recursion;

/**
 * 插入排序
 */
public class InsertionSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException();
        }
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int beginIndex, int endIndex) {
        insertion(arr, beginIndex, beginIndex + 1, endIndex);
    }

    private static void insertion(int[] arr, int beginIndex, int current, int endIndex) {
        if (current > endIndex) {
            return;
        }
        int temp = arr[current];
        int cursor = current - 1;
        while (cursor >= beginIndex && arr[cursor] > temp) {
            arr[cursor + 1] = arr[cursor];
            cursor--;
        }

        arr[cursor + 1] = temp;
        insertion(arr, beginIndex, current + 1, endIndex);
    }

}
