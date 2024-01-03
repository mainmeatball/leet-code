package org.leetcode.problem;

import java.util.Deque;
import java.util.LinkedList;


/**
 * Removing Stars From a String
 */
public class Solution2390 {

    public String removeStars(String s) {
        final Deque<Character> deque = new LinkedList<>();
        for (final char c : s.toCharArray()) {
            if (c != '*') {
                deque.push(c);
            } else {
                deque.pop();
            }
        }
        final StringBuilder stringBuilder = new StringBuilder();
        while (!deque.isEmpty()) {
            stringBuilder.append(deque.pop());
        }
        return stringBuilder.toString();
    }
}
