package cc.learnfly.leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversal {
	
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null){
			return list;
		}
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode node = null;
        while(!stack.isEmpty()){
        	node = stack.pop();
        	list.add(node.val);
        	if(node.right != null){
        		stack.push(node.right);
        	}
        	if(node.left != null){
        		stack.push(node.left);
        	}
        	
        }
        
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
