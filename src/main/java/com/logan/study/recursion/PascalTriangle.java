package com.logan.study.recursion;

/**
 * 杨辉三角
 */
public class PascalTriangle {

    public static void main(String[] args) {
        printTriangle(12);
        System.out.println("=====================================================");
        memoizationPrintTriangle(12);
        System.out.println("=====================================================");
        optimizedMemoizationPrintTriangle(12);
    }

    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            printSpace(n, i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", element(i, j));
            }
            System.out.println();
        }
    }

    /**
     * 使用二维数组记忆法进行优化
     *
     * @param n 三角高度
     */
    public static void memoizationPrintTriangle(int n) {
        int[][] memoization = new int[n][];
        for (int i = 0; i < n; i++) {
            printSpace(n, i);
            memoization[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", element(memoization, i, j));
            }
            System.out.println();
        }
    }

    /**
     * 使用一维数组利用动态规划的思想继续优化，无需使用二维数组
     *
     * @param n 三角高度
     */
    public static void optimizedMemoizationPrintTriangle(int n) {
        int[] row = new int[n];
        for (int i = 0; i < n; i++) {
            printSpace(n, i);
            fillRow(row, i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", row[j]);
            }
            System.out.println();
        }
    }

    /**
     * 根据上一行的结果填充数据
     * 4 Example：
     * <pre>
     * 1                i = 0
     * 1   1            i = 1
     * 1   2   1        i = 2
     * 1   3   3   1    i = 3
     * </pre>
     *
     * @param row       备忘录 记录每次计算的行数据
     * @param rowNumber 行号
     */
    private static void fillRow(int[] row, int rowNumber) {
        if (rowNumber == 0) {
            row[0] = 1;
            return;
        }
        for (int i = rowNumber; i > 0; i--) {
            row[i] = row[i] + row[i - 1];
        }
    }

    private static int element(int i, int j) {
        if (j == 0 || i == j) {
            return 1;
        }
        return element(i - 1, j - 1) + element(i - 1, j);
    }

    private static int element(int[][] memoization, int i, int j) {
        if (memoization[i][j] > 0) {
            return memoization[i][j];
        }

        if (j == 0 || i == j) {
            memoization[i][j] = 1;
            return 1;
        }

        memoization[i][j] = element(memoization, i - 1, j - 1) + element(memoization, i - 1, j);
        return memoization[i][j];
    }

    private static void printSpace(int n, int i) {
        int loop = (n - 1 - i) * 2;
        for (int i1 = 0; i1 < loop; i1++) {
            System.out.print(" ");
        }
    }
}
