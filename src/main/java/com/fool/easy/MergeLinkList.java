package com.fool.easy;

/**
 * 合并两个升序列表为一个升序列表
 * 21. 合并两个有序链表
 */
public class MergeLinkList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode result = new ListNode();
        ListNode temp = result;

        while (l1 != null &&  l2!=null) {
            if (l1.val > l2.val) {
                temp.next = l2;
                l2 = l2.next;
            } else {
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;
        }

        if (l1!=null) {
            temp.next = l1;
        }
        if (l2!=null) {
            temp.next = l2;
        }
        return result.next;
    }

}