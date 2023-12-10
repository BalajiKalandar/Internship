package com.java.timest;


class TreeNode4 {
	int val;
	TreeNode4 right;
	TreeNode4 left;
	TreeNode4(int val){
		this.val=val;
	}
}

public class UniqueValueBinaryTree {
public static void main(String[] args) {
	TreeNode4 root=new TreeNode4(3);
	root.left=new TreeNode4(3);
	root.left.left=new TreeNode4(3);
	root.left.left.left=new TreeNode4(3);
	root.right=new TreeNode4(3);
	root.right.right=new TreeNode4(3);
	root.right.right.right=new TreeNode4(3);
	System.out.println("Is Unique: "+ checkingUnique(root));
	
	TreeNode4 root1= new TreeNode4(2);
	root1.left= new TreeNode4(3);
	root1.left.left=new TreeNode4(3);
	root1.right=new TreeNode4(3);
	root1.right.right= new TreeNode4(3);
	System.out.println("Is Unique: "+ checkingUnique(root1));
}
public static boolean checkingUnique(TreeNode4 root) {
	return checkingUnique(root, root.val);
}

private static boolean checkingUnique(TreeNode4 node, int val) {
	if(node==null) {
		return true;
	}
	if(node.val!=val) {
		return false;
	}
	return checkingUnique(node.left, val)&&checkingUnique(node.right,val);
}

}
