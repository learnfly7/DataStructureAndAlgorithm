package cc.learnfly.recursion;
/**  
 * @Title:  HanoiTowers.java   
 * @Package cc.learnfly   
 * @Description:    汉诺塔   
 * @author: Schaffer chen     
 * @date:   2017年4月16日 下午6:58:13   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
public class HanoiTowers {
	/**
	 * 
	 * @Title: hanoiTowers   
	 * @Description: TODO  
	 * @param: @param n 圆盘数量
	 * @param: @param from 要移动的柱子
	 * @param: @param to 目标柱子
	 * @param: @param temp   辅助柱子  
	 * @return: void      
	 * @throws
	 */
	public static void hanoiTowers(int n,String from,String to,String temp){
		if(n == 1){
			System.out.println("移动圆盘：从" + from +"到"+ to);
			return;
		} 
		//利用辅助柱子，把上面的n-1圆盘从原柱子移动到辅助柱子
		hanoiTowers(n-1, from, temp,to );
		System.out.println("移动圆盘从" + from +"到"+ to);
		//利用辅助柱子，把上面的n-1圆盘从原柱子移动到辅助柱子
		hanoiTowers(n-1, temp, to, from);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoiTowers(3, "A", "B", "C");
	}

}
