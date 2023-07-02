package org.leetcode.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Summary Ranges
 */
public class Solution228 {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return Collections.emptyList();
        if (nums.length == 1) return List.of(String.valueOf(nums[0]));

        final List<String> result = new ArrayList<>();
        int rangeLeft = nums[0];
        int rangeRight = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == 1) {
                rangeRight = nums[i];
            } else {
                if (rangeLeft == rangeRight) {
                    result.add(String.valueOf(rangeLeft));
                } else {
                    result.add(rangeLeft + "->" + rangeRight);
                }
                rangeLeft = nums[i];
                rangeRight = nums[i];
            }
        }

        if (rangeLeft == rangeRight) {
            result.add(String.valueOf(rangeLeft));
        } else {
            result.add(rangeLeft + "->" + rangeRight);
        }
        return result;
    }
}
