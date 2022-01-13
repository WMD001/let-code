package com.fool;

import com.fool.easy.TwoNumberSum;
import org.junit.Assert;
import org.junit.Test;

public class TwoNumberSumTest {


    @Test
    public void test1 () {
        Assert.assertArrayEquals(TwoNumberSum.twoSum(new int[]{1,2,4}, 6), new int[]{1,2});
    }

}
