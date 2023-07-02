package org.leetcode.weekly;

import java.util.Stack;


public class RemoveAllAdjacentDuplicatesInString2 {
    public String removeDuplicates(String s, final int k) {
        final Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(new int[]{s.charAt(i), 1});
                continue;
            }
            final int[] top = stack.peek();
            if (top[0] == s.charAt(i)) {
                if (++top[1] == k) {
                    stack.pop();
                }
            } else {
                stack.push(new int[]{s.charAt(i), 1});
            }
        }
        final StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            final int[] top = stack.pop();
            sb.append(String.valueOf((char) top[0]).repeat(Math.max(0, top[1])));
        }
        return sb.reverse().toString();
    }
}
