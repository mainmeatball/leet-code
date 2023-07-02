package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution15Test {

    private final Solution15 solution = new Solution15();

    @Test
    void test() {
        final int[] nums = new int[] {-1,0,1,2,-1,-4};
        final var sum = solution.threeSum(nums);
        assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), sum);
    }

    @Test
    void test2() {
        final int[] nums = new int[] {};
        final var sum = solution.threeSum(nums);
        assertEquals(List.of(), sum);
    }

    @Test
    void test3() {
        final int[] nums = new int[] {0, 0, 0, 0};
        final var sum = solution.threeSum(nums);
        assertEquals(List.of(List.of(0, 0, 0)), sum);
    }
}