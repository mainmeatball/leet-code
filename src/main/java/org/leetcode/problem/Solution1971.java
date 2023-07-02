package org.leetcode.problem;

import java.util.*;


/**
 * Find if Path Exists in Graph
 */
public class Solution1971 {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }
        if (edges.length == 0) {
            return false;
        }

        final Map<Integer, List<Integer>> adjV = new HashMap<>();

        for (final int[] edge : edges) {
            final int s = edge[0];
            final int d = edge[1];
            final List<Integer> aS = adjV.getOrDefault(s, new ArrayList<>());
            final List<Integer> aD = adjV.getOrDefault(d, new ArrayList<>());
            aS.add(d);
            aD.add(s);
            adjV.put(s, aS);
            adjV.put(d, aD);
        }

        final boolean[] visited = new boolean[n];
        final Queue<Integer> q = new LinkedList<>();
        q.offer(source);

        while (!q.isEmpty()) {
            final int cur = q.poll();
            if (visited[cur]) {
                continue;
            }

            final List<Integer> adjacentList = adjV.get(cur);
            for (final int i : adjacentList) {
                if (i == destination) {
                    return true;
                }
                q.offer(i);
            }
            visited[cur] = true;
        }

        return false;
    }
}
