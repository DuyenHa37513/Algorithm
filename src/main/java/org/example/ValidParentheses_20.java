package org.example;

import java.util.Stack;

public class ValidParentheses_20 {
    public static boolean isValid(String s) {
        Stack<Character> leftSymboys = new Stack<>();
//        s = "()[]{}"
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                leftSymboys.push(c);
            } else if (c == '}' && !leftSymboys.isEmpty() && leftSymboys.peek() == '{') {
                leftSymboys.pop();
            } else if (c == ']' && !leftSymboys.isEmpty() && leftSymboys.peek() == '[') {
                leftSymboys.pop();
            } else if (c == ')' && !leftSymboys.isEmpty() && leftSymboys.peek() == '(') {
                leftSymboys.pop();
            } else {
                return false;
            }
        }
        return leftSymboys.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{}()"));

    }
}
