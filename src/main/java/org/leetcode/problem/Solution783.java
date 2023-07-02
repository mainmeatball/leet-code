package org.leetcode.problem;

import org.leetcode.structure.TreeNode;

import java.util.Stack;


/**
 * Minimum Distance Between BST Nodes
 */
public class Solution783 {
    TreeNode prev;
    int minDiff = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        return traverse(root);
    }

    private int traverse(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;

        traverse(root.left);

        if (prev != null) {
            final int currDiff = Math.abs(prev.val - root.val);
            minDiff = Math.min(currDiff, minDiff);
        }
        prev = root;

        traverse(root.right);

        return minDiff;
    }
}
