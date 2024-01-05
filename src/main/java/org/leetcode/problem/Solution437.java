package org.leetcode.problem;

import org.leetcode.structure.TreeNode;

import java.util.HashMap;
import java.util.Map;


/**
 * Path Sum III
 */
public class Solution437 {

    public int pathSum(TreeNode root, int targetSum) {
        final Map<Long, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0L, 1);
        return pathSum(root, 0, targetSum, prefixSumMap);
    }

    private int pathSum(TreeNode root, long sum, int target, Map<Long, Integer> prefixSumMap) {
        if (root == null) {
            return 0;
        }

        sum += root.val;
        int res = prefixSumMap.getOrDefault(sum - target, 0);
        prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);

        res += pathSum(root.left, sum, target, prefixSumMap) + pathSum(root.right, sum, target, prefixSumMap);
        prefixSumMap.put(sum, prefixSumMap.get(sum) - 1);
        return res;
    }
}
