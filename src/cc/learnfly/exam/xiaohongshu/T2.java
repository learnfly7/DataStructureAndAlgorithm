package cc.learnfly.exam.xiaohongshu;

import java.util.Scanner;

public class T2 {


	public static int find(int[] a,int k) {
			int sum = 0;
			for(int i=0; i<k;i++){
				sum+=a[i];
			}
			int max = 0,left=0,right =0;;
			for(int r=k-1;r>0;r--){
				int temp = sum;
				for(int l=0;l<r;l++){
					int cnt = r - l + 1;
					if(cnt<=max)break;
					if(cnt % 2 == 0 && temp * 2 == cnt){
						max = cnt; left=l; right=r;
						break;
					}
					temp -= a[l];
				}
				sum -= a[r];
			}
			return right-left+1;
		}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int k = scan.nextInt();
			int[] a = new int[k];
			for(int i=0;i<k;i++){
				a[i]= scan.nextInt();
			}
			System.out.println(find(a,k));
		}
        scan.close();
		
	}
}
