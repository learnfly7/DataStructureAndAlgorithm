package cc.learnfly.leetcode;

public class LinkListCircle {
	
	public boolean hasCycle(ListNode head) {
		if(head == null || head.next == null){
        	return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
        	slow = slow.next;
        	fast = fast.next.next;
        	//此时是相遇的点
        	if(slow == fast){
        		return true;
        	}
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
