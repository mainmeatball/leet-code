package org.leetcode.problem;

import org.leetcode.structure.TreeNode;

import java.util.Stack;


/**
 * Leaf-Similar Trees
 */
public class Solution872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        final Stack<TreeNode> stack1 = new Stack<>();
        final Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root1);
        stack2.push(root2);

        while (true) {
            final int leaf1 = nextLeaf(stack1);
            final int leaf2 = nextLeaf(stack2);

            if (leaf1 == -1 && leaf2 >= 0) {
                return false;
            }
            if (leaf2 == -1 && leaf1 >= 0) {
                return false;
            }
            if (leaf1 == -1 && leaf2 == -1) {
                break;
            }

            if (leaf1 != leaf2) {
                return false;
            }
        }
        return true;
    }

    private int nextLeaf(final Stack<TreeNode> stack) {
        while (!stack.isEmpty()) {
            final TreeNode node = stack.pop();
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
            if (node.left == null && node.right == null) {
                return node.val;
            }
        }
        return -1;
    }

}
