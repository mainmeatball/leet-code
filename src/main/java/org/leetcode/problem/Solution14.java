package org.leetcode.problem;

/**
 * Longest Common Prefix
 */
public class Solution14 {

    public String longestCommonPrefix(final String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String longestPrefix = strs[0];
        for (var str : strs) {
            final String commonPrefix = getCommonPrefix(str, longestPrefix);
            if (commonPrefix.length() < longestPrefix.length()) {
                longestPrefix = commonPrefix;
            }
            if (longestPrefix.isEmpty()) {
                return longestPrefix;
            }
        }
        return longestPrefix;
    }

    private String getCommonPrefix(final String first, final String second) {
        final StringBuilder sb = new StringBuilder();
        final int minLength = Math.min(first.length(), second.length());
        for (int i = 0; i < minLength; i++) {
            if (first.charAt(i) == second.charAt(i)) {
                sb.append(first.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
