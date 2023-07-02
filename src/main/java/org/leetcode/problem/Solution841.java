package org.leetcode.problem;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * Keys and Rooms
 */
public class Solution841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms.size() == 1) {
            return true;
        }

        int totalVisited = 0;
        final boolean[] visited = new boolean[rooms.size()];
        final Queue<Integer> q = new LinkedList<>();

        final List<Integer> initKeys = rooms.get(0);
        addKeys(q, initKeys, visited);
        visited[0] = true;
        totalVisited++;

        while (!q.isEmpty()) {
            final Integer nextRoom = q.poll();
            final List<Integer> keys = rooms.get(nextRoom);
            addKeys(q, keys, visited);
            totalVisited++;
        }

        return totalVisited == rooms.size();
    }

    private void addKeys(final Queue<Integer> q, final List<Integer> keys, final boolean[] visited) {
        for (final Integer key : keys) {
            if (!visited[key]) {
                q.offer(key);
                visited[key] = true;
            }
        }
    }
}
