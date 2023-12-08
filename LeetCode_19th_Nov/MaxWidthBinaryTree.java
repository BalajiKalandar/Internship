package com.java.dec19Nov;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int val;
	TreeNode left,right;
	TreeNode(int val){
		this.val=val;
	}
}
public class MaxWidthBinaryTree {
	public static void main(String[] args) {
		 TreeNode root1=new TreeNode(1);
		 root1.left= new TreeNode(3);
		 root1.right=new TreeNode(2);
		 root1.left.left=new TreeNode(5);
		 root1.left.right=new TreeNode(3);
		 root1.right.right=new TreeNode(9);
		 
		 System.out.println(widthOfBinaryTree(root1));
	}
	
	public static int widthOfBinaryTree(TreeNode root) {
		if(root==null) {
			return 0;
		}
		
		int maxWidth=0;
		Queue<TreeNode> queue= new LinkedList<>();
		Queue<Integer> indexQueue =new LinkedList<>();
		queue.offer(root);
		indexQueue.offer(1);
		
		while(!queue.isEmpty()) {
			int levelSize=queue.size();
			int start=indexQueue.peek();
			
			
			for(int i=0;i<levelSize;i++) {
				TreeNode node=queue.poll();
				int index = indexQueue.poll();
				
				if(node.left!=null) {
					queue.offer(node.left);
					indexQueue.offer(2*index);
				}
				if(node.right !=null) {
					queue.offer(node.right);
					indexQueue.offer(2*index+1);
				}
			}
			
			int width =indexQueue.isEmpty() ?0:indexQueue.peek()-start+1;
			maxWidth=Math.max(maxWidth ,width);
					
		}
		return maxWidth;
	}

	
}


