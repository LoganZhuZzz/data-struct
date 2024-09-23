package com.logan.study.recursion;

import java.util.Arrays;

/**
 * 递归求解斐波那契数列
 * 实践复杂度 θ(1.618 n次方)
 */
public class Fibonacci {

    public static int f(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return f(n - 1) + f(n - 2);
    }

    public static int memoizationFibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        int[] memoization = new int[n + 1];
        Arrays.fill(memoization, -1);
        memoization[0] = 0;
        memoization[1] = 1;

        return fibonacci(n, memoization);
    }

    private static int fibonacci(int n, int[] memoization) {
        if (memoization[n] != -1) {
            return memoization[n];
        }

        memoization[n] = fibonacci(n - 1, memoization) + fibonacci(n - 2, memoization);
        return memoization[n];
    }


}
