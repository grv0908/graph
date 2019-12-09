package main.com.grv.traversals;

import main.com.grv.GraphWithMatrix;

import java.util.Stack;

/**
 * @author Gaurav Rajput
 * Created on 08/12/19
 *
 * Algorithm to detect cycle in directed graph.
 * Concept is to keep track of back edge in a particular
 * recursion path while doing dfs.
 */
public class DetectCycleInDirectedGraph {
    public static boolean detectCycleInDirectedGraph(GraphWithMatrix graph) {
        boolean[] visited = new boolean[graph.getSize()];
        boolean[] visitedInCurrentPath = new boolean[graph.getSize()];

        for (int i = 1; i < graph.getSize(); i++) {
            if (!visited[i]) {
                if (isCycle(graph, i, visited, visitedInCurrentPath)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycle(GraphWithMatrix graph, int vertex, boolean[] visited, boolean[] visitedInCurrentPath) {
        if (visitedInCurrentPath[vertex])
            return true;

        visited[vertex] = true;
        visitedInCurrentPath[vertex] = true;

        for (int i = 1; i < graph.getSize(); i++) {
            if(graph.getMatrix()[vertex][i] != 0) {
                if (isCycle(graph, i, visited, visitedInCurrentPath))
                    return true;
            }
        }

        visitedInCurrentPath[vertex] = false;
        return false;
    }
}
