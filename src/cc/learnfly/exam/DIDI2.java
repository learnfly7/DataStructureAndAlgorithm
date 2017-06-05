
package cc.learnfly.exam;

import java.util.HashMap;
import java.util.Scanner;

public class DIDI2 {
	private static HashMap<Integer, String> map = new HashMap<Integer, String>() {
		{
		put(2, "abc");  
	    put(3, "def");
	    put(4, "ghi");
	    put(5, "jkl");
	    put(6, "mno");
	    put(7, "pqrs");
	    put(8, "tuv");
	    put(9, "wxyz");
	    }
	};

	public static String count(String[] strs,int n) {
		int index = 0;
		int max = 0;
		int len = strs.length;
		int a = n/100;
		int b = (n-a*100)/10;
		int c = (n-a*100-b*10);
		String a1 = map.get(a);
		String a2 = map.get(b);
		String a3 = map.get(c);
		
		
		for(int i=0;i<len;i++){	
			for(int j1=0;j1<a1.length();j1++){
				
				for(int j2=0;j2<a2.length();j2++){
					for(int j3=0;j3<a3.length();j3++){
						String temp = a1.charAt(j1)+""+a2.charAt(j3)+""+a3.charAt(j3);
						if(commonSequence(strs[i], temp)>max){
							index = i;
						}
					}
				}
			}
			
		}
		return strs[index];
		
		}
	  
	public static int commonSequence(String str1, String str2) { 
		int n= str1.length();
		int m = str2.length();
        int[][] a = new int[n+1][m + 1];            
        for (int i = 0; i <= n; i++) {  
            a[i][0] = 0;  
        }          
        for (int j = 0; j <= m; j++) {  
            a[0][j] = 0;  
        }  
          
        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= m; j++) {  
                if (str1.charAt(i-1) == str2.charAt(j-1)) {  
                    a[i][j] = a[i-1][j-1] + 1;  
                } else { 
                	if(a[i][j-1]>a[i-1][j]){
                		a[i][j] = a[i][j-1];
                	}else{
                		a[i][j] = a[i-1][j];
                	}
                }  
            }  
        }  
          
        return a[n][m];  
    }  
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     String str = sc.nextLine();
	     int n = sc.nextInt();
	     String[] strs = str.split(" ");
	     System.out.println(count(strs,n));
	     sc.close();
	}

}
