package cc.learnfly.exam;

import java.util.Scanner;
/**
牛牛在二维坐标系中画了N个点，且都是整点。现在牛牛想画出一个矩形，使得这N个点都在矩形内或者在矩形上。
矩形的边均平行于坐标轴。牛牛希望矩形的面积最小。请你帮助牛牛计算下最小矩形的面积。
输入描述:

首先输入一个正整数N表示点的个数（2 <= N <= 50）
  
接下来N行每行两个整数x, y，表示该点的坐标。绝对值均小于等于100.



输出描述:

一个整数表示最小矩形的面积。


输入例子:

2
0 1
1 0


输出例子:

1
 */
public class SmallRectangle {
	
	public static int count(int n,int[] x,int[] y){
		int minx = x[0],miny = y[0],maxx=x[0],maxy = y[0];
		for(int  i=1;i<n;i++){
			if(x[i]<minx){
				minx = x[i];
			}
			if(x[i]>maxx){
				maxx = x[i];
			}
			if(y[i]<miny){
				miny = y[i];
			}
			if(y[i]>maxy){
				maxy = y[i];
			}
		}		
		return (maxx-minx)*(maxy-miny);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for(int i=0;i<n;i++){
				x[i] = scan.nextInt();
				y[i] = scan.nextInt();
			}
			System.out.println(count(n,x,y));
		}		
		scan.close();

	}

}
