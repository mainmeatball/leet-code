package org.leetcode.weekly;

import org.leetcode.structure.TreeNode;

import java.util.*;


public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(final TreeNode root) {
        if (root == null) return Collections.emptyList();
        return new ArrayList<>(traverseTree(root, 0, new HashMap<>()).values());
    }

    private Map<Integer, Integer> traverseTree(final TreeNode root, final Integer level, final Map<Integer, Integer> map) {
        map.put(level, root.val);

        if (root.left != null) {
            traverseTree(root.left, level + 1, map);
        }
        if (root.right != null) {
            traverseTree(root.right, level + 1, map);
        }
        return map;
    }
}
