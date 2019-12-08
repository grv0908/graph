package test.com.grv.pathFinding;

import main.com.grv.GraphWithMatrix;
import main.com.grv.pathFinding.Dijkstra;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.com.grv.GraphFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Gaurav Rajput
 * Created on 08/12/19
 */
class DijkstraTest {

    @Test
    void test1() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithCycle();

        int[] res = Dijkstra.dijkstra(graph, 1);
        Assertions.assertArrayEquals(new int[]{0, 0,1,4,3,5,7}, res);
    }

    @Test
    void test2() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithCycle();

        int[] res = Dijkstra.dijkstra(graph, 2);
        Assertions.assertArrayEquals(new int[]{0, 1, 0, 3 , 2, 4, 6}, res);
    }

    @Test
    void test3() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithCycle();

        int[] res = Dijkstra.dijkstra(graph, 6);
        Assertions.assertArrayEquals(new int[]{0, 7, 6, 3, 4 ,4 ,0}, res);
    }

    @Test
    void test4() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithoutCycle();

        int[] res = Dijkstra.dijkstra(graph, 1);
        Assertions.assertArrayEquals(new int[]{0, 0, 10, 5, 13, 14, 20}, res);
    }
}