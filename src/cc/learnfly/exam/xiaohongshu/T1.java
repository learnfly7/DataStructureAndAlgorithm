package cc.learnfly.exam.xiaohongshu;

import java.util.Scanner;

public class T1 {
	public static void reverseK(String str, int k){
		int  n = str.length();
		StringBuilder sb = new StringBuilder();
		if(n < k){
			sb.append(str).reverse();
		}else if(n < 2*k){
			sb.append(str.substring(0, k)).reverse().append(str.substring(k,n));
		}else{
			int i = 0;
			while(i < n){
				if(i+k > n){
					if((i/k)%2==0){
						StringBuilder temp = new StringBuilder(str.substring(i,n));
						sb.append(temp.reverse());
					}else{
						StringBuilder temp = new StringBuilder(str.substring(i,n));
						sb.append(temp);
					}
					break;
				}else{
					if((i/k)%2==0){
						StringBuilder temp = new StringBuilder(str.substring(i,i+k));
						sb.append(temp.reverse());
					}else{
						StringBuilder temp = new StringBuilder(str.substring(i,i+k));
						sb.append(temp);
					}
					i+=k;
				}
					
				
			}
			
		}
		System.out.println(sb.toString());
		
	} 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			int k = scan.nextInt();
			reverseK(str, k);
		}
        scan.close();
		
	}
}
