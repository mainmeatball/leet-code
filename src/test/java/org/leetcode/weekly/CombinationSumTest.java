package org.leetcode.weekly;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CombinationSumTest {

    private final CombinationSum task = new CombinationSum();

    @Test
    void test() {
        final int[] candidates = new int[]{2,3,5};
        final List<List<Integer>> res = task.combinationSum(candidates, 8);

        assertEquals(List.of(List.of(2,2,2,2), List.of(2,3,3), List.of(3,5)), res);
    }

    @Test
    void test2() {
        final int[] candidates = new int[]{2};
        final List<List<Integer>> res = task.combinationSum(candidates, 1);

        assertEquals(List.of(), res);
    }

    @Test
    void test3() {
        final int[] candidates = new int[]{1};
        final List<List<Integer>> res = task.combinationSum(candidates, 1);

        assertEquals(List.of(List.of(1)), res);
    }

    @Test
    void test4() {
        final int[] candidates = new int[]{1};
        final List<List<Integer>> res = task.combinationSum(candidates, 2);

        assertEquals(List.of(List.of(1,1)), res);
    }
}