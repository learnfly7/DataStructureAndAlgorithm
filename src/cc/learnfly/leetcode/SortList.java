package cc.learnfly.leetcode;

public class SortList {

	public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
        	return head;
        }
        ListNode mid = getMiddle(head);
        ListNode right = sortList(mid.next);
        mid.next = null;
        ListNode left = sortList(head);
        return merge(left, right);
    }
	
	public ListNode merge(ListNode l1, ListNode l2){
		if(l1 == null){
			return l1;
		}
		if(l2 == null){
			return l2;
		}
		ListNode temp = new ListNode(-1);
		ListNode result = temp;
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				temp.next = l1;
				l1 = l1.next;
			}else{
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		
		if(l1 != null){
			temp.next = l1;
		}
		if(l2 != null){
			temp.next = l2;
		}
		return result.next;
	}
	
	/**
	 * 
	 * 找到中间节点
	 *
	 * @param head
	 * @return
	 */
	public ListNode getMiddle(ListNode head){
		ListNode l1 = head;
		ListNode l2 = head.next;
		while(l2 != null && l2.next != null){
			l1 = l1.next;
			l2 = l2.next.next;
		}
		return l1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}