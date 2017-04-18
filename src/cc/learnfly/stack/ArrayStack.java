package cc.learnfly.stack;

public class ArrayStack {
	private int top;
	private int capacity;
	private int[] array;
	
	public ArrayStack(int capacity){
		this.top = -1;
		this.capacity = capacity;
		array = new int[capacity];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == capacity - 1;
	}
	
	public void push(int data){
		if(!isFull()){
			array[++top] = data;
		}
	}
	
	public int pop(){
		if(!isEmpty()){
			return array[top--];
		}else{
			System.out.println("Stack is Empty");
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
