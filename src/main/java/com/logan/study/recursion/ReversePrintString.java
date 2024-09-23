package com.logan.study.recursion;

public class ReversePrintString {

    public static void reverseStr(int index, String str) {
        if (index == str.length()) {
            return;
        }
        reverseStr(index + 1, str);
        System.out.println(str.charAt(index));
    }

    public static void main(String[] args) {
        reverseStr(0, "abcde");
    }
}
