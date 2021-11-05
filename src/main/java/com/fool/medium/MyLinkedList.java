package com.fool.medium;

/**
 * 设计一个链表
 *
 * @author Qiq
 * @date 2021/11/4
 */
public class MyLinkedList {

    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index > size || index < 0) {
            return -1;
        }
        ListNode curr = head;
        for (int i = 0; i < index + 1; i++) {
            curr = curr.next;
        }
        return curr == null ? -1 : curr.val;
    }

    public void addAtHead(int val) {
        ListNode curr = new ListNode(val);
        curr.next = head.next;
        head.next = curr;
        size++;
    }

    public void addAtTail(int val) {
        ListNode curr = head;
        for (int i = 0; i < size; i++) {
            curr = curr.next;
        }
        curr.next = new ListNode(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index <= 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else if (index > size) {
        } else {
            ListNode pred = head;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }
            ListNode newNode = new ListNode(val);
            newNode.next = pred.next;
            pred.next = newNode;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
        size--;
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);
        linkedList.get(1);
        linkedList.deleteAtIndex(1);
        linkedList.get(1);
        linkedList.get(3);
        linkedList.deleteAtIndex(3);
        linkedList.deleteAtIndex(0);
        linkedList.get(0);
        linkedList.deleteAtIndex(0);
        linkedList.get(0);
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
