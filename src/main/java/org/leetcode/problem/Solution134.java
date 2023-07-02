package org.leetcode.problem;

/**
 * Gas Station
 */
public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, start = 0, consecutiveSum = 0;
        for (int i = 0; i < gas.length; i++) {
            if (consecutiveSum >= 0) {
                consecutiveSum += gas[i] - cost[i];
            } else {
                consecutiveSum = gas[i] - cost[i];
                start = i;
            }
            total += gas[i] - cost[i];
        }
        if (total >= 0) {
            return start;
        }
        return -1;
    }
}
