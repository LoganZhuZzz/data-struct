package com.logan.study.recursion;

import java.util.LinkedList;

/**
 * 汉诺塔
 */
public class HanoiTower {
    static LinkedList<Integer> a = new LinkedList<>();
    static LinkedList<Integer> b = new LinkedList<>();
    static LinkedList<Integer> c = new LinkedList<>();


    public static void main(String[] args) {
        init(3);
        print();
        move(3, a, b, c);

        init(4);
        print();
        move(4, a, b, c);
    }

    static void init(int n) {
        for (int i = n; i >= 1; i--) {
            a.addLast(i);
        }
    }

    static void move(int n, LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c) {
        if (n == 0) {
            return;
        }

        move(n - 1, a, c, b);
        c.addLast(a.removeLast());
        print();
        move(n - 1, b, a, c);
    }

    private static void print() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("-----------------");
    }

}
