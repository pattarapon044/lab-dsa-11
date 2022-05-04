package main;

import algorithm.DiGraph;

public class TestDiGraph {
    public static void main(String[] args) {
        DiGraph graph = new DiGraph();

        //create vertices
        graph.addVertex('A'); //0
        graph.addVertex('B');//1
        graph.addVertex('C');//2
        graph.addVertex('D'); //3
        graph.addVertex('E'); //4

        //connect vertices
        graph.addEdge(0,1,3);  //AB weight = 3
        graph.addEdge(0,2,4);  //AC weight = 4
        graph.addEdge(0,3,1);  //AD weight = 1
        graph.addEdge(1,4,2);  //BE weight = 2
        graph.addEdge(2,3,3);  //CD weight = 3
        graph.addEdge(3,1,2);  //DB weight = 2
        graph.addEdge(3,2,3);  //DC weight = 3
        graph.addEdge(4,2,4);  //EC weight = 4

        //size
        graph.showSize();

        //show vertexes
        graph.showVertex();

        //show adjacency matrix
        graph.showAdjacency();

        //show edges
        graph.showEdge();

        //a complete graph?
        graph.checkComplete();

        //weighted path length
        //ABECD
        int[] path = {0,1,4,2,3};
        System.out.println("The path length ABECD = " + graph.findPathLength(path));
    }
}

