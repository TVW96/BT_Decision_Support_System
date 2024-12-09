public class Main {
    public static void main(String[] args) {
        // Example tree structure with more recommendations
        TreeNode root = new TreeNode("Do you want a loan?");

        // Personal use branch
        root.left = new TreeNode("Is it for personal use?");
        root.left.left = new TreeNode("Do you have a steady income?");
        root.left.right = new TreeNode("Do you have a good credit score?");

        // Mortgage branch
        root.right = new TreeNode("Is it for a mortgage?");
        root.right.left = new TreeNode("What is the value of the property?");
        root.right.right = new TreeNode("Do you have a down payment?");

        // Personal loan recommendations
        root.left.left.left = new TreeNode("Recommendation: Personal Loan");
        root.left.right.left = new TreeNode("Recommendation: Improve Credit Score First");

        // Mortgage recommendations
        root.right.left.left = new TreeNode("Recommendation: Property Loan");
        root.right.left.right = new TreeNode("Recommendation: Consider Refinancing");
        root.right.right.left = new TreeNode("Recommendation: Save for Down Payment");
        root.right.right.right = new TreeNode("Recommendation: Seek Financial Advisor");

        // Additional recommendations for personal loan
        root.left.left.right = new TreeNode("Recommendation: Improve Income First");
        root.left.right.right = new TreeNode("Recommendation: Explore Debt Consolidation");

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
