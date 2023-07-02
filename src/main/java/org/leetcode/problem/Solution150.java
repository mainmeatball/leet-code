package org.leetcode.problem;

import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;


/**
 * Evaluate Reverse Polish Notation
 */
public class Solution150 {

    final Map<String, BiFunction<Integer, Integer, Integer>> opMap = Map.of(
            "*", (op1, op2) -> op1 * op2,
            "/", (op1, op2) -> op2 / op1,
            "+", (op1, op2) -> op1 + op2,
            "-", (op1, op2) -> op2 - op1
    );

    public int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }

        final Stack<Integer> stack = new Stack<>();
        String s;
        for (int i = 0; i < tokens.length; i++) {
            while (!isOperation(tokens[i])) {
                s = tokens[i++];
                stack.push(Integer.parseInt(s));
            }
            final String operationString = tokens[i];
            final BiFunction<Integer, Integer, Integer> op = opMap.get(operationString);
            final Integer op1 = stack.pop();
            final Integer op2 = stack.pop();
            stack.push(op.apply(op1, op2));
        }

        return stack.pop();
    }

    private boolean isOperation(final String s) {
        if (s.length() > 1) {
            return false;
        }
        final char c = s.charAt(0);
        return c == '*' || c == '+' || c == '-' || c == '/';
    }
}
