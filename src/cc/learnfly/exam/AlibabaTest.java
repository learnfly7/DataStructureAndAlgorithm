package cc.learnfly.exam;

import java.util.*;
public class AlibabaTest {
/** 请完成下面这个函数，实现题目要求的功能 **/
/** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    public static int pick(int[] peaches) {
    	if(peaches == null || peaches.length == 0){
    		return 0;
    	}
    	int n = peaches.length;
    	int[] b = Arrays.copyOf(peaches, n);
    	Arrays.sort(peaches);
    	int [][] m = new int[n][n];
    	for(int i = 1; i < n; i++){
    		for(int j = 1; j < n; j++){
    			if(peaches[i] == b[j]){
    				m[i][j] = m[i - 1][j - 1] + 1;
    			}else{
    				m[i][j] = Math.max(m[i - 1][j], m[i][j - 1]);
    			}
    		}
    	}
		return m[n - 1][n - 1] + 1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        	int trees = in.nextInt();
            int[] peaches = new int[trees];
            for (int i = 0; i < peaches.length; i++) {
                peaches[i] = in.nextInt();
            }
            System.out.println(pick(peaches));
        }
        
    }
}
