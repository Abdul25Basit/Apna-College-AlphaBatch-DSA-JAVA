import java.util.*;

public class Mearge_tree {

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

    // Merge two BSTs into a balanced BST
    public static Node mergeBST(Node root1, Node root2) {
        // STEP 1: Create sorted arrays from both BSTs
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        inOrder(root1, list1); // Inorder traversal of first BST
        inOrder(root2, list2); // Inorder traversal of second BST

        // STEP 2: Merge the two sorted arrays into a single sorted array
        ArrayList<Integer> main = new ArrayList<>();
        int j = 0, k = 0;
        
        // Merging the two lists in sorted order
        while (j < list1.size() && k < list2.size()) {
            if (list1.get(j) <= list2.get(k)) {
                main.add(list1.get(j));
                j++;
            } else {
                main.add(list2.get(k));
                k++;
            }
        }

        // Adding remaining elements from list1
        while (j < list1.size()) {
            main.add(list1.get(j));
            j++;
        }

        // Adding remaining elements from list2
        while (k < list2.size()) {
            main.add(list2.get(k));
            k++;
        }

        // STEP 3: Construct a balanced BST from the merged list
        return createBst(main, 0, main.size() - 1);
    }

    // Inorder traversal to convert BST to sorted list
    public static void inOrder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left, list);  // Left subtree
        list.add(root.data);       // Visit the node
        inOrder(root.right, list); // Right subtree
    }

    // Pre-order traversal to print the tree structure
    public static void PreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " "); // Visit the node
        PreOrder(root.left);   // Left subtree
        PreOrder(root.right);  // Right subtree
    }

    // Create a balanced BST from a sorted list of integers
    public static Node createBst(ArrayList<Integer> list, int str, int end) {
        if (str > end) {
            return null;
        }

        // Select the middle element as the root
        int mid = (str + end) / 2;
        Node root = new Node(list.get(mid));

        // Recursively build the left and right subtrees
        root.left = createBst(list, str, mid - 1);
        root.right = createBst(list, mid + 1, end);

        return root;
    }

    // Main method to test the merging of two BSTs
    public static void main(String args[]) {
        // BST 1: 2 -> 1, 4
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        // BST 2: 9 -> 3, 12
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        // Merge the two BSTs into a balanced BST
        Node root = mergeBST(root1, root2);

        // Print the pre-order traversal of the merged tree
        PreOrder(root);
    }
}
