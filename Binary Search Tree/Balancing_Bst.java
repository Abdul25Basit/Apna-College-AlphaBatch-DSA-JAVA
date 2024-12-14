import java.util.*;

public class Balancing_Bst {

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

    // Pre-order traversal to display tree nodes
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Method to perform an inorder traversal and store nodes in sorted order
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInorder(root.left, arr); // Traverse left subtree
        arr.add(root.data); // Add the node's data to the array
        getInorder(root.right, arr); // Traverse right subtree
    }

    // Method to construct a balanced BST from a sorted array
    public static Node makeBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) {
            return null;
        }

        // Choose the middle element as the root to maintain balance
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid)); // Create a new node

        // Recursively build the left and right subtrees
        root.left = makeBST(arr, st, mid - 1); 
        root.right = makeBST(arr, mid + 1, end);

        return root;
    }

    // Method to balance the BST
    public static Node BalanceBst(Node root) {
        // Step 1: Get the sorted array from the tree using inorder traversal
        ArrayList<Integer> arr = new ArrayList<>();
        getInorder(root, arr);

        // Step 2: Construct a balanced BST from the sorted array
        root = makeBST(arr, 0, arr.size() - 1);
        return root;
    }

    // Main method to test the balancing of the BST
    public static void main(String args[]) {
        // Create an unbalanced tree
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        
        // Print pre-order traversal of the unbalanced tree
        preOrder(root);
        System.out.println();

        // Balance the BST
        root = BalanceBst(root);

        // Print pre-order traversal of the balanced tree
        preOrder(root);
    }
}




/*

Explanation of Key Sections:













Balanced BST: A binary search tree where the depth of the left and right subtrees of every node differ by no more than 1.
Inorder Traversal: A depth-first traversal that visits nodes in increasing order of their values (for a BST).
Reconstruction: After obtaining the sorted node values from the BST, a balanced BST is created by recursively picking the middle element as the root.
Code Breakdown:
1. Class Node:
Represents each node in the binary tree. It contains:
data: Stores the value of the node.
left: Reference to the left child.
right: Reference to the right child.
2. Method preOrder(Node root):
Prints the nodes in pre-order traversal (Root -> Left -> Right).
It helps visualize the structure of the tree before and after balancing.
3. Method getInorder(Node root, ArrayList<Integer> arr):
Performs an inorder traversal of the BST and stores the node values in an ArrayList<Integer>.
The array will contain the elements of the tree in sorted order (since it's a BST).
4. Method makeBST(ArrayList<Integer> arr, int st, int end):
This method constructs a balanced BST from the sorted array arr.
The middle element of the array is selected as the root, and the same process is recursively applied to the left and right subarrays.
5. Method BalanceBst(Node root):
This method is responsible for balancing the tree.
It first performs an inorder traversal of the given tree to obtain the sorted node values.
Then it reconstructs a new balanced BST using the sorted values.





Inorder Traversal (getInorder):

The method getInorder recursively collects the elements of the tree in an ArrayList in sorted order.
Balanced BST Construction (makeBST):

This method constructs a balanced BST by recursively choosing the middle element from the sorted array as the root.
Balancing the Tree (BalanceBst):

After obtaining the sorted array of node values, a balanced BST is built, ensuring that the tree is well-balanced.
Pre-order Traversal (preOrder):

The pre-order traversal is used to print the nodes of the tree before and after balancing. It helps verify that the tree structure is correct.
Sample Output:
Given the unbalanced tree structure:

markdown
Copy code
            8
           / \
          6   10
         /     \
        5       11
       /           \
      3             12
The output will show the pre-order traversal of the unbalanced tree followed by the balanced tree:

Copy code
8 6 5 3 10 11 12 
8 6 5 3 10 11 12 
After balancing the tree, the output should reflect a balanced structure (e.g., if printed in pre-order):

Copy code
6 3 5 8 10 11 12 
Time Complexity:
Inorder Traversal (getInorder): O(n), where n is the number of nodes.
Balanced BST Construction (makeBST): O(n), where n is the number of nodes.
Overall, the time complexity is O(n) for balancing the tree.
Space Complexity:
O(n): The space complexity comes from storing the inorder traversal result in an array.





























*/
