
package cc.learnfly.exam;

import java.util.Scanner;

public class DIDI1 {

	public static int count(int[][] a,int n,int m) {
		int count = 0;		
		if (a == null)	
			return 0;		
		for (int i = 0; i < n; i++) {	
			for (int j = 0; j < m; j++) {	
				if (a[i][j] == 1) {
					//每次碰到1，岛屿数量加一，并且把周围邻居变为0
					count++;					
					a = neighbor(a, i, j,n,m);			
					}			
				}		
			}		
		return count;	
		}
	
    public static int[][] neighbor(int[][] a, int i, int j,int n,int m) {  
        a[i][j] = 0;  
        //分别从四个方向找出1点
        if (i >= 1 && a[i - 1][j] == 1) {  
            a = neighbor(a, i - 1, j, n, m);  
        }
        if (i <= n - 2 && a[i + 1][j] == 1) {  
            a = neighbor(a, i + 1, j, n, m);  
        }
        if (j <= m - 2 && a[i][j + 1] == 1) {  
            a = neighbor(a, i, j + 1, n, m);  
        }  
        if (j >= 1 && a[i][j - 1] == 1) {  
            a = neighbor(a, i, j - 1, n, m);  
        }            
        return a;  
    }  
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int m = sc.nextInt();
	     int[][] a = new int[n][m];
	     for(int i=0;i<n;i++){
	    	 String strs = sc.next();
	    	 System.out.println(i);
	    	 for(int j=0;j<strs.length();j++){
	    		 if(strs.charAt(j) == '0'){
	    			 a[i][j] = 0;
	    		 }else{
	    			 a[i][j] = 1;
	    		 }
	    	 }
	     }
	     System.out.println(count(a,n,m));
	     sc.close();
	}

}
