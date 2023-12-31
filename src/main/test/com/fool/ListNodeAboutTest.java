package com.fool;

import com.fool.common.ListNode;
import com.fool.easy.ReverseList;
import com.fool.medium.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

public class ListNodeAboutTest {

    ListNode head;

    int[] ex1 = new int[]{1, 2, 3, 4, 5};
    int[] ex2 = new int[]{0, 1, 2};
    int[] ex3 = new int[]{6, 5, 4, 3, 2, 1};
    ListNode exNode1 = ReverseList.initList(ex1);
    ListNode exNode2 = ReverseList.initList(ex2);
    ListNode exNode3 = ReverseList.initList(ex3);
    static RotateRight rotateRight;
    static RemoveNthNode removeNthNode;

    @BeforeClass
    public static void beforeClass() {
        rotateRight = new RotateRight();
        removeNthNode = new RemoveNthNode();
    }

    @Before
    public void initHead() {
        head = ReverseList.initList(new int[]{1, 2, 3, 4, 5});
    }

    @Test
    public void rotateRightTest1() {
        ListNode resNode = rotateRight.rotateRight(ReverseList.initList(ex1), 2);
        Assert.assertArrayEquals(ReverseList.initArray(resNode), new int[]{4, 5, 1, 2, 3});
    }

    @Test
    public void rotateRightTest2() {
        ListNode resNode = rotateRight.rotateRight(ReverseList.initList(ex2), 4);
        Assert.assertArrayEquals(ReverseList.initArray(resNode), new int[]{2, 0, 1});
    }

    @Test
    public void rotateRightTest3() {
        ListNode resNode = rotateRight.rotateRight(ReverseList.initList(ex3), 2);
        Assert.assertArrayEquals(ReverseList.initArray(resNode), new int[]{2, 1, 6, 5, 4, 3});
    }

    @Test
    public void removeNthFromEnd() {
//        ListNode resNode = removeNthNode.removeNthFromEnd(exNode1, 2);
        ListNode resNode = removeNthNode.removeNthFromEndByOne(exNode1, 2);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 5}, ReverseList.initArray(resNode));
    }

    @Test
    public void swapParis() {
        SwapPairs swapPairs = new SwapPairs();
        System.out.println(Arrays.toString(ex3));
        ListNode listNode = swapPairs.swapPairs(exNode3);
        System.out.println(Arrays.toString(ReverseList.initArray(listNode)));
    }

    @Test
    public void removeRepeatNode() {
        RemoveRepeatNode removeRepeatNode = new RemoveRepeatNode();
        int[] ex4 = {1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 8};
        System.out.println(Arrays.toString(ex4));
        ListNode listNode = removeRepeatNode.deleteDuplicates(ReverseList.initList(ex4));
        System.out.println(Arrays.toString(ReverseList.initArray(listNode)));

    }

    @Test
    public void partition() {
        PartitionList partitionList = new PartitionList();
        int[] ex = {1,4,3,2,5,5};
        System.out.println(Arrays.toString(ex));
        ListNode partition = partitionList.partition(ReverseList.initList(ex), 3);
        System.out.println(Arrays.toString(ReverseList.initArray(partition)));
    }

    @Test
    public void reverseBetween() {
        ReverseBetweenII reverseBetweenII = new ReverseBetweenII();
        ListNode listNode = reverseBetweenII.reverseBetween(ReverseList.initList(new int[]{3,5}), 1, 2);
        System.out.println(Arrays.toString(ReverseList.initArray(listNode)));
    }

}

