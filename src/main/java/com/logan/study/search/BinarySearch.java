package com.logan.study.search;

public class BinarySearch {

    /**
     * 二分查找 左闭右闭
     *
     * @param arr    ~
     * @param target ~
     * @return ~
     */
    public static int closeCloseSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1; // 防止溢出到符号位
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 二分查找 左闭右开
     *
     * @param arr    ~
     * @param target ~
     * @return ~
     */
    public static int closeOpenSearch(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }


    /**
     * 二分查找 平衡版
     * 平衡版 最好最坏的时间复杂度一致 可以表示为 θ(log(n))
     *
     * @param arr    ~
     * @param target ~
     * @return ~
     */
    public static int balanceSearch(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (1 < high - low) {
            int mid = (low + high) >>> 1;
            if (target < arr[mid]) {
                high = mid;
            } else {
                low = mid;
            }
        }
        if (arr[low] == target) {
            return low;
        }
        return -1;
    }

    /**
     * 二分查找 如果有重复元素返回最左侧元素位置
     *
     * @param arr    ~
     * @param target ~
     * @return ~
     */
    public static int leftMostSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1, candidate = -1;
        while (low <= high) {
            int mid = (low + high) >>> 1;

            if (arr[mid] < target) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                candidate = mid;
                high = mid - 1;
            }
        }
        return candidate;
    }


    /**
     * 二分查找 如果有重复元素返回最右侧元素位置
     *
     * @param arr    ~
     * @param target ~
     * @return ~
     */
    public static int rightMostSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1, candidate = -1;
        while (low <= high) {
            int mid = (low + high) >>> 1;

            if (arr[mid] < target) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                candidate = mid;
                low = mid + 1;
            }
        }
        return candidate;
    }
}
