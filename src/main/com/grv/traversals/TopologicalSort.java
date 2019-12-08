package main.com.grv.traversals;

import main.com.grv.GraphWithMatrix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

/**
 * @author Gaurav Rajput
 * Created on 08/12/19
 */
public class TopologicalSort {
    public static ArrayList<Integer> topologicalSort(GraphWithMatrix graph) {
        ArrayList<Integer> order = new ArrayList<>();
        boolean[] visited = new boolean[graph.getSize()];
        
        for (int i = 1; i < graph.getSize(); i++) {
            if(!visited[i])
                dfs(graph, i, order, visited);
        }

        Collections.reverse(order);
        System.out.println("Topological Order for graph is : ");
        for (int i : order)
            System.out.print(i + " ");
        return order;
    }

    public static void dfs (GraphWithMatrix graph, int vertex, ArrayList<Integer> order, boolean[] visited) {
        for (int i = 1; i < graph.getSize(); i++) {
            if (!visited[i] && graph.getMatrix()[vertex][i] != 0) {
                dfs(graph, i, order, visited);
            }
        }

        order.add(vertex);
        visited[vertex] = true;
    }
}
