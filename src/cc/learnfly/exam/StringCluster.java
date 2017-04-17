package cc.learnfly.exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
牛牛有N个字符串，他想将这些字符串分类，他认为两个字符串A和B属于同一类需要满足以下条件：
A中交换任意位置的两个字符，最终可以得到B，交换的次数不限。比如：abc与bca就是同一类字符串。
现在牛牛想知道这N个字符串可以分成几类。
输入描述:

首先输入一个正整数N（1 <= N <= 50），接下来输入N个字符串，每个字符串长度不超过50。



输出描述:

输出一个整数表示分类的个数。


输入例子:

4
abcd
abdc
dabc
bacd


输出例子:

1

 */
public class StringCluster {
	public static int count(int n,String[] str){
		Set<String> set = new HashSet<>();
		for(int i =0;i<n;i++){
			char[] ch = str[i].toCharArray();
			Arrays.sort(ch);
			set.add(String.valueOf(ch));
		}
		
		return set.size();
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			int n = scan.nextInt();
			String[] str = new String[n];
			for(int i=0;i<n;i++){
				str[i] = scan.next();
			
			}
			System.out.println(count(n,str));
		}		
		scan.close();

	}

}
