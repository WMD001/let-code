package com.fool.easy;

/**
 * 461. ��������
 * ��������֮��ĺ�������ָ�������������ֶ�Ӧ������λ��ͬ��λ�õ���Ŀ��
 *
 * ������������ x �� y����������֮��ĺ������롣
 *
 * @author Qiq
 * @date 2021/5/27
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        /*
         * & and ������ ������λ ��Ϊ1ʱΪ1
         * | or  ������ ������λ ��һ��Ϊ1ʱΪ1
         * ^ xor �������  ������λ ��һ��ʱ��Ϊ1
         *
         *
         * Integer.bitCount(x) ����������а���1�ĸ���
         */
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {

        System.out.println(hammingDistance(1, 4) == 2);
    }

}
