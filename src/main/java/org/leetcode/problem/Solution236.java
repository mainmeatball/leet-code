package org.leetcode.problem;

import org.leetcode.structure.TreeNode;

import java.util.HashMap;
import java.util.Map;


/**
 * Lowest Common Ancestor of a Binary Tree
 */
public class Solution236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        final Map<Integer, TreeNode> parentMap = new HashMap<>();
        final Map<Integer, Integer> levelMap = new HashMap<>();
        fillMaps(root, parentMap, levelMap, null, 0);

        int pLevel = levelMap.get(p.val);
        int qLevel = levelMap.get(q.val);

        while (true) {
            if (qLevel > pLevel) {
                q = parentMap.get(q.val);
                qLevel = levelMap.get(q.val);
            } else if (pLevel > qLevel) {
                p = parentMap.get(p.val);
                pLevel = levelMap.get(p.val);
            } else {
                // pLevel == qLevel
                if (p.val == q.val) {
                    return p;
                } else {
                    q = parentMap.get(q.val);
                    p = parentMap.get(p.val);
                }
            }
        }
    }

    private void fillMaps(TreeNode root, Map<Integer, TreeNode> parentMap, Map<Integer, Integer> levelMap, TreeNode parent, int level) {
        if (root == null) {
            return;
        }

        parentMap.put(root.val, parent);
        levelMap.put(root.val, level);

        fillMaps(root.left, parentMap, levelMap, root, level + 1);
        fillMaps(root.right, parentMap, levelMap, root, level + 1);
    }
}
