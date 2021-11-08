package com.fool;

import com.fool.common.ListNode;
import com.fool.easy.ReverseList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReversePrintTest {

    ListNode head;

    @Before
    public void initHead() {
        head = ReverseList.initList(new int[]{1,3,2});
    }

    @Test
    public void reversePrintTest() {
        int[] ints = ReverseList.reversePrint(head);
        Assert.assertArrayEquals(ints, new int[]{2,3,1});
    }

}
