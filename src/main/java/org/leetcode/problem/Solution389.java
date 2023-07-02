package org.leetcode.problem;

/**
 * Find the Difference
 */
public class Solution389 {
    public char findTheDifference(String s, String t) {
        char result = 0;
        final int n = Math.max(s.length(), t.length());
        for (int i = 0; i < n; i++) {
            if (i < s.length()) {
                result ^= s.charAt(i);
            }
            if (i < t.length()) {
                result ^= t.charAt(i);
            }
        }
        return result;
    }
}
