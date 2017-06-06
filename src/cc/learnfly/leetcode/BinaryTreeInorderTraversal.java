package cc.learnfly.leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	/*public ArrayList<Integer> list = new ArrayList<>();
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
        	return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
        
    }*/
	
	/**
	 * 
	 * 非递归
	 *
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null){
			return list;
		}
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(node != null && !stack.isEmpty()){
        	while(node != null){
        		stack.push(node);
        		node = node.left;
        	}
        	
        		node = stack.pop();
        		list.add(node.val);
        		node = node.right;
        	
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
