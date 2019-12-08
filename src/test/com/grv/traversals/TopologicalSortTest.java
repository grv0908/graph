package test.com.grv.traversals;

import main.com.grv.GraphWithMatrix;
import main.com.grv.traversals.TopologicalSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.com.grv.GraphFactory;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Gaurav Rajput
 * Created on 08/12/19
 */
class TopologicalSortTest {
    @Test
    public void test1() {
        GraphWithMatrix graph = GraphFactory.getDirectedGraphWithNoCycle();
        ArrayList<Integer> al = TopologicalSort.topologicalSort(graph);
        int[] arr = new int[al.size()];
        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = al.get(i);
        }
        Assertions.assertArrayEquals(new int[]{7,6,3,4,1,2,8,5,9}, arr);
    }
}