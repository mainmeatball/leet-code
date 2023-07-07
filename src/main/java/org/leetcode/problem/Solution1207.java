package org.leetcode.problem;

/**
 * Unique Number of Occurrences
 */
public class Solution1207 {

    public boolean uniqueOccurrences(int[] arr) {
        final int[] numOfOccurrences = new int[2001];
        for (final int num : arr) {
            numOfOccurrences[num + 1000]++;
        }

        final boolean[] visitedNums = new boolean[2001];
        for (final int numOfOccurrence : numOfOccurrences) {
            if (numOfOccurrence == 0) continue;
            if (visitedNums[numOfOccurrence]) return false;
            visitedNums[numOfOccurrence] = true;
        }
        return true;
    }
}
