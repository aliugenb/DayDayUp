package com.study.leetcode;

/**
 * ClassName: ReverseList
 * Author: ye.liu
 * Date: 2022/3/11 22:54
 * Description:
 */
/*
定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */

public class ReverseList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
}
