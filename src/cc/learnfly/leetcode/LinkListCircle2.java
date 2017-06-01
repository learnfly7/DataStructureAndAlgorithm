package cc.learnfly.leetcode;

public class LinkListCircle2 {

	public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
        	return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
        	slow = slow.next;
        	fast = fast.next.next;
        	//此时是相遇的点
        	if(slow == fast){
        		slow = head;
        		while(slow != fast){
        			slow = slow.next;
        			fast = fast.next;
        		}
        		return slow;
        	}
        }
        return null;
    }
}
