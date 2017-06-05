/**  
 * @Title:  Sum_Solution.java   
 * @Package cc.learnfly.offer   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年5月30日 下午4:24:12   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.offer;

/**
 * @author figo
 *
 */
public class Sum_Solution {
	
	public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (sum > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }

	/**   
	 * @Title: main   
	 * @Description: TODO  
	 * @param: @param args      
	 * @return: void      
	 * @throws   
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {};
		int n = a.length;
		System.out.println(n);
	}

}
