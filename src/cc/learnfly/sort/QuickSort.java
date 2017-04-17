package cc.learnfly.sort;

import java.util.Random;

public class QuickSort {

	public static int partition(int[] a, int low, int high){
		int l = low, h = high;
		int temp = a[l];
		while(l < h){
			while(l < h && a[h] >= temp){
				h--;
			}
			if(l < h){
				a[l] = a[h];
				l++;
			}
			
			
			while(l<h && a[l]<=temp){
				l++;
			}
			if(l <h){
				a[h] = a[l];
				h--;
			}
			
		}
		a[l]  =temp;
		return l;
		
	}
	
	public static void sort(int[] a, int l, int h){
		if(l < h){
			int i = partition(a,l,h);
			sort(a, l, i-1);
			sort(a, i+1, h);
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[1000];
		Random random = new Random();
		for(int i=0;i<1000;i++){
			a[i] = random.nextInt(100000);
		}
		sort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
