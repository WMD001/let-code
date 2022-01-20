package com.fool.medium;
//92.反转链表 II
//给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链
//表节点，返回 反转后的链表 。
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4,5], left = 2, right = 4
//输出：[1,4,3,2,5]
//
//
// 示例 2：
//
//
//输入：head = [5], left = 1, right = 1
//输出：[5]
//
//
//
//
// 提示：
//
//
// 链表中节点数目为 n
// 1 <= n <= 500
// -500 <= Node.val <= 500
// 1 <= left <= right <= n
//
//
//
//
// 进阶： 你可以使用一趟扫描完成反转吗？
// Related Topics 链表
// 👍 1133 👎 0

import com.fool.common.ListNode;

/**
 * @author Qiq
 * @date 2022/1/20
 */
public class ReverseBetweenII {

    /**
     * 遍历链表，等走到left节点时，从left节点倒着填入新链表中，到right时结束，right后的节点添加到新链表上
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right) {
            return head;
        }

        ListNode cur = head;
        ListNode leftNode = new ListNode(0);
        ListNode tempLeft = leftNode;
        ListNode newNode = new ListNode(0);
        ListNode tempNew = newNode;

        int len = 1;
        while (cur != null) {

            ListNode next1 = new ListNode(cur.val);
            if (len < left) {
                tempLeft.next = next1;
                tempLeft = tempLeft.next;
            } else if (len < right) {
                next1.next = tempNew.next;
                tempNew.next = next1;
            } else if (len == right) {
                next1.next = tempNew.next;
                tempNew.next = next1;

                tempLeft.next = newNode.next;
                ListNode temp = leftNode;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = cur.next;
                break;
            }

            cur = cur.next;
            len++;
        }

        return leftNode.next;
    }

}
