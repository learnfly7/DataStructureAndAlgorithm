package cc.learnfly.exam.wangyi;

import java.util.Scanner;

public class Wangyi3 {
	public static int count(int n, int k){
		
		return n;
		
		
		
	}
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			System.out.println(count(n,k));
		}
		scan.close();
		
	}

}
