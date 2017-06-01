package cc.learnfly.leetcode;

public class MinimumDepthOfBinaryTree {
	public int run(TreeNode root) {
		if(root == null){
			return 0;
		}
		if(root.left == null || root.right == null){
			return 1 + run(root.left) + run(root.right);
		}
		return Math.min(run(root.left), run(root.right)) + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}