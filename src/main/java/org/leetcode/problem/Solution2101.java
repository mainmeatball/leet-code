package org.leetcode.problem;

import java.util.*;


/**
 * Detonate the Maximum Bombs
 */
public class Solution2101 {

    public int maximumDetonation(int[][] bombs) {
        final Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < bombs.length; i++) {
            for (int j = 0; j < bombs.length; j++) {
                if (i == j) {
                    continue;
                }
                if (inRadius(bombs[i], bombs[j])) {
                    graph.computeIfAbsent(i, __ -> new ArrayList<>());
                    graph.get(i).add(j);
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();
        int maxSize = 1;

        for (int i = 0; i < bombs.length; i++) {
            q.add(i);
            final Set<Integer> set = new HashSet<>();
            while (!q.isEmpty()) {
                final int bomb = q.poll();
                if (!set.contains(bomb)) {
                    final List<Integer> adjV = graph.get(bomb);
                    if (adjV != null && !adjV.isEmpty()) {
                        q.addAll(adjV);
                    }
                }
                set.add(bomb);
            }
            if (set.size() > maxSize) {
                maxSize = set.size();
            }
        }

        return maxSize;
    }

    private boolean inRadius(int[] bomb1, int[] bomb2) {
        final long x1 = bomb1[0];
        final long y1 = bomb1[1];
        final long r = bomb1[2];

        final long x2 = bomb2[0];
        final long y2 = bomb2[1];

        return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) <= r * r;
    }
}
