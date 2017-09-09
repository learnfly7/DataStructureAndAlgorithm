package cc.learnfly.exam.wangyi;

import java.util.Scanner;

public class Wangyi1 {
	public static int count(int x, int f, int d, int p){
		int n = d/x;
		if(n <= f){
			return n;
		}
		int rest = d - f*x;
		
		return f+rest/(p+x);
		
		
	}
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int x = scan.nextInt();
			int f = scan.nextInt();
			int d = scan.nextInt();
			int p = scan.nextInt();
			System.out.println(count(x,f,d,p));
		}
		scan.close();
		
	}

}
