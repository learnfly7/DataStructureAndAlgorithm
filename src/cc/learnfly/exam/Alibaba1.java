package cc.learnfly.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Alibaba1 {
	
	public static int count(String str,String p){
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		int index1 = p.indexOf("?");
		while(index1 !=-1){
			a1.add(index1);
			index1 = p.indexOf("?",index1);
		}
		int index2 = p.indexOf("*");
		while(index2 !=-1){
			a2.add(index2);
			index2 = p.indexOf("*",index2);
		}
		for(int i=0;i<str.length();i++){
			if(a1.contains(i)){
				
			}else if(a2.contains(i)){
				
			}else{
				
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();		
			String p = scan.nextLine();
			System.out.println(count(str,p));		
		scan.close();

	}

}
