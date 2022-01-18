package com.fool.easy;

import com.fool.common.ListNode;


/**
 * @author Qiq
 * @date 2022/1/18
 */
public class DeleteDuplicatesNode {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode temp = result;
        while (temp.next != null && temp.next.next != null) {
            if (temp.next.val == temp.next.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return result.next;
    }


}
