package cc.learnfly.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 
普通二叉树相关操作
 */
public class BinaryTree {
	
	public Node root = null;
	
	
	public BinaryTree(Node root) {
		super();
		this.root = root;
	}


	public static void preOrder(Node root){
		if(root != null){
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
		System.out.println();
	}
	/**
	 * 
	 * 非递归前序遍历
	 *
	 * @param root
	 */
	public static void preOrderWithoutRecurision(Node root){
		if(root != null){
			Stack<Node> stack = new Stack<>();
			while(true){
				while(root != null){
					System.out.print(root.data + " ");
					stack.push(root);
					root = root.left;
				}
				if(stack.isEmpty()){
					break;
				}
				root = stack.pop();
				root = root.right;
			}
			System.out.println();
		}
	}
	
	public static void levelOrder(Node root){
		if(root != null){
			Node temp = root;
			Queue<Node> queue = new LinkedList<>();
			queue.offer(root);
			while(!queue.isEmpty()){
				temp = queue.poll();
				System.out.print(temp.data + " ");
				if(temp.left != null){
					queue.offer(temp.left);
				}
				if(temp.right != null){
					queue.offer(temp.right);
				}
			}
			queue = null;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root  = new Node(1);
		Node node2  = new Node(2);
		Node node3  = new Node(3);
		Node node4  = new Node(4);
		Node node5  = new Node(5);
		Node node6  = new Node(6);
		Node node7  = new Node(7);
		
		root.left = node2;
		root.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		node3.left = node6;
		node3.right = node7;
		
		preOrderWithoutRecurision(root);
		levelOrder(root);
	}

}
