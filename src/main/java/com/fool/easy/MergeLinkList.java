package com.fool.easy;

import com.fool.common.ListNode;

/**
 * 合并两个升序列表为一个升序列表
 * 21. 合并两个有序链表
 */
public class MergeLinkList {

    /*
        解法：解这道题的思路是分别比较两个链表中的各个节点，按顺序排列到新链表中，当有一个链表节点用完后，
        另一个链表剩下的节点直接排在新链表最后

        list1 = 1 -> 2 -> 3
        list2 = 1 -> 2 -> 3 -> 4 -> 5
        result = null

        第一次比较
        list1 = 2 -> 3
        list2 = 1 -> 2 -> 3 -> 4 -> 5
        result = 1

        第二次比较
        list1 = 2 -> 3
        list2 = 2 -> 3 -> 4 -> 5
        result = 1 -> 1

        ...

        当较短的链表用完时
        list1 = null
        list2 = 4 -> 5
        result = 1 -> 1 -> 2 -> 2 -> 3 -> 3

        此时，把list2接到新链表最后得到
        result = 1 -> 1 -> 2 -> 2 -> 3 -> 3 -> 4 -> 5

     */

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode result = new ListNode();
        ListNode temp = result;

        while (list1 != null &&  list2 !=null) {
            if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;
            } else {
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }

        if (list1 !=null) {
            temp.next = list1;
        }
        if (list2 !=null) {
            temp.next = list2;
        }
        return result.next;
    }

}