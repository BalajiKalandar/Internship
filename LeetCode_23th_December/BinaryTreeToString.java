package com.java.dec23;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class BinaryTreeToString {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(t.val);

        if (t.left != null || t.right != null) {
            sb.append("(");
            sb.append(tree2str(t.left));
            sb.append(")");

            if (t.right != null) {
                sb.append("(");
                sb.append(tree2str(t.right));
                sb.append(")");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        BinaryTreeToString solution = new BinaryTreeToString();

        // Example 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        String result1 = solution.tree2str(root1);
        System.out.println("Example 1: " + result1); // Output: "1(2(4))(3)"

        // Example 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        String result2 = solution.tree2str(root2);
        System.out.println("Example 2: " + result2); // Output: "1(2()(4))(3)"
    }
}

