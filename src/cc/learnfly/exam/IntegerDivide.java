package cc.learnfly.exam;

import java.util.Scanner;
/**
 * 
牛牛想在[a, b]区间内找到一些数满足可以被一个整数c整除,现在你需要帮助牛牛统计区间内一共有多少个这样的数满足条件？
输入描述:

首先输入两个整数a,b,（-5*10^8 ≤ a ≤ b ≤ 5*10^8)
接着是一个正整数c（1 <= c <= 1000）



输出描述:

输出一个整数表示个数。


输入例子:

0 14 5


输出例子:

3
 */
public class IntegerDivide {
	
	public static int count(int a,int b,int c){
		//ֱ�ӱ���ʱ
		int count =0;
		if(a < 0 && b<0){
			a = Math.abs(a);
			b = Math.abs(b);
			count = a/c - b/c +1;			
		}else if(a<0 && b>=0){
			a= Math.abs(a);
			count = a/c + b/c +1;
		}else{
			if(a==0 && b==0){
				count =1;
			}else if(a == 0 && b>0){
				count = b/c +1;
			}else{
				count = b/c - a/c;
			}
			
		}
		
		
		return count;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c=  scan.nextInt();
			System.out.println(count(a,b,c));
		}		
		scan.close();

	}

}
