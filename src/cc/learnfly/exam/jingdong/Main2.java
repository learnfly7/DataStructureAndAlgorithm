package cc.learnfly.exam.jingdong;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
	
	public static void count(int n){
		if(n == 1){
			System.out.println(1);
		}
		int[] a = new int[n + 1];
		a[1] = 1; a[2] = 6;
		for(int i = 3; i <= n; i++){
			a[i] =a[i-1]+ 3*(n - 1) + n ;
			for(int j = 2; j <= i; j++){
				for(int k = 2; k <= i; k++){
					if(Math.pow(j, k) == i){
						a[i]+=2;
					}
				}
				
			}
			if(a[i] > 1000000007){
				a[i] %= 1000000007;
			}
			
		}
		System.out.println(a[n]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		count(n);
	}

}
 