/**  
 * @Title:  BestTimetoBuyandSellStock.java   
 * @Package cc.learnfly.leetcode   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年6月5日 下午10:38:42   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.leetcode;

/**
 * @author figo
 *
 */
public class BestTimetoBuyandSellStock {

	public int maxProfit(int[] prices) {
		if(prices == null || prices.length ==0){
			return 0;
		}
		int n = prices.length;
		int max = 0;
		int min = prices[0];
		for(int i = 0; i < n; i++){
			min = Math.min(min, prices[i]);
			max = Math.max(max, prices[i] - min);
		}
		return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
