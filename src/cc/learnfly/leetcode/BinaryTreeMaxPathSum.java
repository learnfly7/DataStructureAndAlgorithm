package cc.learnfly.leetcode;

public class BinaryTreeMaxPathSum {
	private int max = Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
		if(root == null){
			return 0;
		}
		maxSum(root);
		return max;
        
    }
	
	public int maxSum(TreeNode node){
		if(node == null){
			return 0;
		}
		int l = Math.max(0, maxSum(node.left));
		int r = Math.max(0, maxSum(node.right));
		max = Math.max(max, l + r + node.val);
		return Math.max(l, r) + node.val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
