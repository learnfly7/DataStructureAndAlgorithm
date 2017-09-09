package cc.learnfly.exam.qihu;


import java.util.Scanner;

public class Qihu2 {
	
	public static void count(int n, int [] a){
		int [] result = new int[n];
		int [] max = new int[n+1];
		max[0] = -1;max[1] = a[0];
		result[0] = 0;
		for(int i = 1; i < n; i++){
			int k = 0;
			if(a[i] < max[i]){
				for(int j = i - 1; j >= 0; j--){
					if(a[j] > a[i]){
						k++;
					}
				}
				max[i+1] = max[i];
			}else{
				max[i+1] = a[i];
			}
			
			result[i] = k;
		}
		for(int i = 0; i< n; i++){
			System.out.print(result[i]);
			if(i < n - 1){
				System.out.print(" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = scan.nextInt();
			}
			count(n, a);	
		}
			
				
		scan.close();

	}

}
