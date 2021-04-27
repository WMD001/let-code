package com.fool.easy;

/**
 * 1822. ����Ԫ�ػ��ķ���
 * ��֪���� signFunc(x) ������� x �����������ض�ֵ��
 *
 * ��� x ������������ 1 ��
 * ��� x �Ǹ��������� -1 ��
 * ��� x �ǵ��� 0 ������ 0 ��
 * ����һ���������� nums ���� product Ϊ���� nums ������Ԫ��ֵ�ĳ˻���
 *
 * ���� signFunc(product) ��
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
        ��Ŀ������������Ԫ��ֵ�ĳ˻������������Բ�����˻���ֱ�Ӹ��ݷ����ж�����
        ��ֻ��Ҫ�ж�����������ж��ٸ����ţ����� n�����ţ����� n%2 == 0 �˻�Ϊ������֮Ϊ��
        ���Ԫ���а���0��ֱ�ӷ���0
         */
        // ��������
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
