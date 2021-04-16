package com.fool.easy;

import java.util.Arrays;

/**
 * 1. ����֮��
 * ����һ���������� nums ��һ������Ŀ��ֵ target�������ڸ��������ҳ� ��ΪĿ��ֵ ���� ���� ���������������ǵ������±ꡣ
 *
 * ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ�������ͬһ��Ԫ���ڴ��ﲻ���ظ����֡�
 *
 * ����԰�����˳�򷵻ش𰸡�
 *
 *
 *
 * ʾ�� 1��
 *
 * ���룺nums = [2,7,11,15], target = 9
 * �����[0,1]
 * ���ͣ���Ϊ nums[0] + nums[1] == 9 ������ [0, 1] ��
 * ʾ�� 2��
 *
 * ���룺nums = [3,2,4], target = 6
 * �����[1,2]
 * ʾ�� 3��
 *
 * ���룺nums = [3,3], target = 6
 * �����[0,1]
 *
 *
 * ��ʾ��
 *
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * ֻ�����һ����Ч��
 *
 * @author walle
 * @date 2021/4/16 17:18
 **/
public class TwoNumberSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4, 5}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[]{0, 1};
        }

        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int v = target-nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (i==j) {
                    continue;
                }
                if (v == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return res;
    }

}
