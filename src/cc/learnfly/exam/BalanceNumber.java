package cc.learnfly.exam;

import java.util.Scanner;
/**
 * 
牛牛在研究他自己独创的平衡数，平衡数的定义是：将一个数分成左右两部分，分别成为两个新的数。
左右部分必须满足以下两点：
1，左边和右边至少存在一位。
2，左边的数每一位相乘如果等于右边的数每一位相乘，则这个数称为平衡数。
例如：1221这个数，分成12和21的话，1*2=2*1，则称1221为平衡数，再例如：1236这个数，可以分成123和1*2*3=6，所以1236也是平衡数。而1234无论怎样分也不满足平衡数。
输入描述:

输入一个正整数（int范围内）。



输出描述:

如果该数是平衡数，输出 "YES", 否则输出 "NO"。


输入例子:

1221
1234


输出例子:

YES
NO
 */
public class BalanceNumber {
	
	public static String count(int n){
		char[]  a = String.valueOf(n).toCharArray();
		int len = a.length;
		int[] b = new int[len];
		for(int i=0;i<len;i++){
			b[i] = a[i]-'0';
		}
		for(int i =0;i<len-1;i++){
			//�������
			int left = b[i];
			int right = b[i+1];
			for(int j=i-1;j>=0;j--){
				left *= b[j];
			}
			for(int j=i+2;j<len;j++){
				right *= b[j];
			}
			if(left == right){
				return "YES";
			}
			//�����Ҳ�
		}
		return "NO";
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();			
			System.out.println(count(n));
		}		
		scan.close();

	}

}
