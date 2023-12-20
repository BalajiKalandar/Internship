package com.java.dec19;

//Definition for a binary tree node.
class TreeNode {
 int val;
 TreeNode left;
 TreeNode right;

 TreeNode(int x) {
     val = x;
 }
}

public class ConvertBSTToGreaterTree {
 private int sum = 0;

 public static void main(String[] args) {
     // Example 1
     TreeNode root1 = new TreeNode(4);
     root1.left = new TreeNode(1);
     root1.right = new TreeNode(6);
     root1.left.left = new TreeNode(0);
     root1.left.right = new TreeNode(2);
     root1.right.left = new TreeNode(5);
     root1.right.right = new TreeNode(7);
     root1.left.right.right = new TreeNode(3);
     root1.right.right.right = new TreeNode(8);

     ConvertBSTToGreaterTree converter = new ConvertBSTToGreaterTree();
     TreeNode result1 = converter.convertBST(root1);
     converter.printTree(result1);  // Output: [30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8]

     // Example 2
     TreeNode root2 = new TreeNode(0);
     root2.right = new TreeNode(1);

     TreeNode result2 = converter.convertBST(root2);
     converter.printTree(result2);  // Output: [1, null, 1]
 }

 public TreeNode convertBST(TreeNode root) {
     if (root != null) {
         // Traverse the right subtree
         convertBST(root.right);

         // Update the current node's value with the running sum
         sum += root.val;
         root.val = sum;

         // Traverse the left subtree
         convertBST(root.left);
     }

     return root;
 }

 // Helper function to print the tree in in-order traversal
 private void printTree(TreeNode root) {
     if (root != null) {
         printTree(root.left);
         System.out.print(root.val + " ");
         printTree(root.right);
     }
 }
}
