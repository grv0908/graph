package test.com.grv.traversals;

import main.com.grv.GraphWithMatrix;
import main.com.grv.traversals.DetectCycleInUndirectedGraph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.com.grv.GraphFactory;

/**
 * @author Gaurav Rajput
 * Created on 08/12/19
 */
class HasCycleInUndirectedGraphTest {
    @Test
    public void test1() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithCycle();
        Assertions.assertEquals(true, DetectCycleInUndirectedGraph.hasCycleUsingDFS(graph));
    }

    @Test
    public void test2() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithFourCycle();
        Assertions.assertEquals(true, DetectCycleInUndirectedGraph.hasCycleUsingDFS(graph));
    }

    @Test
    public void test3() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithoutCycle();
        Assertions.assertEquals(false, DetectCycleInUndirectedGraph.hasCycleUsingDFS(graph));
    }
}