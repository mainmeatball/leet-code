package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.TreeNode;

import static org.junit.jupiter.api.Assertions.*;


class Solution1161Test {

    final Solution1161 solution = new Solution1161();

    @Test
    void maxLevelSum() {
        final TreeNode node7 = new TreeNode(7);
        final TreeNode node5 = new TreeNode(5);
        final TreeNode node4 = new TreeNode(4);
        final TreeNode node2 = new TreeNode(2, node5, null);
        final TreeNode node14 = new TreeNode(14, node7, node4);
        final TreeNode root = new TreeNode(1, node2, node14);

        final int result = solution.maxLevelSum(root);

        assertEquals(2, result);
    }
}