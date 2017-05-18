package cc.learnfly.offer;

import java.util.Stack;

public class TwoStackQueue {

	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()){
    		int node = stack1.pop();
    		stack2.push(node);
    	}
    	int data = stack2.pop();
    	while(!stack2.isEmpty()){
    		int node = stack2.pop();
    		stack1.push(node);
    	}
    	return  data;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
