package com.study.leetcode;

import java.util.Stack;

/**
 * ClassName: ReversePrint
 * Author: ye.liu
 * Date: 2022/3/11 14:36
 * Description:
 */

/*
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */

public class ReversePrint {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    public static int[] arr(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.pop().val;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(6);
        System.out.println(String.valueOf(arr(head)));
        int[] a =arr(head);
        for(int i:a){
            System.out.println(i);
        }
    }
}
