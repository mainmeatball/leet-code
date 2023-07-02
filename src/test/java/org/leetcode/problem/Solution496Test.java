package org.leetcode.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Solution496Test {

    final Solution496 solution = new Solution496();

    @Test
    void nextGreaterElement() {
        final int[] nums1 = new int[]{4,1,2};
        final int[] nums2 = new int[]{1,3,4,2};

        final int[] result = solution.nextGreaterElement(nums1, nums2);

        for (final int j : result) {
            System.out.print(j + ",");
        }
    }

    @Test
    void nextGreaterElement2() {
        final int[] nums1 = new int[]{2,4};
        final int[] nums2 = new int[]{1,2,3,4};

        final int[] result = solution.nextGreaterElement(nums1, nums2);

        for (final int j : result) {
            System.out.print(j + ",");
        }
    }
}