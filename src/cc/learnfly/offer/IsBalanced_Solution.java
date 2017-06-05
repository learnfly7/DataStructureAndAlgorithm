/**  
 * @Title:  IsBalanced_Solution.java   
 * @Package cc.learnfly.offer   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年5月30日 上午9:54:53   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.offer;

/**
 * @author figo
 *
 */
public class IsBalanced_Solution {
	
	public boolean IsBalanced_Solution(TreeNode root) {
		if(root == null){
			 return true;
		 }
		return Math.abs(treeDepth(root.left)-treeDepth(root.right)) <=1 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
	
	 public int treeDepth(TreeNode root) {
		 if(root == null){
			 return 0;
		 }
		return Math.max(treeDepth(root.left), treeDepth(root.right))+1;
	        
	 }

}
