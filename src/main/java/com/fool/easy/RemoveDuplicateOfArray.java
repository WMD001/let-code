package com.fool.easy;

import java.util.Arrays;

/**
 * @author Qiq
 */
public class RemoveDuplicateOfArray {

//    26. 删除有序数组中的重复项
//      给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
//      不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。


    public static void main(String[] args) {
        print(new int[]{1,1,2});
        print(new int[]{1,2,2});
        print(new int[]{1,2,3});
    }


    /**
     * 对有序数组中的重复进行原地删除
     * 因为是有序数组可以采用相邻两个元素比较的方法，如果相同，则是重复元素
     *
     * @param nums int 数组
     * @return int
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length ==0 || nums.length == 1) {
            return nums.length;
        }

        int key = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[key] = nums[i];
                key++;
            }
        }

        return key;
    }

    public static void print(int[] nums) {
        int i = removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, i)));;
    }

}
