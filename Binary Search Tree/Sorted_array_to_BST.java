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



/*Middle Element Selection:

In the createBST method, the middle element of the array (arr[mid]) is chosen to ensure the tree remains balanced. The left subtree is built recursively using the left half of the array, and the right subtree is built recursively using the right half of the array.
Pre-order Traversal:

The preOrder method prints the nodes of the tree in pre-order. This helps in verifying that the tree structure is correct. For a balanced BST, the pre-order traversal should print the root first, then the left subtree, followed by the right subtree.
Recursive Construction:

The recursion in the createBST method splits the array into smaller sections (subarrays) and builds the tree step by step, ensuring the result is a balanced BST.
Output:
For the given sorted array:

Copy code
{3, 5, 6, 8, 10, 11, 12}
The program will output the pre-order traversal of the constructed BST:

Copy code
8 5 3 6 10 11 12
This is the pre-order traversal of the balanced BST, where 8 is the root, 5 is the left child of 8, 3 is the left child of 5, and so on.

Time Complexity:
createBST method: Each element is processed once, and the array is divided into two halves at each step, resulting in a time complexity of O(n), where n is the number of elements in the array.

preOrder method: The pre-order traversal visits each node once, so the time complexity is also O(n).

Space Complexity:
The space complexity is O(n) due to the recursion stack used to build the BST and the space used for the tree nodes themselves.*/
