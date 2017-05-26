package cc.learnfly.offer;

import java.util.Stack;

public class IsPopOrder {

	public  boolean IsPopOrder(int [] pushA,int [] popA) {
		if(pushA.length == 0 || popA.length == 0){
			return false;
		}
		int index = 0;
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<pushA.length;i++){
			s.push(pushA[i]);
			while(!s.empty() && s.peek() == popA[index]){
				s.pop();
				index++;
			}
		}
		return s.empty();
	      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,3,5,1,2};
		//System.out.println(IsPopOrder(pushA, popA));
	}

}
