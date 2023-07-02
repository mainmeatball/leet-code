package org.leetcode.problem;

import org.leetcode.structure.TreeNode;

import java.util.Stack;


/**
 * Minimum Absolute Difference in BST
 */
public class Solution530 {
    public int getMinimumDifference(TreeNode root) {
        final Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        TreeNode prev = null;
        int minDiff = Integer.MAX_VALUE;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            if (prev != null) {
                final int diff = Math.abs(curr.val - prev.val);
                minDiff = Math.min(diff, minDiff);
            }
            prev = curr;

            curr = curr.right;
        }
        return minDiff;
    }
}
