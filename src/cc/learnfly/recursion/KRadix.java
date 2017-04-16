/**  
 * @Title:  KRadix.java   
 * @Package cc.learnfly   
 * @Description:    求所有的K进制字符串  
 * @author: Schaffer chen     
 * @date:   2017年4月16日 下午7:14:20   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.recursion;

public class KRadix {

	public static void k_radix(int[] a,int n,int k){
		if(n < 1){
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]);
			}
			System.out.println();
		}else{
			for(int i=0;i<k;i++){
				a[n-1] = i;
				k_radix(a, n-1, k);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[3];
		k_radix(a, 3, 6);
	}

}
