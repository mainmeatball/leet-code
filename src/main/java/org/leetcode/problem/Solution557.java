package org.leetcode.problem;

/**
 * Reverse Words in a String III
 */
public class Solution557 {
    public String reverseWords(String s) {
        final String[] words = s.split(" ");
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(reverse(words[i]));
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private String reverse(final String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
