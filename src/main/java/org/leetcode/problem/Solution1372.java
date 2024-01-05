package org.leetcode.problem;

import org.leetcode.structure.TreeNode;


/**
 * Longest ZigZag Path in a Binary Tree
 */
public class Solution1372 {

    public int longestZigZag(TreeNode root) {
        return Math.max(
                zigzag(root.left, 1, true),
                zigzag(root.right, 1, false)
        );
    }

    private int zigzag(TreeNode node, int maxZ, boolean isLeft) {
        if (node == null) {
            return maxZ - 1;
        }

        return Math.max(
            zigzag(node.left, isLeft ? 1 : (maxZ + 1), true),
            zigzag(node.right, !isLeft ? 1 : (maxZ + 1), false)
        );
    }
}
