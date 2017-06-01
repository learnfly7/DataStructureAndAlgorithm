package cc.learnfly.leetcode;

import java.util.Stack;

public class EvaluateReversePolishExpression {
	
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		int n = tokens.length;
		for(int i = 0; i < n; i++){
			String token = tokens[i];
			if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
				int num1 = stack.pop();
				int num2 = stack.pop();
				if(token.equals("+")){
					int temp = num1 + num2;
					stack.push(temp);
				}else if(token.equals("-")){
					int temp = num2 - num1;
					stack.push(temp);
				}else if(token.equals("*")){
					int temp = num1 * num2;
					stack.push(temp);
				}else{
					int temp = num2 / num1;
					stack.push(temp);
				}
				
			}else{
				int num = Integer.parseInt(token);
				stack.push(num);
			}
		}
		return stack.pop();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
