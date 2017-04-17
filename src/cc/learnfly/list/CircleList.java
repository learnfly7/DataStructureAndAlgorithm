/**  
 * @Title:  CircleList.java   
 * @Package cc.learnfly.list   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017��4��16�� ����7:21:07   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.list;

public class CircleList {

	/**
	 * 
	 * 求循环链表长度
	 *
	 * @param head
	 * @return
	 */
	public static int circleListLength(CircleNode head){
		int length = 0;
		CircleNode temp = head;
		while(temp != null){
			length++;
			temp = temp.next;
			if(temp == head){
				break;
			}
		}
		return length;
	}
	
	public static void printCircleList(CircleNode head){
		CircleNode temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
			if(temp == head){
				break;
			}
		}
		System.out.println();
	}
	/**
	 * 
	 * 在循环链表尾插入节点
	 *
	 * @param head
	 * @param insertNode
	 */
	public static void insertNodeAtEnd(CircleNode head,CircleNode insertNode){
		CircleNode temp = head;
		while(temp.next != head){
			temp = temp.next;
		}
		insertNode.next = insertNode;
		if(head == null){
			head = insertNode;
		}else{
			insertNode.next = head;
			temp.next = insertNode;
		}
	}
	/**
	 * 
	 * 在循环链表头插入节点
	 *
	 * @param head
	 * @param insertNode
	 */
	public static void insertNodeAtStart(CircleNode head,CircleNode insertNode){
		CircleNode temp = head;
		while(temp.next != head){
			temp = temp.next;
		}
		insertNode.next = insertNode;
		if(head == null){
			head = insertNode;
		}else{
			insertNode.next = head;
			temp.next = insertNode;
			head = insertNode;
		}
	}
	/**
	 * 
	 * 在链表尾删除节点
	 *
	 * @param head
	 */
	public static void deleteAtEnd(CircleNode head){
		CircleNode temp = head;
		CircleNode current = head;
		if(head == null){
			return;
		}
		while(temp.next != head){
			current = temp;
			temp = temp.next;
		}
		current.next = head;
		temp = null;
	}
	/**
	 * 
	 * 在表头删除节点
	 *
	 * @param head
	 */
	public static void deleteAtStart(CircleNode head){
		CircleNode temp = head;
		if(head == null){
			return;
		}
		while(temp.next != head){
			temp = temp.next;
		}
		temp.next = head.next;
		head = head.next;
	}
	public static void main(String[] args) {
		CircleNode head = new CircleNode(1);
		head.next = head;
		for(int i=0;i<10;i++){
			CircleNode node = new CircleNode(i);
			insertNodeAtStart(head, node);
			printCircleList(head);
		}
		for(int i=0;i<10;i++){
			CircleNode node = new CircleNode(i);
			insertNodeAtEnd(head, node);
			printCircleList(head);
		}
		deleteAtEnd(head);
		printCircleList(head);
	}

}
