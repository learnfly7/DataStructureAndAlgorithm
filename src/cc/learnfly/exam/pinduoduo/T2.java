package cc.learnfly.exam.pinduoduo;

import java.util.Stack;

public class T2 {
	
	public static boolean check(String str){
		Stack<Character> stack = new Stack<>();
		if(str == null){
			return false;
		}
		int n = str.length();
		//level表示括号优先级，1为小括号，2为中括号，3为大括号
		int level = 0;
		for(int i = 0;i< n;i++){
			if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
				stack.push(str.charAt(i));
			}
			if(str.charAt(i) == ')' ){
				if(stack.peek() == '(' && level == 0){
					stack.pop();
					level =1;
				}else{
					return false;
				}
			}
			if(str.charAt(i) == ']'){
				if(stack.peek() == '[' && level == 1){
					stack.pop();
					level =2;
				}else{
					return false;
				}
			}
			if(str.charAt(i) == '}'){
				//大括号可以连续
				if(stack.peek() == '{' && (level == 2 || level ==3)){
					stack.pop();
					level =3;
				}else{
					return false;
				}
			}
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("(()),[[()]]"));
	}

}
