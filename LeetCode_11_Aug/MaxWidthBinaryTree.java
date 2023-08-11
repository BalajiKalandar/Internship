package com.java.flip11thAugust;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MaxWidthBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxWidth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        root.val = 0;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int left = queue.peek().val;
            int right = left;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                right = node.val;

                if (node.left != null) {
                    node.left.val = node.val * 2;
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    node.right.val = node.val * 2 + 1;
                    queue.offer(node.right);
                }
            }

            maxWidth = Math.max(maxWidth, right - left + 1);
        }

        return maxWidth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        MaxWidthBinaryTree maxWidthBinaryTree = new MaxWidthBinaryTree();
        int maxWidth = maxWidthBinaryTree.widthOfBinaryTree(root);
        System.out.println("Maximum Width of Binary Tree: " + maxWidth);
    }
}

