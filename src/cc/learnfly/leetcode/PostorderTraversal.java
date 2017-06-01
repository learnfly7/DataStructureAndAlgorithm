package cc.learnfly.leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class PostorderTraversal {
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null){
			return list;
		}
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode node = null;
        while(!stack.isEmpty()){
        	node = stack.peek();
        	if(node.left != null && node.left != root && node.right != root){
        		stack.push(node.left);
        	}else if(node.right != null && node.right != root){
        		stack.push(node.right);
        	}else{
        		list.add(stack.pop().val);
            	root = node;
        	}
        	
        }
        
        return list;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}

}
