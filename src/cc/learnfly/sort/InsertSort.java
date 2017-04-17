package cc.learnfly.sort;

import java.util.Random;

public class InsertSort {
	public static void sort(int[] a){
		int n = a.length;
		for(int i =1;i<n;i++){
			int temp = a[i];
			int j =i;
			for(;j>0 && a[j-1]>temp;j--){				
					a[j] = a[j-1];				
			}
			a[j]  = temp;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[1000];
		Random random = new Random();
		for(int i=0;i<1000;i++){
			a[i] = random.nextInt(100000);
		}
		sort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
