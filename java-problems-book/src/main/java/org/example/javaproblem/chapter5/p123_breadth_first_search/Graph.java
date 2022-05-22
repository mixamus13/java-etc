package org.example.javaproblem.chapter5.p123_breadth_first_search;

import java.util.LinkedList;

public class Graph {

    private final int v;
    private final LinkedList<Integer>[] adjacents;

    @SuppressWarnings("unchecked")
    public Graph(int v) {
        this.v = v;
        adjacents = new LinkedList[v];

        for (int i = 0; i < v; ++i) {
            adjacents[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int e) {
        adjacents[v].add(e);
    }

    void BFS(int start) {

        boolean visited[] = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            start = queue.poll();
            System.out.print(start + " ");

            for (int n : adjacents[start]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
