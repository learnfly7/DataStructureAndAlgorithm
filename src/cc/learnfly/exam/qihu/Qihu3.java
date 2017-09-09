package cc.learnfly.exam.qihu;


import java.util.Scanner;

public class Qihu3 {
	
	public static void count(int n, int [] a, int m, int[] b){
		int sumA = 0, sumB = 0;
		int minus = 0;
		for(int i = 0; i < n; i++){
			sumA += a[i];
		}
		for(int i = 0; i< m; i++){
			sumB += b[i];
		}
		minus = sumA - sumB;
		while(minus != 0){
			int result = 0;
			int index1 = 0, index2 = 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j< m;j++){
					int temp = a[i] - b[j];
					if(Math.abs(minus - 2 * result) > Math.abs(minus - 2 * temp)){
						result = temp;
						index1 = i; index2 = j;
					}
				}
			}
			if(result == 0){
				
				 break;
			}
			int t = a[index1]; a[index1] = b[index2]; b[index2] = t;
			sumA -= result; sumB += result;
			minus = sumA - sumB;
		}
		System.out.println(Math.abs(minus));
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = scan.nextInt();
			}
			int m = scan.nextInt();
			int[] b = new int[n];
			for(int i = 0; i < m; i++){
				b[i] = scan.nextInt();
			}
			count(n, a, m, b);	
		}
			
				
		scan.close();

	}

}
