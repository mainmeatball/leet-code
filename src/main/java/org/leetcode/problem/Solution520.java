package org.leetcode.problem;

/**
 * Detect Capital
 */
public class Solution520 {
    public boolean detectCapitalUse(String word) {
        boolean wasLowercase = false;
        int totalCapital = 0;
        for (int i = 0; i < word.length(); i++) {
            final char ch = word.charAt(i);
            if (isCapitalCase(ch)) {
                totalCapital++;
            }
            if (!wasLowercase && isLowerCase(ch)) {
                wasLowercase = true;
                continue;
            }
            if (wasLowercase && isCapitalCase(ch)) {
                return false;
            }
        }
        return !wasLowercase || totalCapital <= 1;
    }

    private boolean isLowerCase(final char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    private boolean isCapitalCase(final char ch) {
        return ch >= 'A' && ch <= 'Z';
    }
}
