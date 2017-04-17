package cc.learnfly.exam;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
牛牛手里有N根木棒,分别编号为1~N,现在他从N根里想取出三根木棒，使得三根木棒构成一个三角形,你能计算出牛牛有多少种取法吗?(考虑两种取法中使用的木棒编号有一个不一样就认为是不同的取法)。
输入描述:

首先输入一个正整数N，接下来的一行共有N个正整数表示每个木棒的长度。

N ≤ 50, 木棒的长度 ≤ 10000.



输出描述:

输出一个整数表示方法数。


输入例子:

5
1 2 3 4 5


输出例子:

3
 */
public class MakeTriggle {
	
	public static int count(int n,int[] a){
		int count =0;
		Arrays.sort(a);
		for(int i =0;i<n-2;i++){
			for(int j =i+1;j<n-1;j++){
				for(int k =j+1;k<n;k++){
					if(a[i]+a[j]>a[k]){
						count++;
					}
				}
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = scan.nextInt();
			}
			System.out.println(count(n,a));
		}		
		scan.close();

	}

}
