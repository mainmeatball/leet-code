package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution1356Test {

    final Solution1356 solution = new Solution1356();

    @Test
    void sortByBits() {
        final int[] arr = new int[]{0,1,2,3,4,5,6,7,8};

        final int[] result = solution.sortByBits(arr);

        for (final int i : result) {
            System.out.print(i + ",");
        }
    }

    @Test
    void sortByBits2() {
        final int[] arr = new int[]{1024,512,256,128,64,32,16,8,4,2,1};

        final int[] result = solution.sortByBits(arr);

        for (final int i : result) {
            System.out.print(i + ",");
        }
    }
}