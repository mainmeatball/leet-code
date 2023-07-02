package org.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 3Sum
 */
public class Solution15 {

    public List<List<Integer>> threeSum(final int[] nums) {
        Arrays.sort(nums);
        final List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int k = i + 1;
            int j = nums.length - 1;
            while (k < j) {
                final int sum = nums[i] + nums[k] + nums[j];
                if (sum == 0) {
                    res.add(List.of(nums[i], nums[k], nums[j]));
                    while (k < j && nums[k] == nums[k+1]) {
                        k++;
                    }
                    while (k < j && nums[j] == nums[j-1]) {
                        j--;
                    }
                    k++;
                    j--;
                } else if (sum < 0) {
                    k++;
                } else {
                    j--;
                }
            }
        }
        return res;
    }


}
