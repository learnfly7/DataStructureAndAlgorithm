package cc.learnfly.exam.pinduoduo;

import java.util.Scanner;

public class T5 {
	public static void preCreate(int n, Node[] a){
		for(int i = 0; i < n ;i++){
			for(int j = 0; j <n ;j++){
				
			}
		}
	}
	public static void printTree(int n, Node[] a, Node root, int level){
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node[] a = new Node[n];
		Node root = null;
		for(int i = 0; i < n; i++){
			int num = scan.nextInt();
			String s = scan.next();
			int p = scan.nextInt();
			Node node = new Node(num, s, p);
			a[i] = node;
			if(p == -1){
				root = node;
			}
		}
		preCreate(n, a);
		printTree(n, a, root,0);
	}

}
class Node{
	public int num;
	public String s;
	public int pNode;
	public int type;
	public Node(int num, String s, int pNode) {
		super();
		this.num = num;
		this.s = s;
		this.pNode = pNode;
	}
}
