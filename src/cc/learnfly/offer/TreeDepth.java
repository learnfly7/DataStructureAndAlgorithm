package cc.learnfly.offer;

public class TreeDepth {

	 public int TreeDepth(TreeNode root) {
		 if(root == null){
			 return 0;
		 }
		return Math.max(TreeDepth(root.left), TreeDepth(root.right))+1;
	        
	 }
}
