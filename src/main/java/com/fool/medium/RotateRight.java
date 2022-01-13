package com.fool.medium;

import com.fool.common.ListNode;

/**
 * 61. 旋转链表
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 */
public class RotateRight {

    /**
     * 解题思路：
     * 旋转链表，首先把链表变成环形链表，然后取到移动后是头节点的位置，截断环形
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next==null || k == 0) {
            return head;
        }
        ListNode curr = head;
        int len = 0;
        while (true) {
            curr = curr.next;
            len++;
            if (curr.next == null) {
                len++;
                break;
            }
        }
        curr.next = head;
        int newK = len - k % len;
        for (int i = 0; i < newK; i++) {
           head = head.next;
        }

        ListNode res = head;
        ListNode tempNode = res;
        for (int i = 1; i < len; i++) {
           tempNode = tempNode.next;
        }
        tempNode.next = null;
        return res;
    }

}
