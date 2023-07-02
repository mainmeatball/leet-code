package org.leetcode.problem;

import org.leetcode.structure.Node;

import java.util.*;


/**
 * N-ary Tree Preorder Traversal
 */
public class Solution589 {

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }

        final List<Integer> result = new ArrayList<>();
        final Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            final Node cur = stack.pop();
            final List<Node> children = cur.children;
            if (children != null) {
                for (int i = children.size() - 1; i >= 0; i--) {
                    stack.push(children.get(i));
                }
            }
            result.add(cur.val);
        }

        return result;
    }
}
