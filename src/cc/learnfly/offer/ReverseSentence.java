/**  
 * @Title:  ReverseSentence.java   
 * @Package cc.learnfly.offer   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年5月30日 下午3:07:51   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.offer;

/**
 * @author figo
 *
 */
public class ReverseSentence {
	
	public String ReverseSentence(String str) {
		if(str == null || str.trim().equals("")){
			return  str;
		}
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = strs.length - 1; i > 0; i-- ){
        	sb.append(strs[i]).append(" ");
        }
        sb.append(strs[0]);
        return sb.toString();
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
