package example.datastructures;

import example.datastructures.linear.dynamic.LinkedList;

/**
 * Run time complexity : O(1)
 * Space complexity : O(v^2)
 */
public class Main {

    public static void main(String[] args) {

        // createAdjacencyMatrix();

        //createAdjacencyList();

        //createBinaryTree();

        CreateLinkedList();

    }

    private static void createAdjacencyMatrix() {
        //Define size of the Adjacent Matrix
        GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(5);

        //Add Nodes(Vertices) to the graph
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        //Add edges between nodes
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        //Print
        graph.print();

        //check if edge exist between nodes
        System.out.println(graph.checkEdge(3, 1));
    }

    private static void createAdjacencyList() {
        //Define size of the Adjacent Matrix
        GraphAdjacencyList graph = new GraphAdjacencyList();

        //Add Nodes(Vertices) to the graph
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        //Add edges between nodes
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        //Print
        graph.print();

        //check if edge exist between nodes
        System.out.println(graph.checkEdge(3, 1));
    }

    private static void createBinaryTree()
    {
        Tree tree = new Tree();

        //Add Data
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        //print
        System.out.println(tree);

        System.out.println(tree.search(800));

        tree.inOrderTraversal();
    }

    private static void CreateLinkedList()
    {
        LinkedList llist = new LinkedList();

        llist.add(10);
        llist.add(20);
        llist.add(40);

        llist.print();

    }
}
