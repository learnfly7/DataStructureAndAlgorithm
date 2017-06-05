/**  
 * @Title:  Conatinuous.java   
 * @Package cc.learnfly.offer   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年5月30日 下午3:41:57   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.offer;

/**
 * @author figo
 *
 */
public class Continuous {
	
	public boolean isContinuous(int [] numbers) {
		if(numbers == null || numbers.length != 5){
			return false;
		}
		int[] a=  new int[14];
		int min = 15, max = -1;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] == 0){
				continue;
			}
			//判断有无0以外重复元素
			if(a[numbers[i]] > 0){
				return false;
			}
			a[numbers[i]]++;
			if(numbers[i] < min){
				min = numbers[i];
			}
			if(numbers[i] > max){
				max = numbers[i];
			}
		}
		if(max -min < 5){
			return true;
		}
		return false;
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
