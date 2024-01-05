package org.leetcode.problem;

import org.leetcode.structure.TreeNode;


/**
 * Count Good Nodes in Binary Tree
 */
public class Solution1448 {

    public int goodNodes(TreeNode root) {
        return 1 + traverse(root.left, root.val) + traverse(root.right, root.val);
    }

    private int traverse(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }
        int isGood = node.val >= max ? 1 : 0;
        int nextMax = Math.max(node.val, max);
        return isGood + traverse(node.left, nextMax) + traverse(node.right, nextMax);
    }
}
