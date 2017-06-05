/**  
 * @Title:  LastRemaining_Solution.java   
 * @Package cc.learnfly.offer   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年5月30日 下午4:15:49   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.offer;

import java.util.ArrayList;

/**
 * @author figo
 *
 */
public class LastRemaining_Solution {
	public int LastRemaining_Solution(int n, int m) {
        if(n == 0){
        	return -1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
        	list.add(i);
        }
        int index = (m - 1) % n;
        while(list.size() > 1){
        	list.remove(index);
        	index = (index + (m - 1)) % list.size();
        }
        return list.get(0);
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
