package org.leetcode.problem;

/**
 * Merge Sorted Array
 */
public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        final int[] res = new int[m + n];
        int index = 0;
        for (int i = 0, j = 0; index < res.length;) {
            if (i >= m) {
                res[index] = nums2[j++];
                index++;
                continue;
            }
            if (j >= n) {
                res[index] = nums1[i++];
                index++;
                continue;
            }
            if (nums1[i] <= nums2[j]) {
                res[index] = nums1[i++];
            } else {
                res[index] = nums2[j++];
            }
            index++;
        }
        System.arraycopy(res, 0, nums1, 0, nums1.length);
    }
}
