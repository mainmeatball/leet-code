package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class Solution228Test {

    final Solution228 solution = new Solution228();

    @Test
    public void test1() {
        final List<String> result = solution.summaryRanges(new int[] {0,1,2,4,5,7});

        assertEquals(List.of("0->2", "4->5", "7"), result);
    }

    @Test
    public void test2() {
        final List<String> result = solution.summaryRanges(new int[] {0,2,3,4,6,8,9});

        assertEquals(List.of("0","2->4","6","8->9"), result);
    }
}