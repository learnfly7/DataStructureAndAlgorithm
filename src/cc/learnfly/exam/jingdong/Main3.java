package cc.learnfly.exam.jingdong;

import java.util.Scanner;
import java.util.Stack;

public class Main3 {
	
	public static void count(int n){
		int count = 0;
		for(int a = 1; a <= n; a++){
			for(int b = 1; b <= n; b++){
				for(int c = 1; c <= n; c++){
					for(int d = 1; d <= n; d++){
						if(Math.pow(a,b) == Math.pow(c, d)){
							count++;
							System.out.println(a+" "+b+" "+c+" "+d);
						}
						
						if(count >= 1000000007){
							count %= 1000000007;
						}
					}
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		count(n);
	}

}
