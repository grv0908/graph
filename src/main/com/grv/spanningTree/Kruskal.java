package main.com.grv.spanningTree;

import main.com.grv.GraphWithMatrix;
import main.com.grv.Edge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Gaurav Rajput
 * Created on 30/11/19
 *
 * Kruskal’s algorithm uses the greedy approach for finding a minimum spanning tree.
 *
 * Kruskal’s algorithm treats every node as an independent tree and connects one with
 * another only if it has the lowest cost compared to all other options available.
 *
 */
public class Kruskal {

    /*
    * Function to get parent (set representation of a vertex)
    * */
    private static int getParent(int vertex, int[] parent) {
        if(vertex != parent[vertex]) {
            return getParent(parent[vertex], parent);
        }
        return vertex;
    }

    /*
    * Unite two sets of 2 vertex
    * */
    private static void union(int v1, int v2, int[] parent) {
        parent[v2] = v1;
    }

    /*
    * Kruskal Implentation based on union find Algorithm
    * */
    public static int kruskal(GraphWithMatrix graph) {

        ArrayList<Edge> edges = graph.getEdges();
        Collections.sort(edges, new Comparator<Edge>() {
            @Override
            public int compare(Edge e1, Edge e2) {
                return e1.weight - e2.weight;
            }
        });

        int[] parent = new int[graph.getSize()];
        int cost = 0;

        for(int i = 1; i < parent.length; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < edges.size(); i++) {
            int p1 = getParent(edges.get(i).src, parent);
            int p2 = getParent(edges.get(i).dest, parent);

            if (p1 != p2) {
                union(p1, p2, parent);
                System.out.println("Adding edge " + edges.get(i).src + " <---> " + edges.get(i).dest + " to MST");
                cost += edges.get(i).weight;
            }
        }

        System.out.println("Total Cost to Build Min Spanning tree is : " + cost);
        return cost;
    }
}
