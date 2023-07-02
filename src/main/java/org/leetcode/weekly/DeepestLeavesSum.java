package org.leetcode.weekly;

import org.leetcode.structure.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


class DeepestLeavesSum {
    int deepestLeavesSum(final TreeNode root) {
        final Queue<LevelNode> queue = new LinkedList<>();
        int maxLevel = 1;
        final Map<Integer, Integer> map = new HashMap<>();
        LevelNode temp = new LevelNode(1, root);
        queue.add(temp);
        while (!queue.isEmpty()) {
            temp = queue.poll();
            final int level = temp.level;
            final TreeNode node = temp.node;
            maxLevel = Math.max(maxLevel, level);
            map.put(level, map.get(level) == null ? node.val : map.get(level) + node.val);
            if (node.left != null) {
                queue.add(new LevelNode(level + 1, node.left));
            }
            if (node.right != null) {
                queue.add(new LevelNode(level + 1, node.right));
            }
        }
        return map.get(maxLevel);
    }

    private static final class LevelNode {
        int level;
        TreeNode node;

        LevelNode(final int level, final TreeNode node) {
            this.level = level;
            this.node = node;
        }
    }
}
