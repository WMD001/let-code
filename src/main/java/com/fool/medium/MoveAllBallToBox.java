package com.fool.medium;

import java.util.Arrays;

/**
 * 1769 移动所有球到每个盒子所需的最小操作数
 * 使用二次循环解决，还可动态规划，但是不会 TODO
 *
 * @author Wang
 * @date 2022/12/2
 */
public class MoveAllBallToBox {

    public static int[] minOperations(String boxes) {
        int length = boxes.length();
        int[] res = new int[length];
        for (int i = 0; i< length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    char c = boxes.charAt(j);
                    if (c == '1') {
                        count+=Math.abs(i - j);
                    }
                }
            }
            res[i] = count;
        }
        return res;
    }

    public static void test(String boxes) {
        int[] ints = minOperations(boxes);
        System.out.println("input: " + boxes + " , output: " + Arrays.toString(ints));
    }

    public static void main(String[] args) {
        test("110");
        test("001011");
    }

}
