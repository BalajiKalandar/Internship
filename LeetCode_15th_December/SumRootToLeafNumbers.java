package com.java.dec15;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
    }
}

public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int currentSum) {
        if (node == null) {
            return 0;
        }

        currentSum = currentSum * 10 + node.val;

        // If it's a leaf node, return the current number formed
        if (node.left == null && node.right == null) {
            return currentSum;
        }

        // Recursively calculate the sum for the left and right subtrees
        return dfs(node.left, currentSum) + dfs(node.right, currentSum);
    }

    public static void main(String[] args) {
        // Example usage:
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        SumRootToLeafNumbers solution = new SumRootToLeafNumbers();
        System.out.println(solution.sumNumbers(root1));  // Output: 25

        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(0);
        root2.left.left = new TreeNode(5);
        root2.left.right = new TreeNode(1);

        System.out.println(solution.sumNumbers(root2));  // Output: 1026
    }
}

