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

public class IncreasingOrderSearchTree {
    private TreeNode current;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode();
        current = newRoot;
        inorderTraversal(root);
        return newRoot.right;
    }
    
    private void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        
        inorderTraversal(node.left);
        current.right = new TreeNode(node.val);
        current = current.right;
        inorderTraversal(node.right);
    }

    // Helper function to print the tree in-order
    private void printInorder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        IncreasingOrderSearchTree solution = new IncreasingOrderSearchTree();
        TreeNode newRoot = solution.increasingBST(root);
        solution.printInorder(newRoot); // Output: 1 2 3 4 5 6
    }
}

