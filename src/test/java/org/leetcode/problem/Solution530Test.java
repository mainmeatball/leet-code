package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.TreeNode;

import static org.junit.jupiter.api.Assertions.*;


class Solution530Test {

    final Solution530 solution = new Solution530();

    @Test
    void getMinDifference1() {
        final TreeNode n15 = new TreeNode(15);
        final TreeNode n7 = new TreeNode(7);
        final TreeNode n9 = new TreeNode(9);
        final TreeNode n20 = new TreeNode(20, n15, n7);
        final TreeNode n3 = new TreeNode(3, n9, n20);

        final int result = solution.getMinimumDifference(n3);

        assertEquals(2, result);
    }

    @Test
    void getMinDifference2() {
        final TreeNode n1 = new TreeNode(1);
        final TreeNode n2 = new TreeNode(0, null, n1);

        final int result = solution.getMinimumDifference(n2);

        assertEquals(1, result);
    }

    @Test
    void getMinDifference3() {
        final TreeNode n445 = new TreeNode(445);
        final TreeNode n699 = new TreeNode(699);
        final TreeNode n652 = new TreeNode(652, null, n699);
        final TreeNode n384 = new TreeNode(384, null, n445);
        final TreeNode n543 = new TreeNode(543, n384, n652);

        final int result = solution.getMinimumDifference(n543);

        assertEquals(47, result);
    }

    @Test
    void getMinDifference4() {
        final TreeNode n227 = new TreeNode(227);
        final TreeNode n911 = new TreeNode(911);
        final TreeNode n104 = new TreeNode(104, null, n227);
        final TreeNode n701 = new TreeNode(701, null, n911);
        final TreeNode n236 = new TreeNode(236, n104, n701);

        final int result = solution.getMinimumDifference(n236);

        assertEquals(9, result);
    }
}