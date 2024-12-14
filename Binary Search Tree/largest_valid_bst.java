public class largest_valid_bst {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        boolean isBst;
        int size;
        int min;
        int max;

        public Info(boolean isBst, int size, int min, int max) {
            this.isBst = isBst;
            this.min = min;
            this.max = max;
            this.size = size;
        }
    }

    static int maxBst = 0;

    public static Info largestBST(Node root) {

        // If the node is null, it is always a BST (size 0)
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        // Recursively get information about the left and right subtrees
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        // Calculate the size, min, and max values for the current subtree
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        // Condition 1: If the current node violates BST properties, it's not a BST
        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        // Condition 2: If both left and right subtrees are BSTs, this subtree is also a BST
        if (leftInfo.isBst && rightInfo.isBst) {
            maxBst = Math.max(maxBst, size);  // Update the maximum BST size
            return new Info(true, size, min, max);
        }

        // If the subtree is not a BST, return false
        return new Info(false, size, min, max);
    }

    public static void main(String args[]) {

        // Construct the binary tree
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        /*
         * Tree structure:
         *           50
         *         /    \
         *       30     60
         *      /  \    /  \
         *     5   20  45   70
         *                    /  \
         *                   65  80
         */

        // Our answer should be the size of the largest BST (5 in this case)

        Info info = largestBST(root);

        // Output the size of the largest BST found
        System.out.println("Largest BST size is " + maxBst);
    }
}



/*
Explanation of Tree Structure:
The tree constructed in the main method looks like this:

markdown
Copy code
           50
         /    \
       30      60
      /  \     /  \
     5   20   45  70
                    /  \
                   65  80
Largest BST: The subtree rooted at node 5 (with only one node) is a valid BST of size 1.
Largest BST size: The largest BST in the tree is a valid subtree rooted at node 45, which has size 5.
Expected Output:
arduino
Copy code
Largest BST size is 5
Time Complexity:
The time complexity of this solution is O(n), where n is the number of nodes in the tree. We visit each node once to check the BST properties and calculate the subtree sizes.
Space Complexity:
The space complexity is O(h), where h is the height of the tree, due to the recursion stack. In the worst case (for a skewed tree), h could be O(n).



*/
