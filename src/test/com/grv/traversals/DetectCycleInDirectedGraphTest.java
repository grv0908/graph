package test.com.grv.traversals;

import main.com.grv.GraphWithMatrix;
import main.com.grv.traversals.DetectCycleInDirectedGraph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.com.grv.GraphFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Gaurav Rajput
 * Created on 09/12/19
 */
class DetectCycleInDirectedGraphTest {
    @Test
    public void test1() {
        GraphWithMatrix graph = GraphFactory.getDirectedGraphWithNoCycle();
        Assertions.assertEquals(false, DetectCycleInDirectedGraph.detectCycleInDirectedGraph(graph));
    }

    @Test
    public void test2() {
        GraphWithMatrix graph = GraphFactory.getDirectedGraphWithCycle();
        Assertions.assertEquals(true, DetectCycleInDirectedGraph.detectCycleInDirectedGraph(graph));
    }

    @Test
    public void test3() {
        GraphWithMatrix graph = GraphFactory.getDisconnectedDirectedGraphWithCycle();
        Assertions.assertEquals(true, DetectCycleInDirectedGraph.detectCycleInDirectedGraph(graph));
    }

    @Test
    public void test4() {
        GraphWithMatrix graph = GraphFactory.getDisconnectedDirectedGraphWithNoCycle();
        Assertions.assertEquals(false, DetectCycleInDirectedGraph.detectCycleInDirectedGraph(graph));
    }
}