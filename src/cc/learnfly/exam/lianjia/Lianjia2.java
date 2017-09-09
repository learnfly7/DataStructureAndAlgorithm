package cc.learnfly.exam.lianjia;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lianjia2 {
	public static void distinct(int n, int[] a){
		if(a == null || a.length == 0){
			return;
		}
		Arrays.sort(a);
		Set<Integer> set = new TreeSet<>();
		for(int i = 0; i < n ; i++){
			set.add(a[i]);
		}
		int count = set.size();
		System.out.println(count);
		int i = 0;
		for(Integer num: set){
			System.out.print(num);
			i++;
			if(i != count){
				System.out.print(" ");
			}
		}
	}
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] a = new int[n];
			for(int i = 0 ; i < n ; i++){
				a[i] = scan.nextInt();
			}
			distinct(n,a);
		}
		scan.close();
		
	}

}
