/**  
 * @Title:  SumRoottoLeafNumbers.java   
 * @Package cc.learnfly.leetcode   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年6月5日 下午9:58:23   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.leetcode;

/**
 * @author figo
 *
 */
public class SumRoottoLeafNumbers {

	public int sumNumbers(TreeNode root) {
        int sum = 0;
        return preOrder(root, sum);
    }
	public int preOrder(TreeNode root, int sum){
		if(root == null){
			return 0;
		}
		sum = sum * 10 + root.val;
		if(root.left == null && root.right == null){
			return sum;
		}
		return preOrder(root.left, sum) + preOrder(root.right, sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
