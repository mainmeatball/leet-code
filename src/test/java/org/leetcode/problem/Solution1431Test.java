package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class Solution1431Test {

    final Solution1431 solution = new Solution1431();

    @Test
    void kidsWithCandies() {
        final List<Boolean> result = solution.kidsWithCandies(new int[]{2,3,5,1,3}, 3);

        assertEquals(List.of(true, true, true, false, true), result);
    }

    @Test
    void kidsWithCandies2() {
        final List<Boolean> result = solution.kidsWithCandies(new int[]{4,2,1,1,2}, 1);

        assertEquals(List.of(true,false,false,false,false), result);
    }

    @Test
    void kidsWithCandies3() {
        final List<Boolean> result = solution.kidsWithCandies(new int[]{12,1,12}, 10);

        assertEquals(List.of(true,false,true), result);
    }
}