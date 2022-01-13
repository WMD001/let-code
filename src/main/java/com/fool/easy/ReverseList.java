package com.fool.easy;

import com.fool.common.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 206. 反转链表
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * @author walle
 * @date 2021/4/23 17:41
 **/
public class ReverseList {

    public static void main(String[] args) {

        ListNode node = initList(new int[]{1,2,3,4,5});
        ListNode reverseNode = reverseList(node);
        int[] nums = initArray(reverseNode);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 单链表转数组
     * @param node 单链表
     * @return int数组
     */
    public static int[] initArray(ListNode node) {
        List<Integer> numsArray = new ArrayList<>();
        while (node != null) {
            numsArray.add(node.val);
            node = node.next;
        }
        int[] nums = new int[numsArray.size()];
        for (int i = 0; i < numsArray.size(); i++) {
            nums[i] = numsArray.get(i);
        }

        return nums;
    }

    /**
     * 数组转单链表
     * @param nums int数组
     * @return 单链表
     */
    public static ListNode initList(int[] nums) {

        ListNode head = new ListNode(nums[0]);
        ListNode node = head;

        for (int i = 1; i < nums.length; i++) {
            node.next = new ListNode(nums[i]);
            node = node.next;
        }
        return head;
    }


    public static ListNode reverseList(ListNode node) {

        ListNode head = null;
        ListNode cur = node;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = head;
            head = cur;
            cur = next;
        }

        return head;
    }

    public static int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int size = stack.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = stack.pop();
        }
        return res;
    }


}
