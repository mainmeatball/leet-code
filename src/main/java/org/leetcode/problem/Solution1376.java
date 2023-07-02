package org.leetcode.problem;


import java.util.*;


/**
 * Time Needed to Inform All Employees
 */
public class Solution1376 {

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        // Prepare tree of employees
        Map<Integer, List<Integer>> subMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            final int managerID = manager[i];
            if (managerID == -1) {
                // skip the head
                continue;
            }
            subMap.computeIfAbsent(managerID, __ -> new ArrayList<>());
            subMap.get(managerID).add(i);
        }

        return traverseTree(headID, informTime, subMap, 0);
    }

    private int traverseTree(int employee, int[] informTime,  Map<Integer, List<Integer>> subMap, int level) {
        final int infoTime = informTime[employee];
        final List<Integer> subordinates = subMap.getOrDefault(employee, Collections.emptyList());
        int nextLevelMax = 0;
        for (final Integer subordinate : subordinates) {
            nextLevelMax = Math.max(traverseTree(subordinate, informTime, subMap, level + 1), nextLevelMax);
        }
        return infoTime + nextLevelMax;
    }
}
