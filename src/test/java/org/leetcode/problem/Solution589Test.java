package org.leetcode.problem;

import org.junit.jupiter.api.Test;
import org.leetcode.structure.Node;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class Solution589Test {

    final Solution589 solution = new Solution589();

    @Test
    void preorder() {
        final List<Node> layer3 = List.of(new Node(5), new Node(6));
        final List<Node> layer2 = List.of(new Node(3, layer3), new Node(2), new Node(4));
        final Node root = new Node(1, layer2);

        final List<Integer> result = solution.preorder(root);

        for (final Integer v : result) {
            System.out.print(v + ",");
        }
    }
}