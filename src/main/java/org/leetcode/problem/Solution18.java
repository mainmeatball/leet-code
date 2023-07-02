package org.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 4Sum
 */
public class Solution18 {

    public List<List<Integer>> fourSum(final int[] nums, final int target) {
        Arrays.sort(nums);
        final List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int m = i + 1; m < nums.length - 2; m++) {
                if (m > i + 1 && nums[m] == nums[m - 1]) {
                    continue;
                }
                int k = m + 1;
                int j = nums.length - 1;
                while (k < j) {
                    final int sum = nums[i] + nums[m] + nums[k] + nums[j];
                    if (sum == target) {
                        res.add(List.of(nums[i], nums[m], nums[k], nums[j]));
                        while (k < j && nums[k] == nums[k+1]) {
                            k++;
                        }
                        while (k < j && nums[j] == nums[j-1]) {
                            j--;
                        }
                        k++;
                        j--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        j--;
                    }
                }
            }
        }
        return res;
    }
}
