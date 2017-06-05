/**  
 * @Title:  FindContinuousSequence.java   
 * @Package cc.learnfly.offer   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年5月30日 下午12:18:26   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.offer;

import java.util.ArrayList;

/**
 * @author figo
 *
 */
public class FindContinuousSequence {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
		if(sum <= 1){
			return lists;
		}
		int left = 1, right = 2;
		while(left < sum/2+1 && left < right){
			int n = right -left;
			int temp = (n + 1) * left + n * (n + 1) / 2;
			if(temp < sum){
				right++;
			}else if(temp > sum){
				left++;
			}else{
				ArrayList<Integer> list = new ArrayList<>();
				for(int i = left; i <= right; i++){
					list.add(i);
				}
				lists.add(list);
				left++;
			}
		}
		return lists;
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

	}

}
