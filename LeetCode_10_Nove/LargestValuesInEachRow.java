package com.java.flipDailyQuestion;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LargestValuesInEachRow {
    public static void main(String[] args) {
        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);
        root1.left.right = new TreeNode(3);
        root1.right.right = new TreeNode(9);

        System.out.println(largestValues(root1)); // Output: [1, 3, 9]

        // Example 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println(largestValues(root2)); // Output: [1, 3]
    }

    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int maxVal = Integer.MIN_VALUE;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                maxVal = Math.max(maxVal, node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(maxVal);
        }

        return result;
    }
}
