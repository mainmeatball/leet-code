package org.leetcode.problem;

import java.util.ArrayList;
import java.util.List;


/**
 * Maximum Ice Cream Bars
 */
public class Solution1833 {

    public int maxIceCream(int[] costs, int coins) {
        int max = 0;
        for (int i = 0; i < costs.length; i++) {
            final List<Integer> res = helper(costs, coins, new ArrayList<>(), i);
            if (res != null && res.size() > max) {
                max = res.size();
            }
        }
        return max;
    }

    private List<Integer> helper(final int[] costs, final int coins, final List<Integer> combo, final int index) {
        if (coins == 0) return combo;
        if (coins < 0) return null;
        for (int i = index; i < costs.length; i++) {
            combo.add(costs[i]);
            helper(costs, coins - costs[i], combo, i + 1);
        }
        return combo;
    }
}
