package example.datastructures;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GraphAdjacencyList {

    private final List<LinkedList<Node>> adjList;

    public GraphAdjacencyList() {
        adjList = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> nodes = new LinkedList<>();
        nodes.add(node);

        this.adjList.add(nodes);
    }

    public void addEdge(int src, int dst) {

        LinkedList<Node> currentList = adjList.get(src);

        Node dstNode = adjList.get(dst).get(0);

        currentList.add(dstNode);

    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = adjList.get(src);

        Node dstNode = adjList.get(dst).get(0);

        for (Node node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }

        return false;
    }

    public void print()
    {
        for(LinkedList<Node> llNodes : adjList)
        {
            for (Node node : llNodes)
            {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }

}
