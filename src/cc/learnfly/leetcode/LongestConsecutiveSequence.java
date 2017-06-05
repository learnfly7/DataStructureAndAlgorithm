/**  
 * @Title:  LongestConsecutiveSequence.java   
 * @Package cc.learnfly.leetcode   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年6月5日 下午10:03:09   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author figo
 *
 */
public class LongestConsecutiveSequence {

	public int longestConsecutive(int[] num) {
        if(num == null || num.length == 0){
        	return 0;
        }
        int count = 1;
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int n : num){
        	map.put(n, false);
        }
        for(int n : num){
        	int temp = 1;
            if(map.containsKey(n) && map.get(n) == false){
            	map.put(n,true);
            	int prev = n -1, post = n + 1;
            	while(map.containsKey(prev)){
            		map.put(prev, true);
            		temp++;
            		prev--;
            		
            	}
            	while(map.containsKey(post)){
            		map.put(post, true);
            		temp++;
            		post++;
            	}
            }
            
            count = Math.max(temp, count);
        }
        return count;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
		lcs.longestConsecutive(new int[]{1,2,0,1});
	}

}
