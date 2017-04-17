/**  
 * @Title:  DoubleList.java   
 * @Package cc.learnfly.list   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017��4��16�� ����7:51:26   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.list;


public class DoubleList {

	public static int listLength(DoubleNode head){
		int len = 0;
		DoubleNode temp = head;
		while(temp.next != null){
			len++;
			temp = temp.next;
		}
		return len;
		
	}
	/**
	 * 
	 * 打印链表
	 *
	 * @param head
	 */
	public static void printList(DoubleNode head){
		DoubleNode temp = head;
		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
	}
	/**
	 * 
	 * 在双向链表中插入一个节点
	 *
	 * @param head
	 * @param insertNode
	 * @param pos
	 * @return
	 */
	public static DoubleNode insertNode(DoubleNode head, DoubleNode insertNode, int pos){
		if(head == null){
			return insertNode;
		}
		if(pos < 1 || pos > listLength(head) + 1){
			System.out.println("插入位置不正确");
			return head;
		}
		if(pos == 1){
			insertNode.next = head;
			head.prev = insertNode;
			return insertNode;
		}else{
			DoubleNode temp = head;
			int count = 1;
			while(count < pos -1){
				temp = temp.next;
				count++;
			}
			DoubleNode current = temp.next;
			insertNode.next = temp.next;
			if(current != null){
				current.prev = insertNode;
			}
			temp.next = insertNode;
			insertNode.prev = temp;
		}
		return head;
	}
	
	public static DoubleNode deleteNode(DoubleNode head, int pos){
		if(pos < 1 || pos > listLength(head)){
			System.out.println("删除位置不正确");
			return head;
		}
		if(pos == 1){
			DoubleNode temp = head.next;
			head = null;
			temp.prev = null;
			return temp;
		}else{
			DoubleNode temp = head;
			int count = 1;
			while(count < pos ){
				temp = temp.next;
				count++;
			}
			DoubleNode current = temp.next;
			DoubleNode nextNode = current.next;
			temp.next = nextNode;
			if(nextNode != null){
				nextNode.prev = temp;
			}
			current = null;
		}
		return head;
		
	}
	public static void main(String[] args) {
		DoubleNode head = null;
		for(int i=0;i<10;i++){
			DoubleNode node = new DoubleNode(i);
			head = insertNode(head, node, 1);
			printList(head);
		}
		deleteNode(head, 3);
		printList(head);

	}

}
