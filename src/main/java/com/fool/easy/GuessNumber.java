package com.fool.easy;

/**
 * LCP 01. ������
 * СA �� СB ��������֡�СB ÿ�δ� 1, 2, 3 �����ѡ��һ����СA ÿ��Ҳ�� 1, 2, 3 ��ѡ��һ���¡�����һ���������������Ϸ���뷵�� СA �¶��˼��Σ�
 *
 * �����guess����Ϊ СA ÿ�εĲ²⣬answer����Ϊ СB ÿ�ε�ѡ��guess��answer�ĳ��ȶ�����3��
 *
 *
 *
 * ��Դ�����ۣ�LeetCode��
 * ���ӣ�https://leetcode-cn.com/problems/guess-numbers
 * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 * @author Qiq
 * @date 2021/5/23
 */
public class GuessNumber {

    public int game(int[] guess, int[] answer) {
        int count = 0;
        for(int i=0; i<guess.length; i++) {
            if (guess[i]==answer[i]) {
                count++;
            }
        }
        return count;
    }

}
