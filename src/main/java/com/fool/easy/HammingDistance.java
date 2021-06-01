package com.fool.easy;

/**
 * 461. 汉明距离
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 *
 * @author Qiq
 * @date 2021/5/27
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        /*
         * & and 与运算 二进制位 都为1时为1
         * | or  或运算 二进制位 有一个为1时为1
         * ^ xor 异或运算  二进制位 不一样时候为1
         *
         *
         * Integer.bitCount(x) 计算二进制中包含1的个数
         */
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {

        System.out.println(hammingDistance(1, 4) == 2);
    }

}
