package org.leetcode.problem;

import java.util.Stack;


/**
 * Daily Temperatures
 */
public class Solution739 {

    public int[] dailyTemperatures(int[] temperatures) {
        final int[] result = new int[temperatures.length];
        final Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }

            final int topElementPeeked = stack.peek();
            if (temperatures[topElementPeeked] < temperatures[i]) {
                while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                    final int topElem = stack.pop();
                    result[topElem] = i - topElem;
                }
                stack.push(i);
            } else {
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            final int maxVal = stack.pop();
            result[maxVal] = 0;
        }

        return result;
    }
}
