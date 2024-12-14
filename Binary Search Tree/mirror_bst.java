public class mirror_bst {
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor to initialize a node
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to mirror the binary tree
    public static Node mirror(Node root) {  // O(n)
        if (root == null) {
            return null;  // Base case: if the node is null, return null
        }

        // Recursively mirror the left and right subtrees
        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        // Swap the left and right subtrees of the current node
        root.left = rightMirror;
        root.right = leftMirror;

        return root;  // Return the root of the mirrored tree
    }

    // Pre-order traversal of the tree
    public static void preOrder(Node root) {
        if (root == null) {
            return;  // Base case: if the node is null, return
        }

        // Print the data of the current node
        System.out.print(root.data + " ");
        // Recursively visit the left and right subtrees
        preOrder(root.left);
        preOrder(root.right);
    }

    // Main method
    public static void main(String args[]) {

        // Construct the binary tree
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        // Initial tree structure:
        //            8
        //           / \
        //          5   10
        //         / \    \
        //        3   6   11

        // Print the pre-order traversal of the original tree
        System.out.print("Pre-order before mirroring: ");
        preOrder(root);  // Expected: 8 5 3 6 10 11
        System.out.println();

        // Mirror the tree
        mirror(root);

        // Print the pre-order traversal of the mirrored tree
        System.out.print("Pre-order after mirroring: ");
        preOrder(root);  // Expected: 8 10 11 5 6 3
    }
}



/*Expected Output:
Before mirroring the tree:

css
Copy code
Pre-order before mirroring: 8 5 3 6 10 11
After mirroring the tree:

css
Copy code
Pre-order after mirroring: 8 10 11 5 6 3
Explanation:
Initial Tree (Before Mirroring):

markdown
Copy code
           8
          / \
         5   10
        / \    \
       3   6   11
The pre-order traversal of the tree is: 8 5 3 6 10 11.

Tree after Mirroring: After mirroring the tree, the left and right children of every node are swapped. The new structure becomes:

csharp
Copy code
           8
          / \
         10  5
        / \  / \
       11  null  6 3
The pre-order traversal of the mirrored tree is: 8 10 11 5 6 3.

Time Complexity:
The mirror method processes each node of the tree exactly once, making its time complexity O(n), where n is the number of nodes in the tree.
The preOrder method also processes each node exactly once, with a time complexity of O(n).
Space Complexity:
The space complexity is O(h), where h is the height of the tree. This is due to the recursion stack used in both the mirror and preOrder methods. In the worst case, for an unbalanced tree, the height can be O(n), and in the best case (for a balanced tree), the height is O(log n).*/
