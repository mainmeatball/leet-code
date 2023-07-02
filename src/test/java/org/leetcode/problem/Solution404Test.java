package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.TreeNode;

import static org.junit.jupiter.api.Assertions.*;


class Solution404Test {

    final Solution404 solution = new Solution404();

    @Test
    void sumOfLeftLeaves() {
        final TreeNode n15 = new TreeNode(15);
        final TreeNode n7 = new TreeNode(7);
        final TreeNode n9 = new TreeNode(9);
        final TreeNode n20 = new TreeNode(20, n15, n7);
        final TreeNode n3 = new TreeNode(3, n9, n20);

        final int result = solution.sumOfLeftLeaves(n3);

        assertEquals(24, result);
    }

    @Test
    void sumOfLeftLeaves2() {
        final TreeNode n1 = new TreeNode(1);

        final int result = solution.sumOfLeftLeaves(n1);

        assertEquals(0, result);
    }
}