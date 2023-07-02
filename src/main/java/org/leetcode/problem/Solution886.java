package org.leetcode.problem;

import java.util.*;


/**
 * Possible Bipartition
 */
public class Solution886 {

    public boolean possibleBipartition(int n, int[][] dislikes) {
        if (n == 1) {
            return true;
        }

        final Map<Integer, List<Integer>> map = new HashMap<>();
        for (final int[] pairOfDislikes : dislikes) {
            final int a = pairOfDislikes[0];
            final int b = pairOfDislikes[1];
            final List<Integer> aDis = map.getOrDefault(a, new ArrayList<>());
            final List<Integer> bDis = map.getOrDefault(b, new ArrayList<>());
            aDis.add(b);
            bDis.add(a);
            map.put(a, aDis);
            map.put(b, bDis);
        }

        final int[] visited = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (visited[i] != 0) {
                continue;
            }
            final boolean bipartite = isBipartite(map, i, visited);
            if (!bipartite) {
                return false;
            }
        }

        return true;
    }

    private boolean isBipartite(final Map<Integer, List<Integer>> adj, final int node, final int[] visited) {
        final Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = 1;

        while (!q.isEmpty()) {
            final int cur = q.poll();
            final List<Integer> adjNodes = adj.get(cur);
            if (adjNodes == null) {
                return true;
            }
            for (final Integer adjNode : adjNodes) {
                if (visited[adjNode] == visited[cur]) {
                    return false;
                }
                if (visited[adjNode] == 0) {
                    // uninitialized
                    visited[adjNode] = -visited[cur];
                    q.offer(adjNode);
                }
            }
        }

        return true;
    }
}
