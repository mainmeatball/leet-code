package org.leetcode.problem;

import org.leetcode.structure.TreeNode;


/**
 * Sum of Left Leaves
 */
public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root, false);
    }

    private int helper(final TreeNode node, final boolean isLeft) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return isLeft ? node.val : 0;
        }
        final int l = helper(node.left, true);
        final int r = helper(node.right, false);
        return l + r;
    }
}
