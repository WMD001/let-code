package com.fool.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 括号有效性问题
 * 字符串只包括这些字符 () {} []
 * 判断字符串是否有效
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
        判断字符串中的括号是否有效
            判断字符串是否为null或者空字符串，是则判定无效 return false
            遍历字符串
                如果得到的是左括号，则入栈
                如果是右括号，栈顶出栈，判断是否是对应的右括号，如果不是，则字符串括号无效 return false
             如果遍历完成，没有中途退出，说明字符串括号正确 return true
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
