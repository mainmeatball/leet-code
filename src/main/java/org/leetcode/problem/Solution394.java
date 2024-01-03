package org.leetcode.problem;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;


/**
 * Decode String
 */
public class Solution394 {
    public String decodeString(String s) {
        final char[] charArr = s.toCharArray();
        final Deque<String> deque = new LinkedList<>();
        final StringBuilder result = new StringBuilder();
        for (final char c : charArr) {
            if (c != ']') {
                deque.push(String.valueOf(c));
                continue;
            }
            // if c == ']', pop everything before last '['
            final Stack<String> wordInsideBrackets = new Stack<>();
            String pop = deque.pop();
            while (!"[".equals(pop)) {
                 wordInsideBrackets.push(pop);
                 pop = deque.pop();
            }

            // then pop a number
            final Stack<String> number = new Stack<>();
            pop = deque.pop();
            while (Character.isDigit(pop.charAt(0))) {
                number.push(pop);
                if (!deque.isEmpty()) {
                    pop = deque.pop();
                } else {
                    break;
                }
            }
            if (!Character.isDigit(pop.charAt(0))) {
                deque.push(pop);
            }

            // make number from stack chars
            int repeat = 0;
            while (!number.isEmpty()) {
                repeat *= 10;
                repeat += number.pop().charAt(0) - '0';
            }

            // put everything back to stack
            final StringBuilder word = new StringBuilder();
            while (!wordInsideBrackets.isEmpty()) {
                word.append(wordInsideBrackets.pop());
            }
            final String repeatedWord = word.toString().repeat(Math.max(0, repeat));
            deque.push(repeatedWord);
        }

        while (!deque.isEmpty()) {
            result.append(deque.pollLast());
        }
        return result.toString();
    }
}
