package com.ozan.day12_trie_graph.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphMainApp {
    public static void main(String[] args) {
        //look at the given table for the edges
        List<Edge> edges = Arrays.asList(new Edge(0, 1, 2), new Edge(0, 2, 4),
                new Edge(3, 2, 3), new Edge(2, 5, 5), new Edge(4, 5, 1)
                , new Edge(5, 4, 3), new Edge(1, 2, 4));
        Graph graph = new Graph(edges);
        graph.printGraph(graph);


    }
}
