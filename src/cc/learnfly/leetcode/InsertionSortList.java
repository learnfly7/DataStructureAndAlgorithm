package cc.learnfly.leetcode;

public class InsertionSortList {

	public ListNode insertionSortList(ListNode head) {
        if(head == null){
        	return head;
        }
        ListNode temp = head;
        ListNode next = null;
        //已排序的列表
        ListNode result = new ListNode(-1);
        while(temp != null){
        	next = temp.next;
        	ListNode in = result;
        	while(in.next != null && in.next.val < temp.val){
        		in = in.next;
        	}
        	temp.next = in.next;
        	in.next = temp;
        	temp = next;
        }
        return result.next;
    }
}
