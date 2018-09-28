class GraphApp {

    public static void main(String[] args) {

        Graph graph1 = new Graph();
        graph1.addVertex('A');
        graph1.addVertex('B');
        graph1.addVertex('C');
        graph1.addVertex('D');
        graph1.addVertex('E');

        graph1.addEdge(0,1); // AB
        graph1.addEdge(1,2); // BC
        graph1.addEdge(0,3); // AD
        graph1.addEdge(3,4); // DE

        Graph graph2 = new Graph();
        graph2.addVertex('1');
        graph2.addVertex('2');
        graph2.addVertex('3');
        graph2.addVertex('4');
        graph2.addVertex('5');
        graph2.addVertex('6');
        graph2.addVertex('7');
        graph2.addVertex('8');
        graph2.addVertex('9');

        graph2.addEdge(0,1); // 1->2
        graph2.addEdge(0,2); // 1->3
        graph2.addEdge(0,3); // 1->4
        graph2.addEdge(1,4); // 2->5
        graph2.addEdge(4,6); // 5->7
        graph2.addEdge(6,7); // 7->8
        graph2.addEdge(2,8); // 3->9
        graph2.addEdge(3,5); // 4->6

        graph1.dfs();
        graph2.bfs();

    }
}
