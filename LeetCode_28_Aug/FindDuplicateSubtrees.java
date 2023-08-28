package com.java.s28thdsa;

import java.util.*;

class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;
    
    TreeNode2(int val) {
        this.val = val;
    }
}

public class FindDuplicateSubtrees {
    Map<String, Integer> subtreeCount;
    List<TreeNode2> result;
    
    public List<TreeNode2> findDuplicateSubtrees(TreeNode2 root) {
        subtreeCount = new HashMap<>();
        result = new ArrayList<>();
        serialize(root);
        return result;
    }
    
    private String serialize(TreeNode2 node) {
        if (node == null) {
            return "#";
        }
        
        String left = serialize(node.left);
        String right = serialize(node.right);
        
        String subtree = node.val + "," + left + "," + right;
        subtreeCount.put(subtree, subtreeCount.getOrDefault(subtree, 0) + 1);
        
        if (subtreeCount.get(subtree) == 2) {
            result.add(node);
        }
        
        return subtree;
    }

    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(2);
        root.left.left = new TreeNode2(4);
        root.right = new TreeNode2(3);
        root.right.left = new TreeNode2(2);
        root.right.left.left = new TreeNode2(4);
        root.right.right = new TreeNode2(4);

        FindDuplicateSubtrees solution = new FindDuplicateSubtrees();
        List<TreeNode2> duplicates = solution.findDuplicateSubtrees(root);

        System.out.println("Duplicate subtrees:");
        for (TreeNode2 duplicate : duplicates) {
            solution.printTree(duplicate);
            System.out.println();
        }
    }

    private void printTree(TreeNode2 node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        printTree(node.left);
        printTree(node.right);
    }
}
