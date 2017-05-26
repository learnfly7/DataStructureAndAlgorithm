package cc.learnfly.offer;

public class FindKthToTail {

	public ListNode FindKthToTail(ListNode head,int k) {
		int i = 0;
		ListNode temp = head; 
		while(i < k){
			if(temp != null){
				i++;
				temp = temp.next;
			}else{
				return null;
			}
		}
		while(temp != null){
			head = head.next;
			temp = temp.next;
		}
		return head;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
