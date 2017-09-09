package cc.learnfly.exam.lianjia;

import java.util.Scanner;

public class Lianjia1 {
	public static void count(int n, int[] a, int q, int[] b){
		int [] sum = new int[n];
		sum[0] = a[0];
		for(int i = 1;i < n;i++){
			sum[i] = sum[i-1] + a[i];
			
		}
		for(int i =0;i < q;i++){
			int index = 0;
			while(b[i] > sum[index]){
				index++;
			}
				System.out.println(index+1);
		}
		
	}
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int [] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = scan.nextInt();
			}
			int q = scan.nextInt();
			int  [] b = new int[q];
			for(int i = 0; i < q; i++){
				b[i] = scan.nextInt();
			}
			count(n,a,q,b);
		}
		scan.close();
		
	}

}
