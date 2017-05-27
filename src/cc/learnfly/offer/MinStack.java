package cc.learnfly.offer;

import java.util.Stack;

public class MinStack {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public void push(int node) {
        s1.push(node);
        if(s2.empty()){
        	s2.push(node);
        }else{
        	if(node < s2.peek()){
        		s2.push(node);
        	}
        }
    }
    
    public void pop() {
        int data = s1.pop();
        if(data == s2.peek()){
        	s2.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int min() {
        return s2.peek();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
