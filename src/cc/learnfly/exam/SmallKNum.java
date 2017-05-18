package cc.learnfly.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
输入描述:

每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n
不超过100。



输出描述:

输出n个整数里最小的k个数。升序输出


输入例子:

3 9 6 8 -10 7 -11 19 30 12 23 5


输出例子:

-11 -10 3 6 7
 */
public class SmallKNum {
	
	public static void KNum(Integer[] a,int n){
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
 		while(scan.hasNext()){
			int temp = scan.nextInt();
			list.add(temp);
		}
 		int n = list.remove(list.size() -1);
 		KNum(list.toArray(new Integer[list.size()]), n);
		scan.close();

	}

}
