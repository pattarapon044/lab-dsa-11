package main;

import algorithm.Graph;

public class TestGraph {
    public static void main(String[] args) {
        Graph graph = new Graph();

        //create vertices
        graph.addVertex('A'); //0
        graph.addVertex('B');//1
        graph.addVertex('C');//2
        graph.addVertex('D'); //3
        graph.addVertex('E'); //4
        graph.addVertex('F'); //5
        graph.addVertex('G'); //6
        graph.addVertex('H');//7
        graph.addVertex('I');//8

        //connect vertices
        graph.addEdge(0,1);  //AB
        graph.addEdge(0,2);  //AC
        graph.addEdge(0,3);  //AD
        graph.addEdge(0,4); //AE
        graph.addEdge(1,5); //BF
        graph.addEdge(5,7);  //FH
        graph.addEdge(3,6); //DG
        graph.addEdge(6,8);  //GI

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
    }
}
