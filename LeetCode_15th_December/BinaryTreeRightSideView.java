package com.java.dec15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (i == levelSize - 1) {
                    result.add(node.val);  // Add the last element of each level
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

        // Example 1:
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(4);

        System.out.println(solution.rightSideView(root1));  // Output: [1, 3, 4]

        // Example 2:
        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(3);

        System.out.println(solution.rightSideView(root2));  // Output: [1, 3]

        // Example 3:
        TreeNode root3 = null;

        System.out.println(solution.rightSideView(root3));  // Output: []
    }
}
