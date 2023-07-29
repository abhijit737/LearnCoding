class Node {
    int data;
    Node left;
    Node right;

    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}

class BinaryTreeInorderTraversal {
    Node root;

    public BinaryTreeInorderTraversal() {
        root = null;
    }

    // In-order traversal method
    public void inOrderTraversal(Node node) {
        if (node == null)
            return;

        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal tree = new BinaryTreeInorderTraversal();

        // Constructing the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-order traversal of the binary tree:");
        tree.inOrderTraversal(tree.root);
    }
}
