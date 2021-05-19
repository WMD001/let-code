package com.fool.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 206. ��ת����
 * ��תһ��������
 * <p>
 * ʾ��:
 * <p>
 * ����: 1->2->3->4->5->NULL
 * ���: 5->4->3->2->1->NULL
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
     * ������ת����
     * @param node ������
     * @return int����
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
     * ����ת������
     * @param nums int����
     * @return ������
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

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
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



}
