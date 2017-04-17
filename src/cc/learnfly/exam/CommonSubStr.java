package cc.learnfly.exam;

import java.util.Scanner;
/**
 * 
牛牛有两个字符串（可能包含空格）,牛牛想找出其中最长的公共连续子串,希望你能帮助他,并输出其长度。
输入描述:

输入为两行字符串（可能包含空格），长度均小于等于50.



输出描述:

输出为一个整数，表示最长公共连续子串的长度。


输入例子:

abcde
abgde


输出例子:

2
 */
public class CommonSubStr {
	
	public static int count(String str1,String str2){
		char[] a1 = str1.toCharArray();
		char[] a2 = str2.toCharArray();
		int n1 = a1.length,n2 = a2.length;
		int[][] a = new int[n1][n2];
		int max = 0;
		//��ʼ����һ�к͵�һ��
		for(int i=0;i<n1;i++){
			if(a1[i] == a2[0]){
				a[i][0] = 1;
				max =1;
			}
		}
		for(int i=0;i<n2;i++){
			if(a2[i] == a1[0]){
				a[0][i] = 1;
				max=1;
			}
		}
		for(int i=1;i<n1;i++){
			for(int k=1;k<n2;k++){
				if(a1[i] == a2[k]){
					a[i][k] = a[i-1][k-1]+1;
					if(a[i][k]>max){
						max = a[i][k];
					}
				}
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str1 = scan.nextLine();
			String str2 = scan.nextLine();
			System.out.println(count(str1,str2));
		}		
		scan.close();

	}

}
