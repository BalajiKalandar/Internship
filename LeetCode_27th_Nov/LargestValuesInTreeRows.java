package com.java.timest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode2 {
    int val;
    TreeNode2 left, right;

    TreeNode2(int val) {
        this.val = val;
    }
}

public class LargestValuesInTreeRows {

    public List<Integer> largestValues(TreeNode2 root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode2> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                TreeNode2 node = queue.poll();
                max = Math.max(max, node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(max);
        }

        return result;
    }

    public static void main(String[] args) {
        LargestValuesInTreeRows solution = new LargestValuesInTreeRows();

        // Example 1
        TreeNode2 root1 = new TreeNode2(1);
        root1.left = new TreeNode2(3);
        root1.right = new TreeNode2(2);
        root1.left.left = new TreeNode2(5);
        root1.left.right = new TreeNode2(3);
        root1.right.right = new TreeNode2(9);

        List<Integer> result1 = solution.largestValues(root1);
        System.out.println("Example 1 Output: " + result1);

        // Example 2
        TreeNode2 root2 = new TreeNode2(1);
        root2.left = new TreeNode2(2);
        root2.right = new TreeNode2(3);

        List<Integer> result2 = solution.largestValues(root2);
        System.out.println("Example 2 Output: " + result2);
    }
}

