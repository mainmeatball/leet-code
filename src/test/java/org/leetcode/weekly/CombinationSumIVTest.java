package org.leetcode.weekly;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CombinationSumIVTest {

    private final CombinationSumIV task = new CombinationSumIV();

    @Test
    void test() {
        final int[] candidates = new int[]{1,2,3};
        final int res = task.combinationSum4(candidates, 4);

        assertEquals(7, res);
    }

    @Test
    void test2() {
        final int[] candidates = new int[]{9};
        final int res = task.combinationSum4(candidates, 3);

        assertEquals(0, res);
    }
}