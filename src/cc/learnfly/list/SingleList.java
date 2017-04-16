/**  
 * @Title:  UnDirectionList.java   
 * @Package cc.learnfly.list   
 * @Description:    TODO   
 * @author: Schaffer chen     
 * @date:   2017年4月16日 下午7:24:11   
 * @version V1.0 
 * @Copyright: 2017  All rights reserved. 
 */
package cc.learnfly.list;


public class SingleList {
	/**
	 * 
	 * @Title: listLength   
	 * @Description: 求链表长度 
	 * @param: @param head
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	public static int listLength(SingleNode head){
		int len = 0;
		SingleNode temp = head;
		while(temp.next != null){
			len++;
			temp = temp.next;
		}
		return len;
		
	}
	/**
	 * 
	 * @Title: printList   
	 * @Description: 输出链表  
	 * @param: @param head      
	 * @return: void      
	 * @throws
	 */
	public static void printList(SingleNode head){
		SingleNode temp = head;
		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
	}
	/**
	 * 
	 * @Title: insertNode   
	 * @Description: 在单向链表中插入一个节点  
	 * @param: @param head 链表头结点
	 * @param: @param insertNode 待插入的节点
	 * @param: @param pos 插入位置
	 * @param: @return      
	 * @return: Node      
	 * @throws
	 */
	public static SingleNode insertNode(SingleNode head, SingleNode insertNode, int pos){
		if(head == null){
			return insertNode;
		}
		if(pos < 1 || pos > listLength(head) + 1){
			System.out.println("插入位置不合法");
			return head;
		}
		if(pos == 1){
			insertNode.next = head;
			return insertNode;
		}else{
			SingleNode temp = head;
			int count = 1;
			while(count < pos -1){
				temp = temp.next;
				count++;
			}
			insertNode.next = temp.next;
			temp.next = insertNode;
		}
		return head;
	}
	/**
	 * 
	 * @Title: deleteNode   
	 * @Description: 删除指定位置的节点 
	 * @param: @param head
	 * @param: @param pos
	 * @param: @return      
	 * @return: Node      
	 * @throws
	 */
	public static SingleNode deleteNode(SingleNode head, int pos){
		if(pos < 1 || pos > listLength(head)){
			System.out.println("删除位置不合法");
			return head;
		}
		if(pos == 1){
			SingleNode temp = head.next;
			head = null;
			return temp;
		}else{
			SingleNode temp = head;
			int count = 1;
			while(count < pos ){
				temp = temp.next;
				count++;
			}
			SingleNode current = temp.next;
			temp.next = current.next;
			current = null;
		}
		return head;
		
	}
	
	public static void main(String[] args) {
		SingleNode head = null;
		for(int i=0;i<10;i++){
			SingleNode node = new SingleNode(i);
			head = insertNode(head, node, 1);
			printList(head);
		}
		deleteNode(head, 3);
		printList(head);
	}
}
