package example.datastructures;

public class Tree {

    BinaryTreeNode root;

    public Tree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private BinaryTreeNode insertRec(BinaryTreeNode root, int value) {
        if (root == null) {
            root = new BinaryTreeNode(value);
            return root;
        }

        if (value > root.data) {
            root.leftNode = insertRec(root.rightNode, value);
        } else {
            root.rightNode = insertRec(root.leftNode, value);
        }

        return root;
    }

    public boolean search(int target)
    {
        return searchBinaryRec(root, target);
    }


    private boolean searchBinaryRec(BinaryTreeNode root, int target) {

        if (root == null) {
            return false;
        }

        if (root.data == target) {
            return true;
        } else if (root.data < target) {
            return searchBinaryRec(root.leftNode, target);
        } else {
            return searchBinaryRec(root.rightNode, target);
        }
    }

    public void inOrderTraversal() {
        inOrderTraversalRec(root);
    }

    // Recursive helper method for in-order traversal
    private void inOrderTraversalRec(BinaryTreeNode root) {
        if (root != null) {
            inOrderTraversalRec(root.leftNode);
            System.out.print(root.data + " ");
            inOrderTraversalRec(root.rightNode);
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
