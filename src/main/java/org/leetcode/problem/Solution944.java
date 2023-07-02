package org.leetcode.problem;

/**
 * Delete Columns to Make Sorted
 */
public class Solution944 {
    public int minDeletionSize(String[] strs) {
        int total = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            final boolean isSorted = isSorted(strs, i);
            if (!isSorted) {
                total++;
            }
        }
        return total;
    }

    private boolean isSorted(final String[] strs, final int index) {
        for (int i = 1; i < strs.length; i++) {
            final char prev = strs[i-1].charAt(index);
            final char cur = strs[i].charAt(index);
            if (cur < prev) {
                return false;
            }
        }
        return true;
    }
}
