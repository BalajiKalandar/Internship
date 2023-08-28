package com.java.s28thdsa;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isUnivalTree(root, root.val);
    }

    private boolean isUnivalTree(TreeNode node, int value) {
        if (node == null) {
            return true;
        }
        if (node.val != value) {
            return false;
        }
        return isUnivalTree(node.left, value) && isUnivalTree(node.right, value);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        UnivaluedBinaryTree solution = new UnivaluedBinaryTree();
        boolean isUnivalued = solution.isUnivalTree(root);
        System.out.println("Is the tree univalued? " + isUnivalued); // Output: true
    }
}
