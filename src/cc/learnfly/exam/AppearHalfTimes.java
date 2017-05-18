package cc.learnfly.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
 * 输入n个整数，输出出现次数大于等于数组长度一半的数。
输入描述:

每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。



输出描述:

输出出现次数大于等于n/2的数。


输入例子:

3 9 3 2 5 6 7 3 2 3 3 3


输出例子:

3*
 */
public class AppearHalfTimes {
	
	public static void find(Integer[] a){
		Arrays.sort(a);
		if(a.length % 2 ==1){
			System.out.println(a[a.length/2]);
		}else{
			if(a[0].equals(a[a.length/2-1])){
				System.out.println(a[a.length/2-1]);
			}else{
				System.out.println(a[a.length/2]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
 		while(scan.hasNext()){
			int temp = scan.nextInt();
			list.add(temp);
		}
 		find(list.toArray(new Integer[list.size()]));
		scan.close();
	}

}
