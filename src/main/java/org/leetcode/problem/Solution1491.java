package org.leetcode.problem;

/**
 * Average Salary Excluding the Minimum and Maximum
 */
public class Solution1491 {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int total = 0;
        for (final int i : salary) {
            if (i < min) min = i;
            if (i > max) max = i;
            total += i;
        }
        total = total - min - max;
        return (double)total / (double)(salary.length - 2);
    }
}
