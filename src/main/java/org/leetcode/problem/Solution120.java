package org.leetcode.problem;

import java.util.ArrayList;
import java.util.List;


/**
 * Triangle
 */
public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            final List<Integer> prevRow = triangle.get(i + 1);
            final List<Integer> row = triangle.get(i);
            final List<Integer> newRow = new ArrayList<>();
            for (int j = 0; j < row.size(); j++) {
                newRow.add(row.get(j) + Math.min(prevRow.get(j), prevRow.get(j + 1)));
            }
            row.clear();
            row.addAll(newRow);
        }
        return triangle.get(0).get(0);
    }
}
