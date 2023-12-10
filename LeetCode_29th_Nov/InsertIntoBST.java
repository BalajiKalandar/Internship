package com.java.timest;

class TreeNode3 {
    int val;
    TreeNode3 left, right;

    TreeNode3(int val) {
        this.val = val;
    }
}

public class InsertIntoBST {

    public TreeNode3 insertIntoBST(TreeNode3 root, int val) {
        if (root == null) {
            return new TreeNode3(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

    // Utility method to print the tree (in-order traversal)
    public void inOrderTraversal(TreeNode3 root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        InsertIntoBST solution = new InsertIntoBST();

        // Example 1
        TreeNode3 root1 = new TreeNode3(4);
        root1.left = new TreeNode3(2);
        root1.right = new TreeNode3(7);
        root1.left.left = new TreeNode3(1);
        root1.left.right = new TreeNode3(3);
        int val1 = 5;

        TreeNode3 result1 = solution.insertIntoBST(root1, val1);
        System.out.print("Example 1 Output: ");
        solution.inOrderTraversal(result1);
        System.out.println();

        // Example 2
        TreeNode3 root2 = new TreeNode3(40);
        root2.left = new TreeNode3(20);
        root2.right = new TreeNode3(60);
        root2.left.left = new TreeNode3(10);
        root2.left.right = new TreeNode3(30);
        root2.right.left = new TreeNode3(50);
        root2.right.right = new TreeNode3(70);
        int val2 = 25;

        TreeNode3 result2 = solution.insertIntoBST(root2, val2);
        System.out.print("Example 2 Output: ");
        solution.inOrderTraversal(result2);
        System.out.println();
    }
}
