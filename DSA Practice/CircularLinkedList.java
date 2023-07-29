public class CircularLinkedList {
    private Node head;
    private Node tail;

    // Node class for a single node in the circular singly linked list
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a node at the beginning of the circular singly linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
    }

    // Method to display the elements of the circular singly linked list
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Inserting nodes at the beginning
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);

        // Displaying the list
        System.out.println("Circular Singly Linked List:");
        list.displayList();
    }
}
