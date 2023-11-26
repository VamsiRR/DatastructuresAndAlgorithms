package example.datastructures.linear.dynamic;

public class LinkedListNode {

    int data;

    LinkedListNode nextNode;

    public LinkedListNode(int data) {
        this.data = data;
        this.nextNode = null;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}
