package cc.learnfly.exam.toutiao;


import java.util.Scanner;

public class Toutiao2 {
	public static void find(int n, int[] a){
		int[] sum = new int[n];
		int[][] min = new int[n][n];
		sum[0] = a[0];
		for(int i = 1; i < n;i++){
			sum[i] = sum[i - 1] + a[i];
			min[i][i] =a[i];
		}
		min[0][0] = a[0];
		for(int i = 1; i < n; i++){
			if(a[i] < min[0][i-1]){
				min[0][i] = a[i];
			}else{
				min[0][i] = min[0][i-1];
			}
			for(int j = i+1 ; j < n ;j++){
				
				if(a[j] < min[i][j-1]){
					min[i][j] = a[j];
				}else{
					min[i][j] = min[i][j-1];
				}
			}
			
		}
		
		int max = a[0] * a[0];
		for(int i = 0; i < n ; i++){
			for(int j = i ; j < n ;j++){
				int temp  = -1;
				if(i == 0){
					temp = sum[j];
				}else{
					temp = sum[j] - sum[i - 1]; 
				}
				
				if(i == j){
					temp = a[i];
				}
				
				int result = temp * min[i][j];
				if(result > max){
					max = result;
				}
			}
		}
		System.out.println(max);
		
	}
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        	int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            find(n, a);
        }
        
    }
}

