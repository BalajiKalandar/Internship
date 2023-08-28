package com.java.s28thdsa;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int val) {
        this.val = val;
    }
}

public class InsertIntoBST {
    public TreeNode1 insertIntoBST(TreeNode1 root, int val) {
        if (root == null) {
            return new TreeNode1(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

    // Helper function to perform in-order traversal
    private void inorderTraversal(TreeNode1 node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.val + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(4);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(7);
        root.left.left = new TreeNode1(1);
        root.left.right = new TreeNode1(3);

        int val = 5;

        InsertIntoBST solution = new InsertIntoBST();
        TreeNode1 newRoot = solution.insertIntoBST(root, val);
        solution.inorderTraversal(newRoot); // Output: 1 2 3 4 5 7
    }
}

