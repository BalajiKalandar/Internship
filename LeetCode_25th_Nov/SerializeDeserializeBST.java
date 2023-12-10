package com.java.timest;

import java.util.Arrays;
import java.util.LinkedList;

class TreeNode1 {
    int val;
    TreeNode1 left, right;

    TreeNode1(int val) {
        this.val = val;
    }
}

public class SerializeDeserializeBST {

    // Serialization
    public String serialize(TreeNode1 root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private void serializeHelper(TreeNode1 node, StringBuilder sb) {
        if (node == null) {
            sb.append("null").append(",");
            return;
        }

        sb.append(node.val).append(",");
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    // Deserialization
    public TreeNode1 deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }

        LinkedList<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return deserializeHelper(nodes);
    }

    private TreeNode1 deserializeHelper(LinkedList<String> nodes) {
        String val = nodes.removeFirst();
        if (val.equals("null")) {
            return null;
        }

        TreeNode1 node = new TreeNode1(Integer.parseInt(val));
        node.left = deserializeHelper(nodes);
        node.right = deserializeHelper(nodes);
        return node;
    }

    public static void main(String[] args) {
        SerializeDeserializeBST solution = new SerializeDeserializeBST();

        // Example 1
        TreeNode1 root1 = new TreeNode1(2);
        root1.left = new TreeNode1(1);
        root1.right = new TreeNode1(3);

        String serialized1 = solution.serialize(root1);
        System.out.println("Serialized BST 1: " + serialized1);

        TreeNode1 deserialized1 = solution.deserialize(serialized1);
        System.out.println("Deserialized BST 1: " + solution.serialize(deserialized1));

        // Example 2
        TreeNode1 root2 = null;

        String serialized2 = solution.serialize(root2);
        System.out.println("Serialized BST 2: " + serialized2);

        TreeNode1 deserialized2 = solution.deserialize(serialized2);
        System.out.println("Deserialized BST 2: " + solution.serialize(deserialized2));
    }
}

