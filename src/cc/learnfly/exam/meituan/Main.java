package cc.learnfly.exam.meituan;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void count(int n, int[] a, int k){
		int [] sum = new int[n + 1];
		sum[0] = 0;
		for(int i = 0;i < n;i++){
			sum[i + 1] = (sum[i] + a[i]) % k;
			
		}
		int len = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i= 0; i < n + 1;i++){
			if(!map.containsKey(sum[i])){
				map.put(sum[i], i);
			}else{
				len = Math.max(len, i - map.get(sum[i]));
			}
		}
		System.out.println(len);
		
	}
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int [] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = scan.nextInt();
			}
			int k = scan.nextInt();
			
			count(n,a,k);
		}
		scan.close();
		
	}

}
