package com.fool.medium;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 链表的中间节点问题
 * 给定一个链表，返回中间节点，如果有两个中间节点，返回后一个
 *
 * @author walle
 * @date 2021/4/12 16:54
 **/
public class MediumNode {


    public static void main(String[] args) {
        // 使用快慢指针排序

    }

    public static ListNode middleNode(ListNode head) {
        /*
        快慢指针方法
        使用两个指针，快指针每次跨越两个节点，慢指针每次一个节点，则快指针走到末尾时，慢指针一定处于链表中间位置
        head 为链表头部节点
         */
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void getMediumNode(Integer[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        list = (LinkedList<Integer>) Arrays.asList(nums);

    }


    public static ListNode convertNode(Integer[] nums) {
        // 数组转链表

        return null;
    }

    static class ListNode {

        public Integer value;
        public ListNode next;

        public ListNode(Integer value) {
            this.value = value;
            this.next = null;
        }

        public Integer value() {
            return this.value;
        }

        public Boolean hasNext() {
            return this.next != null;
        }

        public ListNode next() {
            return this.next;
        }

    }

}
