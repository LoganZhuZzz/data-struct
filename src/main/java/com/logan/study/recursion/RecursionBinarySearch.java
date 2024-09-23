package com.logan.study.recursion;

public class RecursionBinarySearch {

    public static int search(int[] arr, int target) {
        return recursion(arr, target, 0, arr.length - 1);
    }

    private static int recursion(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) >>> 1;
        if (arr[mid] < target) {
            return recursion(arr, target, mid + 1, high);
        } else if (target < arr[mid]) {
            return recursion(arr, target, low, mid - 1);
        } else {
            return mid;
        }
    }
}
