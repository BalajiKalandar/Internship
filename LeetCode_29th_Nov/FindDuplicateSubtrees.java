package com.java.timest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class FindDuplicateSubtrees {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        Map<String, Integer> subtreeCount = new HashMap<>();

        // Traverse the tree to find duplicate subtrees
        findDuplicateSubtreesHelper(root, subtreeCount, result);

        return result;
    }

    private String findDuplicateSubtreesHelper(TreeNode node, Map<String, Integer> subtreeCount, List<TreeNode> result) {
        if (node == null) {
            return "#"; // Use "#" to represent null nodes in the serialization
        }

        // Serialize the subtree
        String subtreeKey = node.val + ","
                + findDuplicateSubtreesHelper(node.left, subtreeCount, result) + ","
                + findDuplicateSubtreesHelper(node.right, subtreeCount, result);

        // Update the count in the map
        subtreeCount.put(subtreeKey, subtreeCount.getOrDefault(subtreeKey, 0) + 1);

        // If count is 2, add the root of the subtree to the result
        if (subtreeCount.get(subtreeKey) == 2) {
            result.add(node);
        }

        return subtreeKey;
    }

    // Utility method to print the tree (pre-order traversal)
    private void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        FindDuplicateSubtrees solution = new FindDuplicateSubtrees();

        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.right.left = new TreeNode(2);
        root1.right.right = new TreeNode(4);
        root1.right.left.left = new TreeNode(4);

        List<TreeNode> result1 = solution.findDuplicateSubtrees(root1);
        System.out.println("Example 1 Output:");
        for (TreeNode node : result1) {
            solution.preOrderTraversal(node);
            System.out.println();
        }

        // Example 2
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(1);

        List<TreeNode> result2 = solution.findDuplicateSubtrees(root2);
        System.out.println("Example 2 Output:");
        for (TreeNode node : result2) {
            solution.preOrderTraversal(node);
            System.out.println();
        }

        // Example 3
        TreeNode root3 = new TreeNode(2);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(2);
        root3.left.right = new TreeNode(3);

        List<TreeNode> result3 = solution.findDuplicateSubtrees(root3);
        System.out.println("Example 3 Output:");
        for (TreeNode node : result3) {
            solution.preOrderTraversal(node);
            System.out.println();
        }
    }
}
