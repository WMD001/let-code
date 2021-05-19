package com.fool.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * ������Ч������
 * �ַ���ֻ������Щ�ַ� () {} []
 * �ж��ַ����Ƿ���Ч
 *
 * @author walle
 * @date 2021/4/12 18:03
 **/
public class BracketsValid {


    public static void main(String[] args) {
        System.out.println(check("{}{}()"));
        System.out.println(check("{{}()}"));
        System.out.println(check("{)"));
    }


    public static Boolean check(String str) {
        /*
        �ж��ַ����е������Ƿ���Ч
            �ж��ַ����Ƿ�Ϊnull���߿��ַ����������ж���Ч return false
            �����ַ���
                ����õ����������ţ�����ջ
                ����������ţ�ջ����ջ���ж��Ƿ��Ƕ�Ӧ�������ţ�������ǣ����ַ���������Ч return false
             ���������ɣ�û����;�˳���˵���ַ���������ȷ return true
         */

        if (str == null || "".equals(str)) {
            return false;
        }
        Map<String, String> map = new HashMap<>(1<<2);
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");

        Stack<String> stack = new Stack<>();
        String[] items = str.split("");
        for (String item : items) {
            if (map.containsKey(item)) {
                if (stack.empty()) {
                    return false;
                }
                String v = map.get(item);
                if (!v.equals(stack.pop())) {
                    return false;
                }
            }
            if (map.containsValue(item)) {
                stack.push(item);
            }
        }
        return true;
    }

}
