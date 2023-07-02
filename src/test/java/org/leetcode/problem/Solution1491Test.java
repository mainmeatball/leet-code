package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1491Test {

    final Solution1491 solution = new Solution1491();

    @Test
    void average() {
        final int[] salary = new  int[]{3000,2000,3000,6000,2500,1500};

        final double result = solution.average(salary);

        System.out.println(result * 4);
    }
}