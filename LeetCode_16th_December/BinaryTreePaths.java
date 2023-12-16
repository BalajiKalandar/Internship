package com.java.dec16;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
       this.val = x;
    }
}

public class BinaryTreePaths {
    public static void main(String[] args) {
        // Test cases
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(5);

        System.out.println(binaryTreePaths(root1));

        TreeNode root2 = new TreeNode(1);

        System.out.println(binaryTreePaths(root2));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            traverse(root, "", result);
        }
        return result;
    }

    private static void traverse(TreeNode node, String currentPath, List<String> result) {
        if (node.left == null && node.right == null) {
            // Leaf node, add the current path to the result
            result.add(currentPath + node.val);
        }

        if (node.left != null) {
            // Recursive call for the left child
            traverse(node.left, currentPath + node.val + "->", result);
        }

        if (node.right != null) {
            // Recursive call for the right child
            traverse(node.right, currentPath + node.val + "->", result);
        }
    }
}

