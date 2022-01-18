package com.fool.medium;
//给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4]
//输出：[2,1,4,3]
//
//
// 示例 2：
//
//
//输入：head = []
//输出：[]
//
//
// 示例 3：
//
//
//输入：head = [1]
//输出：[1]
//
//
//
//
// 提示：
//
//
// 链表中节点的数目在范围 [0, 100] 内
// 0 <= Node.val <= 100
//
// Related Topics 递归 链表
// 👍 1199 👎 0

import com.fool.common.ListNode;

/**
 * @author Qiq
 * @date 2022/1/14
 */
public class SwapPairs {

    /*
        首先考虑如何交换节点，将前一个节点的next指向后一个节点的next
        再将后一个节点的next指向前一个节点，即：
            ListNode temp = new ListNode();
            temp = head.next;

            head.next = head.next.next;
            temp.next = head;

            head = 1 -> 2 -> 3 -> 4 -> 5
            head = 1 -> 3 -> 4 -> 5
            temp = 2 -> 3 -> 4 -> 5
            temp = 2 -> 1 -> 4 -> 5

     */

    public ListNode swapPairs(ListNode head) {

        ListNode result = new ListNode(0);
        result.next = head;
        ListNode temp = result;

        while (temp.next != null && temp.next.next != null) {
            ListNode n1 = temp.next;
            ListNode n2 = temp.next.next;
            temp.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            temp = n1;
        }

        return result.next;
    }


}
