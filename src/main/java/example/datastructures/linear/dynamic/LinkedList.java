package example.datastructures.linear.dynamic;

public class LinkedList {

    LinkedListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int value) {
        head = addRec(head, value);
    }

    private LinkedListNode addRec(LinkedListNode head, int value) {
        if (head == null) {
            head = new LinkedListNode(value);
            return head;
        }

        head.nextNode = addRec(head.nextNode, value);

        return head;
    }

    public void print()
    {
        System.out.println(head);
    }
}
