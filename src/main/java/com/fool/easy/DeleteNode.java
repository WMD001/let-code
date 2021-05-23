package com.fool.easy;

/**
 * 237. ɾ�������еĽڵ�
 * ���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㡣���뺯����Ψһ����Ϊ Ҫ��ɾ���Ľڵ� ��
 * ��ʾ��
 *
 * �������ٰ��������ڵ㡣
 * ���������нڵ��ֵ����Ψһ�ġ�
 * �����Ľڵ�Ϊ��ĩβ�ڵ㲢��һ���������е�һ����Ч�ڵ㡣
 * ��Ҫ����ĺ����з����κν����
 *
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/delete-node-in-a-linked-list
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 *
 * @author Qiq
 * @date 2021/5/23
 */
public class DeleteNode {

    /**
     * �޷�ֱ���õ�ɾ���ڵ��ǰһ���ڵ㣬���Կ��ǽ���Ҫɾ���Ľڵ��ֵ�滻Ϊ������ڵ��е�ֵ
     *
     * @param node node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
