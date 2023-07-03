package org.leetcode.problem;

import java.util.HashMap;
import java.util.Map;


/**
 * Max Number of K-Sum Pairs
 */
public class Solution1679 {
    public int maxOperations(int[] nums, int k) {
        final Map<Integer, Integer> subs = new HashMap<>();
        for (final int num : nums) {
            if (k - num < 0) continue;
            int sub = subs.getOrDefault(k - num, 0);
            sub++;
            subs.put(k - num, sub);
        }
        int result = 0;
        for (final int num : nums) {
            if (k - num < 0) continue;
            if (k - num == num) {
                if (subs.get(num) != null && subs.get(num) >= 2) {
                    int sub = subs.get(k - num);
                    sub -= 2;
                    subs.put(k - num, sub);
                    result++;
                }
                continue;
            }
            if (subs.get(num) != null && subs.get(num) > 0 && subs.get(k - num) != null && subs.get(k - num) > 0) {
                int sub = subs.get(num);
                sub--;
                subs.put(num, sub);
                sub = subs.get(k - num);
                sub--;
                subs.put(k - num, sub);
                result++;
            }
        }
        return result;
    }
}
