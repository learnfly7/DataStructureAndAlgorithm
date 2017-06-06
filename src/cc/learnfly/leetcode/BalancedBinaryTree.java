package cc.learnfly.leetcode;



public class BalancedBinaryTree {

	public boolean isBalanced(TreeNode root) {
		if(root == null){
			 return true;
		 }
		return Math.abs(treeDepth(root.left)-treeDepth(root.right)) <=1 && isBalanced(root.left) && isBalanced(root.right);
    }
	
	public int treeDepth(TreeNode root) {
		 if(root == null){
			 return 0;
		 }
		return Math.max(treeDepth(root.left), treeDepth(root.right))+1;
	        
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
