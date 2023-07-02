package org.leetcode.weekly;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author sstepanov
 */
class BinaryTreeRightSideViewTest {

    private final BinaryTreeRightSideView task = new BinaryTreeRightSideView();

    @Test
    public void exampleSimpleTree() {
        final TreeNode node7 = new TreeNode(7);
        final TreeNode node6 = new TreeNode(6);
        final TreeNode node5 = new TreeNode(5);
        final TreeNode node4 = new TreeNode(4);
        final TreeNode node2 = new TreeNode(2, node5, node6);
        final TreeNode node3 = new TreeNode(3, node7, node4);
        final TreeNode root = new TreeNode(1, node2, node3);

        final List<Integer> result = task.rightSideView(root);

        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(4, result.get(2));
    }

    @Test
    public void exampleLeftTreeAsList() {
        final TreeNode node5 = new TreeNode(5);
        final TreeNode node4 = new TreeNode(4, node5, null);
        final TreeNode node3 = new TreeNode(3, node4, null);
        final TreeNode node2 = new TreeNode(2, node3, null);
        final TreeNode node6 = new TreeNode(6);
        final TreeNode root = new TreeNode(1, node2, node6);

        final List<Integer> result = task.rightSideView(root);

        assertEquals(5, result.size());
        assertEquals(1, result.get(0));
        assertEquals(6, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }
}