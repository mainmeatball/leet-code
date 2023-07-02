package org.leetcode.problem;

import java.util.HashMap;


/**
 * Equal Row and Column Pairs
 */
public class Solution2352 {

    public int equalPairs(int[][] grid) {
        final HashMap<String, Integer> rows = new HashMap<>();
        final HashMap<Integer, StringBuilder> columns = new HashMap<>();
        int result = 0;

        final StringBuilder lastRow = new StringBuilder();
        for (int i = 0; i < grid.length; i++) {
            lastRow.append(grid[grid.length - 1][i]);
            lastRow.append("-");
        }
        rows.put(lastRow.toString(), 1);

        for (int i = 0; i < grid.length; i++) {
            final StringBuilder rowBuilder = new StringBuilder();
            for (int j = 0; j < grid[0].length; j++) {
                rowBuilder.append(grid[i][j]).append("-");
                columns.putIfAbsent(j, new StringBuilder());
                columns.get(j).append(grid[i][j]).append("-");
                if (i == grid[0].length - 1) {
                    final String column = columns.get(j).toString();
                    final Integer rowCount = rows.getOrDefault(column, 0);
                    result += rowCount;
                }
            }
            final String rowString = rowBuilder.toString();
            final Integer rowValue = rows.getOrDefault(rowString, 0);
            rows.put(rowString, rowValue + 1);
        }
        return result;
    }
}
