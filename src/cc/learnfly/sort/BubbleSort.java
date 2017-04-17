package cc.learnfly.sort;

import java.util.Random;

public class BubbleSort {
	
	public static void sort(int[] a){
		int n = a.length;
		for(int i=0;i<n-1;i++){
			for(int j=n-1;j>i;j--){
				if(a[j]<a[i]){
					swap(a,i,j);
				}
			}
		}
	}
	
	public static void swap(int[] a,int i,int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
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
