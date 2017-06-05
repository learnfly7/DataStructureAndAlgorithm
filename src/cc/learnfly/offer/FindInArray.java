/**  
 * @Title:  FindInArray.java   
 * @Package cc.learnfly.offer   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年5月17日 下午10:53:57   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.offer;

/**
 * @author figo
 *
 */
public class FindInArray {

	public boolean Find(int target, int [][] array) {
		int m = array.length;
		if(m == 0){
			return false;
		}
		int n = array[0].length;
		if(n == 0){
			return false;
		}
		for(int i=0;i<m;i++){
			if(array[i][0]>target){
				continue;
			}
			for(int j=0;j<n;j++){
				if(array[i][j]==target){
					return true;
				}
			}
		}
		
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
