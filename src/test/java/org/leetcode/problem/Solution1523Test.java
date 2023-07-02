package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1523Test {

    final Solution1523 solution = new Solution1523();

    @Test
    void countOddsBetweenEvens() {
        final int result = solution.countOdds(10, 100);

        assertEquals(45, result);
    }

    @Test
    void countOddsBetweenOdds() {
        final int result = solution.countOdds(9, 99);

        assertEquals(46, result);
    }

    @Test
    void countOddsBetweenEvenAndOdd() {
        final int result = solution.countOdds(10, 99);

        assertEquals(45, result);
    }

    @Test
    void countOddsBetweenOddAndEven() {
        final int result = solution.countOdds(9, 100);

        assertEquals(46, result);
    }
}