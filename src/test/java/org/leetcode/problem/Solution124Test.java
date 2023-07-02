package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Solution124Test {

    final Solution124 solution = new Solution124();

    @Test
    public void maxPathSum42() {
        final TreeNode node9 = new TreeNode(9);
        final TreeNode node15 = new TreeNode(15);
        final TreeNode node7 = new TreeNode(7);
        final TreeNode node20 = new TreeNode(20, node15, node7);
        final TreeNode root = new TreeNode(-10, node9, node20);

        final int result = solution.maxPathSum(root);

        System.out.println(result);
        assertEquals(42, result);
    }

    @Test
    public void maxPathSumAllPositive() {
        final TreeNode node9 = new TreeNode(9);
        final TreeNode node15 = new TreeNode(15);
        final TreeNode node7 = new TreeNode(7);
        final TreeNode node20 = new TreeNode(20, node15, node7);
        final TreeNode root = new TreeNode(100, node9, node20);

        final int result = solution.maxPathSum(root);

        System.out.println(result);
        assertEquals(144, result);
    }

    @Test
    public void maxPathSumNeg3() {
        final TreeNode nodeNeg3 = new TreeNode(-3);

        final int result = solution.maxPathSum(nodeNeg3);

        System.out.println(result);
        assertEquals(-3, result);
    }

    @Test
    public void maxPathSum0() {
        final TreeNode node0 = new TreeNode(0);

        final int result = solution.maxPathSum(node0);

        System.out.println(result);
        assertEquals(0, result);
    }

    @Test
    public void maxPathSum1() {
        final TreeNode node1 = new TreeNode(1);

        final int result = solution.maxPathSum(node1);

        System.out.println(result);
        assertEquals(1, result);
    }

    @Test
    public void maxPathSumComplexTree() {
        final TreeNode node7 = new TreeNode(7);
        final TreeNode node2 = new TreeNode(2);
        final TreeNode node1 = new TreeNode(1);

        final TreeNode node11 = new TreeNode(11, node7, node2);
        final TreeNode node13 = new TreeNode(13);
        final TreeNode node4_2 = new TreeNode(4, null, node1);

        final TreeNode node4_1 = new TreeNode(4, node11, null);
        final TreeNode node8 = new TreeNode(8, node13, node4_2);

        final TreeNode node5 = new TreeNode(5, node4_1, node8);

        final int result = solution.maxPathSum(node5);

        System.out.println(result);
        assertEquals(48, result);
    }

    @Test
    public void maxPathSum1Neg23() {
        final TreeNode nodeNeg2 = new TreeNode(-2);
        final TreeNode node3 = new TreeNode(3);

        final TreeNode node1 = new TreeNode(1, nodeNeg2, node3);

        final int result = solution.maxPathSum(node1);

        System.out.println(result);
        assertEquals(4, result);
    }
}