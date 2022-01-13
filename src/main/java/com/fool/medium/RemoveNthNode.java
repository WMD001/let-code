package com.fool.medium;

import com.fool.common.ListNode;

/**
 * @author Qiq
 * @date 2022/1/13
 */
public class RemoveNthNode {
//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
//
//
// 示例 2：
//
//
//输入：head = [1], n = 1
//输出：[]
//
//
// 示例 3：
//
//
//输入：head = [1,2], n = 1
//输出：[1]
//
//
//
//
// 提示：
//
//
// 链表中结点的数目为 sz
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
//
//
//
//
// 进阶：你能尝试使用一趟扫描实现吗？
// Related Topics 链表 双指针
// 👍 1750 👎 0


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    /**
     * 解法一：
     *       两次遍历，第一次遍历出链表的长度len,len-n得到正向的节点位置
     *                第二次遍历到正向的节点位置，删除节点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        if (len == n) {
            return head.next;
        }

        int m = len - n;
        ListNode res = new ListNode(head.val);
        ListNode tempRes = res;
        for (int i = 0; i < m - 1; i++) {
            head = head.next;
            assert head != null;
            tempRes.next = new ListNode(head.val);
            tempRes = tempRes.next;
        }
        assert head.next != null;
        tempRes.next = head.next.next;
        return res;
    }

    /**
     * 解法二：
     *       双指针解法：first指针先走n步，之后first和later指针一起走，
     *       因为first和laster的距离是n，当first走到尾部时，later停留在倒数n个节点上
     *       因为要删除倒数第n个节点，所以需要later停留在倒数n-1个节点，即循环条件是first.next!=null
     */
    public ListNode removeNthFromEndByOne(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode first = pre;
        ListNode later = pre;

        while (n > 0) {
            first = first.next;
            n--;
        }
        while (first.next!=null) {
           first = first.next;
           later = later.next;
        }
        later.next = later.next.next;
        return pre.next;
    }


}
