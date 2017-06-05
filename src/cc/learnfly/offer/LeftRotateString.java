/**  
 * @Title:  LeftRotateString.java   
 * @Package cc.learnfly.offer   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年5月30日 下午2:59:52   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.offer;

/**
 * @author figo
 *
 */
public class LeftRotateString {
	
	 public String LeftRotateString(String str,int n) {
	      if(str == null || str.length() == 0){
	    	  return str;
	      }
	      int len = str.length();
	      n = n % len;
	      return (str + str).substring(n, len + n);
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
		LeftRotateString l = new LeftRotateString();
		System.out.println(l.LeftRotateString("abcXYZdef", 3));
	}

}
