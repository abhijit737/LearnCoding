public class Node {
    // Data element of the node
    private int data;
    // Reference to the next node
    private Node next;

    // Constructor to initialize a node with data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
	
    public void setData(int data) {
        this.data = data;
    }

    // Getters and setters for data and next
    public int getData() {
        return data;
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
