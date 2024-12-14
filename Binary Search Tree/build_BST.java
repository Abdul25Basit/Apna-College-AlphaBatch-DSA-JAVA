public class build_BST {

    // Node class represents each node of the BST
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor to create a new node with the given data
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to insert a value into the BST
    public static Node build(Node root, int val) {
        if (root == null) {
            root = new Node(val);  // If the root is null, create a new node
            return root;
        }

        // If the value is smaller than the root data, insert it in the left subtree
        if (root.data > val) {
            root.left = build(root.left, val);
        }

        // If the value is larger than the root data, insert it in the right subtree
        if (root.data < val) {
            root.right = build(root.right, val);
        }

        return root;
    }

    // In-order traversal of the BST to print the nodes in sorted order
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);  // Visit the left subtree
        System.out.print(root.data + " ");  // Visit the root node
        inorder(root.right);  // Visit the right subtree
    }

    // Method to search for a key in the BST
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;  // If root is null, key is not found
        }

        // If the root data matches the key, return true
        if (root.data == key) {
            return true;
        }

        // If the key is smaller, search in the left subtree
        if (root.data > key) {
            return search(root.left, key);
        } else {
            // If the key is larger, search in the right subtree
            return search(root.right, key);
        }
    }

    // Main method to test the functionality of the BST
    public static void main(String args[]) {

        int values[] = {5, 1, 3, 4, 2, 7};  // Values to insert into the BST
        Node root = null;

        int n = values.length;

        // Insert each value from the array into the BST
        for (int i = 0; i < n; i++) {
            root = build(root, values[i]);
        }

        // Perform a search for the value 7 in the BST
        if (search(root, 7)) {
            System.out.println("True");  // If found, print True
        } else {
            System.out.println("False");  // If not found, print False
        }
    }
}
