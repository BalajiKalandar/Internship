package com.java.timest;

class TreeNode5 {
    int val;
    TreeNode5 left, right;

    TreeNode5(int val) {
        this.val = val;
    }
}

public class IncreasingOrderSearchTree {

    TreeNode5 result; // The new root of the rearranged tree
    TreeNode5 current; // The current node in the rearranged tree

    public TreeNode5 increasingBST(TreeNode5 root) {
        result = new TreeNode5(0); // Dummy node as the new root
        current = result;

        inOrderTraversal(root);

        return result.right; // Skip the dummy node and return the actual root
    }

    private void inOrderTraversal(TreeNode5 node) {
        if (node == null) {
            return;
        }

        // Traverse left
        inOrderTraversal(node.left);

        // Update the tree structure
        node.left = null;
        current.right = node;
        current = node;

        // Traverse right
        inOrderTraversal(node.right);
    }

    // Utility method to print the tree (in-order traversal)
    private void inOrderPrint(TreeNode5 root) {
        if (root != null) {
            inOrderPrint(root.left);
            System.out.print(root.val + " ");
            inOrderPrint(root.right);
        }
    }

    public static void main(String[] args) {
        IncreasingOrderSearchTree solution = new IncreasingOrderSearchTree();

        // Example
        TreeNode5 root = new TreeNode5(5);
        root.left = new TreeNode5(3);
        root.right = new TreeNode5(6);
        root.left.left = new TreeNode5(2);
        root.left.right = new TreeNode5(4);
        root.right.right = new TreeNode5(8);
        root.left.left.left = new TreeNode5(1);
        root.right.right.left = new TreeNode5(7);
        root.right.right.right = new TreeNode5(9);

        TreeNode5 result = solution.increasingBST(root);
        System.out.print("Example Output: ");
        solution.inOrderPrint(result);
    }
}

