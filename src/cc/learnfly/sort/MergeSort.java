package cc.learnfly.sort;

import java.util.Random;

public class MergeSort {

	public static int[] sort(int[] a , int low ,int high){
		int  mid = (low+high)/2;
		if(low < high){
			sort(a,low,mid);
			sort(a,mid+1,high);
			merge(a,low,mid,high);
		}
		return a;		
	}
	
	public static void merge(int[] a, int low, int mid, int high){
		//
		int[] b = new int[high-low+1];
		int l = low;
		int r = mid + 1;
		int k =0;
		while(l < mid && r < high){
			if(a[l]<a[r]){
				b[k] = a[l];
				l++;
				k++;
			}else{
				b[k] = a[r];
				r++;
				k++;
			}
		}
		
		while(l <= mid){
			b[k] = a[l];
			l++;
			k++;
		}
		
		while(r<=high){
			b[k] = a[r];
			r++;
			k++;
		}
		
		for(int m=0;m<b.length;m++){
			a[m+low] = b[m];
		}
	}
	public static void main(String[] args) {
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
