public class Main {
    public static void main(String[] args) {
        // Example tree structure
        TreeNode root = new TreeNode("Do you want a loan?");
        root.left = new TreeNode("Is it for personal use?");
        root.right = new TreeNode("Is it for a mortgage?");
        root.left.left = new TreeNode("Do you have a steady income?");
        root.left.right = new TreeNode("Do you have a good credit score?");
        root.right.left = new TreeNode("What is the value of the property?");
        root.right.right = new TreeNode("Do you have a down payment?");
        root.left.left.left = new TreeNode("Recommendation: Personal Loan");
        root.left.right.left = new TreeNode("Recommendation: Improve Credit Score First");

        // Calculate the maximum depth of the tree
        int depth = DecisionTree.maxDepth(root);
        System.out.println("Maximum Depth of the Decision Tree: " + depth);
    }

    // Definition of a tree node
    static class TreeNode {
        String question; // Represents the question at this node (optional)
        TreeNode left;
        TreeNode right;

        // Constructor
        public TreeNode(String question) {
            this.question = question;
            this.left = null;
            this.right = null;
        }
    }

    static class DecisionTree {

        // Function to calculate the maximum depth of the binary tree
        public static int maxDepth(TreeNode root) {
            if (root == null) {
                return 0; // Base case: an empty tree has depth 0
            }

            // Recursively calculate the depth of left and right subtrees
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            // Return the larger depth plus 1 (for the current node)
            return 1 + Math.max(leftDepth, rightDepth);
        }
    }
}