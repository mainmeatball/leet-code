package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution334Test {

    final Solution334 solution = new Solution334();

    @Test
    void increasingTriplet() {
        assertTrue(solution.increasingTriplet(new int[]{1,2,3,4,5}));
    }

    @Test
    void increasingTriplet2() {
        assertFalse(solution.increasingTriplet(new int[]{5,4,3,2,1}));
    }

    @Test
    void increasingTriplet3() {
        assertTrue(solution.increasingTriplet(new int[]{2,1,5,0,4,6}));
    }

    @Test
    void increasingTriplet4() {
        assertTrue(solution.increasingTriplet(new int[]{5,4,6,3,7,2,8}));
    }

    @Test
    void increasingTriplet5() {
        assertTrue(solution.increasingTriplet(new int[]{5,1,5,5,2,5,4}));
    }

    @Test
    void increasingTriplet6() {
        assertFalse(solution.increasingTriplet(new int[]{2,4,-2,-3}));
    }
}