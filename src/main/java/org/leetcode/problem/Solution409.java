package org.leetcode.problem;

/**
 * Longest Palindrome
 */
public class Solution409 {

    public int longestPalindrome(String s) {
        final int[] record = new int[256];

        for (int i = 0; i < s.length(); i++) {
            record[s.charAt(i)]++;
        }

        int plusOne = 0;
        int total = 0;
        for (final int chNum : record) {
            if (plusOne == 0 && chNum % 2 == 1) {
                plusOne = 1;
            }
            if (chNum % 2 == 1) {
                total += chNum - 1;
            } else {
                total += chNum;
            }
        }

        return total + plusOne;
    }
}
