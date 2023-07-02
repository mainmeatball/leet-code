package org.leetcode.problem;

/**
 * Merge Strings Alternately
 */
public class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        final StringBuilder sb = new StringBuilder();
        final int l = Math.max(word1.length(), word2.length());
        for (int i = 0; i < l; i++) {
            final Character ch1 = i < word1.length() ? word1.charAt(i) : null;
            final Character ch2 = i < word2.length() ? word2.charAt(i) : null;
            if (ch1 != null) {
                sb.append(ch1);
            }
            if (ch2 != null) {
                sb.append(ch2);
            }

        }
        return sb.toString();
    }
}
