package com.fool.easy;

import java.util.Arrays;

/**
 * 1470 重新排列数组
 *
 * 给你一个数组nums，数组中有2n个元素，按[x1,x2,...xn,y1,y2...yn]的格式排列
 * 请你将数组按[x1,y1,x2,y2,...xn,yn]格式重新排列，返回重排后的数组
 *
 * @author Qiq
 * @date 2021/6/2
 */
public class ResortArray {


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(nums, nums.length/2)));
    }


//    public static int[] shuffle(int[] nums, int n) {
//        int[] result = new int[nums.length];
//
//        for (int i = 0; i < n; i++) {
//            if (i%2==1){
//                result[i] = nums[n/2+i/2];
//            } else {
//                result[i] = nums[i/2];
//            }
//        }
//        return result;
//    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0) {
                result[i] = nums[i/2];
            } else {
                result[i] = nums[n++];
            }
        }
        return result;
    }
}
