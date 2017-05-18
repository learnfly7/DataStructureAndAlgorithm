package cc.learnfly.offer;

public class MirrorBinaryTree {

	public void Mirror(TreeNode root) {
		if(root == null){
			return;
		}
		if(root.left != null || root.right != null){
        	TreeNode temp = root.left;
        	root.left = root.right;
        	root.right = temp;
        	Mirror(root.left);
        	Mirror(root.right);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
