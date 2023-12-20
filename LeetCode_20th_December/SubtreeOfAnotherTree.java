package com.java.dec20;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }

        // Check if the current subtree is identical to subRoot
        if (isIdentical(root, subRoot)) {
            return true;
        }

        // Recursively check the left and right subtrees
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isIdentical(TreeNode root1, TreeNode root2) {
        // Base case: both nodes are null
        if (root1 == null && root2 == null) {
            return true;
        }

        // Check if both nodes are not null and have the same value
        if (root1 != null && root2 != null && root1.val == root2.val) {
            // Recursively check left and right subtrees
            return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
        }

        return false;
    }

    public static void main(String[] args) {
        // Example 1
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(5);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(2);

        TreeNode subRoot1 = new TreeNode(4);
        subRoot1.left = new TreeNode(1);
        subRoot1.right = new TreeNode(2);

        SubtreeOfAnotherTree solution1 = new SubtreeOfAnotherTree();
        System.out.println("Example 1: " + solution1.isSubtree(root1, subRoot1)); // Output: true

        // Example 2
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(5);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(2);
        root2.right.right = new TreeNode(0);

        TreeNode subRoot2 = new TreeNode(4);
        subRoot2.left = new TreeNode(1);
        subRoot2.right = new TreeNode(2);

        SubtreeOfAnotherTree solution2 = new SubtreeOfAnotherTree();
        System.out.println("Example 2: " + solution2.isSubtree(root2, subRoot2)); // Output: false
    }
}
