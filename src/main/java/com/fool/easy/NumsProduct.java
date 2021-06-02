package com.fool.easy;

/**
 * 1822. 数组元素积的符号
 * 已知函数 signFunc(x) 将会根据 x 的正负返回特定值：
 *
 * 如果 x 是正数，返回 1 。
 * 如果 x 是负数，返回 -1 。
 * 如果 x 是等于 0 ，返回 0 。
 * 给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积。
 *
 * 返回 signFunc(product) 。
 *
 * @author Qiq
 * @date 2021/4/21
 */
public class NumsProduct {

    public static void main(String[] args) {
        System.out.println(signFunc(arraySign(new int[]{1,2,3,-1})));

    }

    public static int arraySign(int[] nums) {
        /*
        题目是数组中所有元素值的乘积的正负，可以不计算乘积，直接根据符号判断正负
        则只需要判断相乘数字中有多少个负号，如有 n个负号，则有 n%2 == 0 乘积为正，反之为负
        如果元素中包含0则直接返回0
         */
        // 负数个数
        int negative = 0;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                negative++;
            }
        }
        return negative%2 > 0 ? -1 : 1;
    }

    public static int signFunc(int x) {
        return Integer.compare(x, 0);
    }

}
