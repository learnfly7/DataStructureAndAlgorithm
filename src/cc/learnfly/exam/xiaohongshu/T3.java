package cc.learnfly.exam.xiaohongshu;

import java.util.Scanner;

public class T3 {
	public static void swap(String str){
		String[] strs = str.split("->");
		int n= strs.length;
		for(int i=0;i<n-1;i+=2){
			
				System.out.print(strs[i]);
				System.out.print("->");
	
		}
		for(int i=1;i<n-1;i+=2){
			
			System.out.print(strs[i]);
			System.out.print("->");
	}
		System.out.print("NULL");
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			swap(str);
		}
        scan.close();
		
	}
	

}
