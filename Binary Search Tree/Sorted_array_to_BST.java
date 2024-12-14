public class Sorted_array_to_BST {

    // Node class representing each node in the BST
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

    // Pre-order traversal to print the tree structure
    public static void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " "); // Visit the node
        preOrder(root.left);   // Left subtree
        preOrder(root.right);  // Right subtree
    }

    // Create a balanced BST from a sorted array of integers
    public static Node createBST(int arr[], int st, int end) {
        if (st > end)
            return null;

        // Select the middle element as the root
        int mid = (st + ((end - st) / 2));

        Node root = new Node(arr[mid]);

        // Recursively build the left and right subtrees
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);

        return root;
    }

    // Main method to test the conversion of a sorted array to a BST
    public static void main(String args[]) {
        // Sorted array
        int arr[] = {3, 5, 6, 8, 10, 11, 12};

        // Create a balanced BST from the sorted array
        Node root = createBST(arr, 0, arr.length - 1);

        // Print the pre-order traversal of the BST
        preOrder(root);
    }
}
