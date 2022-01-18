package com.fool.medium;
//存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
//
// 返回同样按升序排列的结果链表。
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,3,4,4,5]
//输出：[1,2,5]
//
//
// 示例 2：
//
//
//输入：head = [1,1,1,2,3]
//输出：[2,3]
//
//
//
//
// 提示：
//
//
// 链表中节点数目在范围 [0, 300] 内
// -100 <= Node.val <= 100
// 题目数据保证链表已经按升序排列
//
// Related Topics 链表 双指针
// 👍 779 👎 0

import com.fool.common.ListNode;


/**
 * @author Qiq
 * @date 2022/1/18
 */
public class RemoveRepeatNode {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode result = new ListNode(0);
        result.next = head;
        ListNode temp = result;
        while (temp.next != null && temp.next.next != null) {
            if (temp.next.val == temp.next.next.val) {
                int x = temp.next.val;
                while (temp.next != null && temp.next.val == x) {
                    temp.next = temp.next.next;
                }
            } else {
                temp = temp.next;
            }
        }
        return result.next;
    }

    public ListNode deleteDuplicates1(ListNode head) {

        return null;
    }

}
