package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class Solution2215Test {

    final Solution2215 solution = new Solution2215();

    @Test
    void findDifference() {
        final List<List<Integer>> expected = List.of(
                List.of(1,3),
                List.of(4,6)
        );
        assertEquals(expected, solution.findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
    }

    @Test
    void findDifference2() {
        final List<List<Integer>> expected = List.of(
                List.of(3),
                List.of()
        );
        assertEquals(expected, solution.findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}));
    }
}