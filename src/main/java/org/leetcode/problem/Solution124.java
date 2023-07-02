package org.leetcode.problem;

import org.leetcode.structure.TreeNode;


/**
 * Maximum path sum in binary tree
 */
public class Solution124 {

    int globalMax = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return globalMax;
    }

    private int helper(final TreeNode node) {
        final int maxLeft = node.left != null ? helper(node.left) : 0;
        final int maxRight = node.right != null ? helper(node.right) : 0;

        final int maxWithLeft = Math.max(maxLeft + node.val, node.val);
        final int maxWithRight = Math.max(maxRight + node.val, node.val);
        final int maxLeftAndRight = Math.max(maxWithLeft, maxWithRight);

        final int maxAsRoot = Math.max(Math.max(maxLeft + maxRight + node.val, node.val), maxLeftAndRight);

        globalMax = Math.max(globalMax, maxAsRoot);
        return maxLeftAndRight;
    }
}
