package com.java.SixthAssignement;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeChecker {
    // Variable to keep track of the previous node during in-order traversal
    TreeNode prev;

    // Function to check whether the binary tree is a binary search tree or not
    public boolean isBST(TreeNode root) {
        prev = null; // Initialize the prev variable

        // Call the helper function to perform in-order traversal
        return isBSTHelper(root);
    }

    // Helper function to perform in-order traversal and check for sorted order
    private boolean isBSTHelper(TreeNode node) {
        // Base case: If the node is null, it is considered a valid BST node
        if (node == null) {
            return true;
        }

        // Check the left subtree
        if (!isBSTHelper(node.left)) {
            return false;
        }

        // Check the current node's value against the previous node's value
        if (prev != null && node.val <= prev.val) {
            return false;
        }

        // Update the previous node to the current node
        prev = node;

        // Check the right subtree
        return isBSTHelper(node.right);
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        BinaryTreeChecker checker = new BinaryTreeChecker();
        boolean isBST = checker.isBST(root);
        System.out.println("Is the binary tree a binary search tree? " + isBST);
    }
}

