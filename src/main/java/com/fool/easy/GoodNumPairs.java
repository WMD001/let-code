package com.fool.easy;

/**
 * @author Qiq
 * @date 2021/5/23
 */
public class GoodNumPairs {

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (i==i1 || i<i1) {
                    continue;
                }
                if (nums[i]==nums[i1]){
                    count ++;
                }
            }
        }
        return count;
    }

}
