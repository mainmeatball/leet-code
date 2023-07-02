package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1376Test {

    final Solution1376 solution = new Solution1376();

    @Test
    void numOfMinutes() {
        final int[] manager = new int[] {-1};
        final int[] informTime = new int[] {0};

        final int res = solution.numOfMinutes(1, 0, manager, informTime);

        assertEquals(0, res);
    }

    @Test
    void numOfMinutes2() {
        final int[] manager = new int[] {2,2,-1,2,2,2};
        final int[] informTime = new int[] {0,0,1,0,0,0};

        final int res = solution.numOfMinutes(6, 2, manager, informTime);

        assertEquals(1, res);
    }

    @Test
    void numOfMinutes3() {
        final int[] manager = new int[] {5,9,6,10,-1,8,9,1,9,3,4};
        final int[] informTime = new int[] {0,213,0,253,686,170,975,0,261,309,337};

        final int res = solution.numOfMinutes(11, 4, manager, informTime);

        assertEquals(2560, res);
    }

    @Test
    void numOfMinutes4() {
        final int[] manager = new int[] {13,4,11,-1,3,4,2,8,9,5,2,13,0,4,9};
        final int[] informTime = new int[] {405,0,57,541,990,134,0,0,8,199,0,178,0,689,0};

        final int res = solution.numOfMinutes(15, 3, manager, informTime);

        assertEquals(2625, res);
    }
}