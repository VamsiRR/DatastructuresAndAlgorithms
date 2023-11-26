package example.datastructures;

public class BinaryTreeNode {

    int data;

    BinaryTreeNode leftNode;

    BinaryTreeNode rightNode;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{" +
                "data=" + data +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
