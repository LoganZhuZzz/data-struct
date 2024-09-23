package com.logan.study.linkedlist.alg;

import com.logan.study.linkedlist.Node;

public class MergeMultipleLinkedList {

    public static Node<Integer> mergeList(Node<Integer>[] nodes) {
        if (nodes == null || nodes.length == 0) {
            return null;
        }

        return merge(nodes, 0, nodes.length - 1);
    }

    private static Node<Integer> merge(Node<Integer>[] nodes, int low, int high) {
        if (low == high) {
            return nodes[low];
        }

        int mid = (low + high) >>> 1;
        Node<Integer> left = merge(nodes, low, mid);
        Node<Integer> right = merge(nodes, mid + 1, high);
        return mergeTwoList(left, right);
    }


//    public static Node<Integer> mergeList(Node<Integer>[] nodes) {
//        if (nodes == null || nodes.length == 0) {
//            return null;
//        }
//        return split(nodes, 0, nodes.length - 1);
//    }
//
//    private static Node<Integer> split(Node<Integer>[] nodes, int low, int high) {
//        if (low == high) {
//            return nodes[low];
//        }
//        int mid = (low + high) >>> 1;
//        Node<Integer> left = split(nodes, 0, mid);
//        Node<Integer> right = split(nodes, mid + 1, high);
//        return mergeTwoList(left, right);
//    }

    private static Node<Integer> mergeTwoList(Node<Integer> l1, Node<Integer> l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        }
    }
}
