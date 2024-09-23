package com.logan.study.recursion;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        bubble(arr, arr.length - 1);
    }

    private static void bubble(int[] arr, int high) {
        if (high == 0) {
            return;
        }
        for (int i = 0; i < high; i++) {
            if (arr[i] > arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
        }
        bubble(arr, high - 1);
    }

    public static void sortUseUnorderedBorder(int[] arr) {
        bubbleUseUnorderedBorder(arr, arr.length - 1);
    }

    private static void bubbleUseUnorderedBorder(int[] arr, int unorderedBorder) {
        if (unorderedBorder == 0) {
            return;
        }
        int rightBorder = 0;
        for (int i = 0; i < unorderedBorder; i++) {
            if (arr[i] > arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
                rightBorder = i;
            }
        }
        bubbleUseUnorderedBorder(arr, rightBorder);
    }
}
