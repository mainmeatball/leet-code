package org.leetcode.problem;

import java.util.*;


/**
 * Number of Provinces
 */
public class Solution547 {
    public int findCircleNum(int[][] isConnected) {
        final Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[0].length; j++) {
                if (isConnected[i][j] == 0) {
                    continue;
                }
                graph.putIfAbsent(i, new ArrayList<>());
                graph.get(i).add(j);
            }
        }

        final int n = isConnected.length;
        final boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visitProvince(i, graph, visited);
                count++;
            }
        }

        return count;
    }

    private void visitProvince(int vertix, Map<Integer, List<Integer>> graph, boolean[] visited) {
        final Queue<Integer> q = new LinkedList<>();
        q.offer(vertix);

        while (!q.isEmpty()) {
            final int p = q.poll();
            if (visited[p]) {
                continue;
            }
            visited[p] = true;
            final List<Integer> next = graph.get(p);
            if (next.isEmpty()) {
                continue;
            }
            q.addAll(next);
        }
    }
}
