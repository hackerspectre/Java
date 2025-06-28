//Valid Parentheses ✅ 
//Given a strings containing just the characters '(', ')', '{', '}', '[', ']', determain if the input string is valid.
//An input string is valid if:
//1. Open brackets must be closed by the same type of brackets.
//2. Open brackets must be closed in the correct order.
//3. Every close bracket has a corresponding open brackets of the same type.
//Examples: "()", "[]", "{[]}" are valid, but "(]" and "([) are not.

import java.util.*;

public class JavaBasics {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    // Duplicate Parentheses ✅
    // Given a balanced expression, find if it contains duplicate parentheses or
    // not. A set of parentheses are duplicate if the same subexpression is
    // surrounded by multiple parentheses.
    // Examples: ((a)) has duplicate parentheses, but (a) does not.
    public static boolean hasDuplicateParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> temp = new Stack<>();
        boolean duplicate = false;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                temp.push(c);
            } else if (c == ')') {
                if (temp.size() > 1 && temp.peek() == '(') {
                    duplicate = true;
                    temp.pop();
                } else {
                    temp.pop();
                    stack.pop();
                }
            }
        }

        return duplicate;
    }

    // Max Area in Histogram ✅
    // Given an array of integers heights representing the histogram's bar height
    // where the width of each bar is 1, return the area of the largest rectangle in
    // the histogram.
    public static int maxArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0, i = 0;

        while (i < heights.length) {
            if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, heights[top] * width);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, heights[top] * width);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        /*
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([)]")); // false
        
        String str = "({})[]";
        System.out.println(isValid(str)); // true
        */

        // Duplicate Parentheses ✅
        /*
        String str1 = "((a+b))";
        System.out.println(hasDuplicateParentheses(str1));
        String str2 = "(a+b)";
        System.out.println(hasDuplicateParentheses(str2));
        */

        /*
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(heights));
        */
    }
}
