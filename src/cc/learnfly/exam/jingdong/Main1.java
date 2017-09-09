package cc.learnfly.exam.jingdong;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
	
	public static void count(String str){
		int n = str.length();
		Stack<String>  s = new Stack<>();
		int i = 0;
		int result = -1;
		while(i < n){
			if(str.charAt(i) == '('){
				s.push(String.valueOf(str.charAt(i)));
			}else{
				int len = s.size();
				if(result == -1){
					result = 1;
				}
				result *= len;
				s.pop();
			}
			i++;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		count(str);
	}

}
/*
public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int n = str.length();
		Stack<String>  s = new Stack<>();
		int i = 0;
		int result = -1;
		while(i < n){
			if(str.charAt(i) == '('){
				s.push(String.valueOf(str.charAt(i)));
			}else{
				int len = s.size();
				if(result == -1){
					result = 1;
				}
				result *= len;
				s.pop();
			}
			i++;
		}
		System.out.println(result);
	}

}*/
