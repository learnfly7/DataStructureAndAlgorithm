package cc.learnfly.sort;

import java.util.Random;

public class HeapSort {

	public static void adjust(int[] a, int l, int r){
		int temp = a[l];
		for(int i = 2*l+1; i <= r;i=2*i+1){
			if(i < r && a[i] <= a[i+1]){
				++i;
			}
			if(temp > a[i]){
				break;
			}
			a[l] = a[i]; l=i;
		}
		a[l] = temp;
	}
	
	public static void sort(int[] a){
		int n = a.length;
		//�����һ����Ҷ�ӽڵ�n/2-1��ǰ����
		for(int i = n/2-1;i>=0;i--){
			adjust(a, i, n-1);
		}
		//���Ѷ�ѡ���ļ�¼�ŵ�������µ���0-n-1
		for(int i = n-1;i>0;--i){
			swap(a, 0, i);
			adjust(a, 0, i-1);
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
