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


    public static Boolean check(String s) {
        /*
        判断字符串中的括号是否有效
            判断字符串是否为null或者空字符串，是则判定无效 return false
            遍历字符串
                如果得到的是左括号，则入栈
                如果是右括号，栈顶出栈，判断是否是对应的右括号，如果不是，则字符串括号无效 return false
             如果遍历完成，没有中途退出，说明字符串括号正确 return true
         */

        if (s == null || "".equals(s) || s.length() % 2 != 0 ) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.empty() || c!=stack.pop()) {
                return false;
            }
        }
        return stack.empty();
    }

}
