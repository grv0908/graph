package main.com.grv;

/**
 * @author Gaurav Rajput
 * Created on 08/12/19
 *
 * Represent edge of a graph
 */
public class Edge {
    public int src;
    public int dest;
    public int weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}