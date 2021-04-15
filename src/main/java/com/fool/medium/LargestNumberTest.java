package com.fool.medium;

import java.util.*;

/**
 * 力扣 179 最大数 难度：中等
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 * 示例 1：
 *
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 *
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 * 示例 3：
 *
 * 输入：nums = [1]
 * 输出："1"
 * 示例 4：
 *
 * 输入：nums = [10]
 * 输出："10"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author walle
 * @date 2021/4/12 16:34
 **/
public class LargestNumberTest {

    public static void main(String[] args) {
        int[] nums1 = {10,2};
        int[] nums2 = {3,30,34,5,9};
        int[] nums3 = {1};
        int[] nums4 = {10};
        System.out.println(largestNumber(nums1));
    }

    public static String largestNumber(int[] nums) {
        Map<Integer, String> map = new HashMap<>();
        for (int num : nums) {
            Integer key = Integer.valueOf(String.valueOf(num).split("")[0]);
            map.put(key, String.valueOf(num));
        }

        return "";
    }

}
