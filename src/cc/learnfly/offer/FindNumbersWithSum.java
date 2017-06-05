/**  
 * @Title:  FindNumbersWithSum.java   
 * @Package cc.learnfly.offer   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年5月30日 下午2:45:19   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.offer;

import java.util.ArrayList;

/**
 * @author figo
 *
 */
public class FindNumbersWithSum {
	
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if(array == null || array.length < 2){
        	return list;
        }
        int n = array.length;
        int left = 0, right = n - 1;
        while(left < right){
        	if(array[left] + array[right] < sum){
        		left++;
        	}else if(array[left] + array[right] > sum){
        		right --;
        	}else{
        		list.add(array[left]);
        		list.add(array[right]);
        		break;
        	}
        }
        return list;
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
