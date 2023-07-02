package org.leetcode.problem;

import com.sun.source.tree.Tree;
import org.leetcode.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * Maximum Level Sum of a Binary Tree
 */
class Solution1161 {

    public int maxLevelSum(TreeNode root) {
        Queue<List<TreeNode>> q = new LinkedList<>();
        q.add(List.of(root));
        int maxVal = Integer.MIN_VALUE, minLevel = Integer.MAX_VALUE;
        int currLevel = 0;
        while (!q.isEmpty()) {
            final List<TreeNode> currLevelNodes = q.poll();
            if (currLevelNodes == null || currLevelNodes.isEmpty()) {
                break;
            }
            currLevel++;
            int curLevelVal = 0;
            final List<TreeNode> newLevelNodes = new ArrayList<>();
            for (final TreeNode currLevelNode : currLevelNodes) {
                curLevelVal += currLevelNode.val;
                if (currLevelNode.left != null) newLevelNodes.add(currLevelNode.left);
                if (currLevelNode.right != null) newLevelNodes.add(currLevelNode.right);
            }
            if (curLevelVal > maxVal) {
                maxVal = curLevelVal;
                minLevel = currLevel;
            }
            q.add(newLevelNodes);
        }
        return minLevel;
    }
}