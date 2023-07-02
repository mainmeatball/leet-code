package org.leetcode.problem;


import java.util.*;


/**
 * Kids With the Greatest Number of Candies
 */
public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (final int candy : candies) {
            max = Math.max(candy, max);
        }
        final List<Boolean> result = new ArrayList<>(candies.length);
        for (final int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
