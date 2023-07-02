package org.leetcode.weekly;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DeepestLeavesSumTest {

    private final DeepestLeavesSum task = new DeepestLeavesSum();

    @Test
    void exampleSimpleTree() {
        final TreeNode node7 = new TreeNode(7);
        final TreeNode node5 = new TreeNode(5);
        final TreeNode node4 = new TreeNode(4);
        final TreeNode node2 = new TreeNode(2, node5, null);
        final TreeNode node3 = new TreeNode(3, node7, node4);
        final TreeNode root = new TreeNode(1, node2, node3);

        final int result = task.deepestLeavesSum(root);

        assertEquals(16, result);
    }
}