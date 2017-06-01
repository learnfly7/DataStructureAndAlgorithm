package cc.learnfly.leetcode;

public class ReorderList {

	public void reorderList(ListNode head) {

			if(head == null || head.next == null){
				return;
			}
			//找到中间节点
			ListNode fast = head;
			ListNode slow = head;
			while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
			}
			// 拆分链表，并反转中间节点之后的链表
			ListNode after = slow.next;
			slow.next = null;
			ListNode pre = null;
			while(after != null){
			ListNode temp = after.next;
			after.next = pre;
			pre = after;
			after = temp;
			}
			// 合并两个链表
			ListNode first = head;
			after = pre;
			while(first != null && after != null){
				ListNode temp1 = first.next;
				ListNode temp2 = after.next;
				first.next = after;
				first = temp1;
				after.next = first;
				after = temp2;     
			
			}
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
