package com.fool;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

/**
 * @author Qiq
 * @date 2022/1/24
 */
public class TestAboutStack {

    private String s;

    @Before
    public void before() {
        s = "abBAcC";
    }

    @Test
    public void makeGood() {
        String s = makeG(this.s);
        System.out.println(s);
    }

    public String makeG(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int charIndex = -1;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (stringBuilder.length() > 0 && Character.toLowerCase(c) == Character.toLowerCase(stringBuilder.charAt(charIndex)) && c != stringBuilder.charAt(charIndex)) {
                stringBuilder.deleteCharAt(charIndex);
                charIndex--;
            } else {
                stringBuilder.append(c);
                charIndex++;
            }
        }
        return stringBuilder.toString();
    }

    public String makeGood(String s) {

        if (s == null || "".equals(s) || s.length() < 1) {
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i, i + 1);
            if (!stack.isEmpty()) {
                String pop = stack.pop();
                if (!substring.equalsIgnoreCase(pop) || substring.equals(pop)) {
                    // 两者不同
                    stringBuilder.append(pop);
                    stack.push(substring);
                }
            } else {
                stack.push(substring);
            }
        }
        if (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        if (stringBuilder.length() == s.length()) {
            return s;
        }
        return makeGood(stringBuilder.toString());
    }

}
