package org.leetcode.problem;

import java.util.Arrays;


/**
 * Minimum Rounds to Complete All Tasks
 */
public class Solution2244 {

    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int occurrences = 0;
        int prev = tasks[0];
        int minRounds = 0;
        for (final int task : tasks) {
            if (prev != task) {
                prev = task;
                final int rounds = getMinRounds(occurrences);
                if (rounds == -1) {
                    return -1;
                }
                minRounds += rounds;
                occurrences = 1;
            } else {
                occurrences++;
            }
        }
        final int rounds = getMinRounds(occurrences);
        if (rounds == -1) {
            return -1;
        }
        return minRounds + rounds;
    }

    private int getMinRounds(int occurrences) {
        if (occurrences == 1) {
            return -1;
        }
        if (occurrences % 3 == 0) {
            return occurrences / 3;
        }
        occurrences -= 2;
        if (occurrences % 3 == 0) {
            return (occurrences / 3) + 1;
        }
        occurrences -= 2;
        if (occurrences % 3 == 0) {
            return (occurrences / 3) + 2;
        }
        return -1;
    }
}
