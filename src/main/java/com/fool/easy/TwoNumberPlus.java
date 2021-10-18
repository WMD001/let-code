package com.fool.easy;

/**
 * 2. 两数之和
 *
 * @author Qiq
 * @date 2021/10/18
 */
public class TwoNumberPlus {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode();
        ListNode temp = result;
        int fool = 0;

        while (l1 != null || l2 != null) {
            int sum = fool;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            fool = sum / 10;

        }

        if (fool>0) {
            temp.next = new ListNode(fool);
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(4))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        TwoNumberPlus twoNumberPlus = new TwoNumberPlus();
        ListNode listNode = twoNumberPlus.addTwoNumbers(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}

class ListNode {
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
