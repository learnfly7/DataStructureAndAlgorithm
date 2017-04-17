package cc.learnfly.exam;

import java.util.Scanner;

public class CutGrid {
	
	public static int count(int n,int t,int c,int[] a){
		int count =0;
		int sum = 0;
		for(int i=0;i<n;i++){
			sum += a[i];
			if(i>c-1){
				sum -= a[i-c];
				if(sum<=t){
					count++;
				}
			}else if(i == c-1){				
				if(sum <=t){
					count++;
				}
			}
			
		}
		return count;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int t = scan.nextInt();
			int c = scan.nextInt();
			int[] a= new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			System.out.println(count(n, t, c, a));
		}		
		scan.close();

	}

}
