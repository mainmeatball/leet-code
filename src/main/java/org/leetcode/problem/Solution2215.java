package org.leetcode.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Find the Difference of Two Arrays
 */
public class Solution2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        final Set<Integer> set1 = new HashSet<>();
        final Set<Integer> set2 = new HashSet<>();
        final List<Integer> res1 = new ArrayList<>();
        final List<Integer> res2 = new ArrayList<>();
        for (int i = 0; i < Math.max(nums1.length, nums2.length); i++) {
            if (i < nums1.length) set1.add(nums1[i]);
            if (i < nums2.length) set2.add(nums2[i]);
        }
        for (final Integer num : set1) {
            if (!set2.contains(num)) res1.add(num);
        }
        for (final Integer num : set2) {
            if (!set1.contains(num)) res2.add(num);
        }
        return List.of(res1, res2);
    }
}
