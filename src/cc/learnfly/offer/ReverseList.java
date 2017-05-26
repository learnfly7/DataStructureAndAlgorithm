package cc.learnfly.offer;

public class ReverseList {

	public ListNode ReverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode pre = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return head;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
