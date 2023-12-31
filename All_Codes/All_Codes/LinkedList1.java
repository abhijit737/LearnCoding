class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

    void traverse(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }

    }
    void insert(int data,Node head,int pos){
        Node toAdd = new Node(data);
        if(pos==0){
            toAdd.next = head;
            head=toAdd;
            return;
        }
        Node prev =head;
            for(int i=0;i<pos-1;i++){
                prev = prev.next;
            }
            toAdd.next = prev.next;
            prev.next=toAdd;
        }
        int delete(Node head,int pos){
            int data = 0;
            if(pos==0){
                head = head.next;
                return -1;
            }
            Node prev = head;
            for(int i=0;i<pos-1;i++){
                prev = prev.next;
            }
            prev=prev.next;
            
            return data;
        }
    }


public class LinkedList1 {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;
        n1.traverse(head);
        n1.insert(40,head,3);
        n1.delete(head, 1);


    }

}
