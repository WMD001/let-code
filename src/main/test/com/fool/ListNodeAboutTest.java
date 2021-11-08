package com.fool;

import com.fool.common.ListNode;
import com.fool.easy.ReverseList;
import com.fool.medium.RotateRight;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ListNodeAboutTest {

    ListNode head;

    int[] ex1 = new int[]{1, 2, 3, 4, 5};
    int[] ex2 = new int[]{0, 1, 2};
    int[] ex3 = new int[]{6, 5, 4, 3, 2, 1};
    static RotateRight rotateRight;

    @BeforeClass
    public static void beforeClass() {
        rotateRight = new RotateRight();
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


}

