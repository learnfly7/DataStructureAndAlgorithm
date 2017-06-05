/**  
 * @Title:  FindNumsAppearOnce.java   
 * @Package cc.learnfly.offer   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年5月30日 上午10:11:20   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.offer;

/**
 * @author figo
 *
 */
public class FindNumsAppearOnce {

	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if (array == null || array.length <= 2) {
			return;
		}
		int a = 0;
		int n = array.length;
		for (int i = 0; i < n; i++) {
			a ^= array[i];
		}

		int index = 0;
		while (((a >> index) & 1) == 0) {
			index++;
		}
		int temp1 = 0, temp2 = 0;
		for (int i = 0; i < n; i++) {
			if (((array[i] >> index) & 1) == 0) {
				temp1 ^= array[i];
			} else {
				temp2 ^= array[i];
			}
		}
		num1[0] = temp1;
		num2[0] = temp2;

	}

	/**
	 * @Title: main @Description: TODO @param: @param args @return: void @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
